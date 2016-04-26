package com.rockmine.astrobase.db.postgre.dao;

import com.rockmine.astrobase.db.postgre.QueryFilter;
import com.rockmine.astrobase.db.postgre.QueryOrder;
import com.rockmine.astrobase.db.postgre.mapper.AsteroidMapper;
import com.rockmine.astrobase.db.postgre.mapper.SpecCompositionMapper;
import com.rockmine.astrobase.db.postgre.mapper.SpecDataMapper;
import com.rockmine.astrobase.dto.Asteroid;
import com.rockmine.astrobase.dto.AsteroidOrbit;
import com.rockmine.astrobase.dto.SpecComposition;
import com.rockmine.astrobase.dto.SpecData;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.*;

/**
 * Created by kkedari on 4/22/16.
 */
public class AsteroidDAO {

    private JdbcTemplate jdbcTemplate;

    public AsteroidDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Asteroid getAsteroidById(String asteroidId) {
        //TODO: implement filters

        String sql = "select * from asteroid where id = ?";

        List<Object> args = new ArrayList<Object>();
        args.add(asteroidId);

        Asteroid row = jdbcTemplate.queryForObject(sql, args.toArray(), new AsteroidMapper());


        return row;
    }


    public List<String> getAsteroids(List<QueryFilter> filters, List<QueryOrder> orders) {
        List<String> fields = new ArrayList<String>();
        fields.add("asteroid.id");

        String sql = getQuery(fields, filters, orders);
        Set<String> ids = new HashSet<String>();

        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(sql);

        while(sqlRowSet.next()) {
            ids.add(sqlRowSet.getString("id"));
        }

        return new ArrayList<String>(ids);
    }

    public List<AsteroidOrbit> getAsteroidOrbits(List<QueryFilter> filters, List<QueryOrder> orders, String limit, String offset) {
        List<String> fields = new ArrayList<String>();
        fields.add("asteroid.id");
        fields.add("asteroid.full_name");
        fields.add("asteroid.diameter");
        fields.add("asteroid.spec_B");
        fields.add("asteroid.spec_T");
        fields.add("asteroid.epoch_cal");
        fields.add("asteroid.e");
        fields.add("asteroid.a");
        fields.add("asteroid.q");
        fields.add("asteroid.i");
        fields.add("asteroid.om");
        fields.add("asteroid.w");
        fields.add("asteroid.ma");
        fields.add("asteroid.per");

        String sql = getQuery(fields, filters, orders, limit, offset);
        Set<AsteroidOrbit> orbits = new HashSet<AsteroidOrbit>();

        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(sql);

        while(sqlRowSet.next()) {
            AsteroidOrbit orbit = new AsteroidOrbit();
            orbit.setId(sqlRowSet.getString("id"));
            orbit.setFull_name(sqlRowSet.getString("full_name"));
            orbit.setDiameter(sqlRowSet.getDouble("diameter"));
            orbit.setSpec_b(sqlRowSet.getString("spec_B"));
            orbit.setSpec_t(sqlRowSet.getString("spec_T"));
            orbit.setEpoch_cal(sqlRowSet.getString("epoch_cal"));
            orbit.setE(sqlRowSet.getDouble("e"));
            orbit.setA(sqlRowSet.getDouble("a"));
            orbit.setQ(sqlRowSet.getDouble("q"));
            orbit.setI(sqlRowSet.getDouble("i"));
            orbit.setOm(sqlRowSet.getDouble("om"));
            orbit.setW(sqlRowSet.getDouble("w"));
            orbit.setMa(sqlRowSet.getDouble("ma"));
            orbit.setPer(sqlRowSet.getDouble("per"));
            orbits.add(orbit);
        }

        return new ArrayList<AsteroidOrbit>(orbits);
    }

    public List<Asteroid> getAsteroidData(List<QueryFilter> filters, List<QueryOrder> orders) {
        return null;
    }

    public List<Map<String, Object>> getAsteroidData(List<String> fields, List<QueryFilter> filters, List<QueryOrder> orders) {
        return null;
    }
    public SpecComposition getSpecComposition(String spec) {
        String sql = "SELECT SPEC, COMPONENT, X FROM COMPOSITION WHERE spec=?";
        List<Object> args = new ArrayList<Object>();
        args.add(spec);

        SpecComposition specComposition = jdbcTemplate.queryForObject(sql, args.toArray(), new SpecCompositionMapper());

        // TODO: post processing the record

        return specComposition;

    }

    public SpecData getSpecData(String filename) {
        String sql = "SELECT * FROM SPEC_DATA WHERE FILENAME=?";
        List<Object> args = new ArrayList<Object>();
        args.add(filename);

        SpecData specData = jdbcTemplate.queryForObject(sql, args.toArray(), new SpecDataMapper());

        return specData;

    }

    public Asteroid getAsteroids(List<QueryFilter> filters) {
        //TODO: implement filters

        return null;
    }

    private String getQuery(List<String> fields, List<QueryFilter> filters , List<QueryOrder> orders, String limit, String offset) {
        
        return getQuery(fields, filters, orders) + " limit " + limit + " offset " + offset + ";";
        
    }

    private String getQuery(List<String> fields, List<QueryFilter> filters , List<QueryOrder> orders) {
        List<String> tables = new ArrayList<String>();
        tables.add("asteroid");
        StringBuilder select = new StringBuilder("Select ");

        for(String field: fields) {
            select.append(field).append(",");
        }

        select.replace(select.length() - 1, select.length(), "");


        StringBuilder from = new StringBuilder(" from ");

        StringBuilder where = new StringBuilder();

        for(QueryFilter queryFilter : filters ) {
            if(where.length() > 0){
                where.append(" and ");
            }

            where.append(queryFilter.getTable())
                    .append(".").append(queryFilter.getColumn())
                    .append(" ").append(queryFilter.getOperator()).append(" ");

            if(queryFilter.getOperator().toLowerCase().equals("is")) {
                if(queryFilter.getValue().toString().toLowerCase().equals("not null")){
                    where.append("not null");
                }else{
                    where.append("null");
                }
            } else {
                if(queryFilter.getValue().getClass() == String.class) {
                    where.append("'").append(queryFilter.getValue()).append("'");

                } else {
                    where.append(queryFilter.getValue());
                }
            }

            if(!tables.contains(queryFilter.getTable())) {
                tables.add(queryFilter.getTable());
            }
        }

        where.insert(0, " where ");
        // Hack but ok for the demo
        for(String table: tables) {
            from.append(table).append(" ").append(table).append(",");

            if(table.equals("composition")) {
                where.append(" and asteroid.spec_b = composition.spec");
            }
        }

        from.replace(from.length() -1, from.length(), "");

        if(orders.size() >0 ) {
            where.append(" order by ");
            for (QueryOrder order : orders) {
                where.append(order.getColumn()).append(" ").append(order.getType()).append(",");
            }
        }

        where.replace(where.length() - 1, where.length(), "");
        return select.append(from).append(where).toString();
    }
}
