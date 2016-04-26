package com.rockmine.astrobase.db.postgre.mapper;

import com.rockmine.astrobase.dto.Asteroid;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kkedari on 4/22/16.
 */
public class AsteroidMapper implements RowMapper<Asteroid> {

    public Asteroid mapRow(ResultSet rs, int rowNumber) throws SQLException {

        Asteroid asteroid = new Asteroid();

        asteroid.setId(rs.getString("id"));
        asteroid.setSpkid(rs.getString("spkid"));
        asteroid.setFull_name(rs.getString("full_name"));
        asteroid.setPdes(rs.getString("pdes"));
        asteroid.setName(rs.getString("name"));
        asteroid.setPrefix(rs.getString("prefix"));
        asteroid.setNeo(rs.getString("neo"));
        asteroid.setPha(rs.getString("pha"));
        asteroid.setH(rs.getDouble("h"));
        asteroid.setG(rs.getDouble("g"));
        asteroid.setM1(rs.getDouble("m1"));
        asteroid.setM2(rs.getDouble("m2"));
        asteroid.setK1(rs.getDouble("k1"));
        asteroid.setK2(rs.getDouble("k2"));
        asteroid.setPc(rs.getDouble("pc"));
        asteroid.setDiameter(rs.getDouble("diameter"));
        asteroid.setExtent(rs.getString("extent"));
        asteroid.setAlbedo(rs.getDouble("albedo"));
        asteroid.setRot_per(rs.getDouble("rot_per"));
        asteroid.setGm(rs.getString("gm"));
        asteroid.setBv(rs.getDouble("bv"));
        asteroid.setUb(rs.getDouble("ub"));
        asteroid.setIr(rs.getString("ir"));
        asteroid.setSpec_b(rs.getString("spec_b"));
        asteroid.setSpec_t(rs.getString("spec_t"));
        asteroid.setH_sigma(rs.getDouble("h_sigma"));
        asteroid.setDiameter_sigma(rs.getDouble("diameter_sigma"));
        asteroid.setOrbit_id(rs.getString("orbit_id"));
        asteroid.setEpoch(rs.getString("epoch"));
        asteroid.setEpoch_mjd(rs.getString("epoch_mjd"));
        asteroid.setEpoch_cal(rs.getString("epoch_cal"));
        asteroid.setEquinox(rs.getString("equinox"));
        asteroid.setE(rs.getDouble("e"));
        asteroid.setA(rs.getDouble("a"));
        asteroid.setQ(rs.getDouble("q"));
        asteroid.setI(rs.getDouble("i"));
        asteroid.setOm(rs.getDouble("om"));
        asteroid.setW(rs.getDouble("w"));
        asteroid.setMa(rs.getDouble("ma"));
        asteroid.setAd(rs.getDouble("ad"));
        asteroid.setN(rs.getDouble("n"));
        asteroid.setTp(rs.getDouble("tp"));
        asteroid.setTp_cal(rs.getString("tp_cal"));
        asteroid.setPer(rs.getDouble("per"));
        asteroid.setPer_y(rs.getDouble("per_y"));
        asteroid.setMoid(rs.getDouble("moid"));
        asteroid.setMoid_ld(rs.getDouble("moid_ld"));
        asteroid.setMoid_jup(rs.getDouble("moid_jup"));
        asteroid.setT_jup(rs.getDouble("t_jup"));
        asteroid.setSigma_e(rs.getString("sigma_e"));
        asteroid.setSigma_a(rs.getString("sigma_a"));
        asteroid.setSigma_q(rs.getString("sigma_q"));
        asteroid.setSigma_i(rs.getString("sigma_i"));
        asteroid.setSigma_om(rs.getString("sigma_om"));
        asteroid.setSigma_w(rs.getString("sigma_w"));
        asteroid.setSigma_ma(rs.getString("sigma_ma"));
        asteroid.setSigma_ad(rs.getString("sigma_ad"));
        asteroid.setSigma_n(rs.getString("sigma_n"));
        asteroid.setSigma_tp(rs.getString("sigma_tp"));
        asteroid.setSigma_per(rs.getString("sigma_per"));
        asteroid.setClassName(rs.getString("class"));
        asteroid.setProducer(rs.getString("producer"));
        asteroid.setData_arc(rs.getInt("data_arc"));
        asteroid.setFirst_obs(rs.getTimestamp("first_obs").getTime());
        asteroid.setLast_obs(rs.getTimestamp("last_obs").getTime());
        asteroid.setN_obs_used(rs.getInt("n_obs_used"));
        asteroid.setN_del_obs_used(rs.getInt("n_del_obs_used"));
        asteroid.setN_dop_obs_used(rs.getInt("n_dop_obs_used"));
        asteroid.setCondition_code(rs.getString("condition_code"));
        asteroid.setRms(rs.getDouble("rms"));
        asteroid.setTwo_body(rs.getString("two_body"));
        asteroid.setA1(rs.getString("a1"));
        asteroid.setA2(rs.getString("a2"));
        asteroid.setA3(rs.getString("a3"));
        asteroid.setDt(rs.getString("dt"));

        return asteroid;
    }
}
