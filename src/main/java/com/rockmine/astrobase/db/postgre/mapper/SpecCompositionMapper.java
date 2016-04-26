package com.rockmine.astrobase.db.postgre.mapper;

import com.rockmine.astrobase.dto.SpecComposition;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kkedari on 4/23/16.
 */
public class SpecCompositionMapper implements RowMapper<SpecComposition> {
    public SpecComposition mapRow(ResultSet resultSet, int i) throws SQLException {

        SpecComposition specComposition = new SpecComposition();

        specComposition.setSpec(resultSet.getString("spec"));
        specComposition.setComponent(resultSet.getString("component"));
        specComposition.setX(resultSet.getFloat("x"));

        return specComposition;
    }
}
