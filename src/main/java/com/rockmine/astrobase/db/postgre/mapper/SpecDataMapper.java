package com.rockmine.astrobase.db.postgre.mapper;

import com.rockmine.astrobase.dto.SpecData;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kkedari on 4/23/16.
 */
public class SpecDataMapper implements RowMapper<SpecData> {

    public SpecData mapRow(ResultSet resultSet, int i) throws SQLException {
        SpecData specData = new SpecData();

        specData.setFileName(resultSet.getString("file_name"));
        specData.setJunk(resultSet.getString("junk"));
        specData.setWavelength(resultSet.getDouble("wavelength"));
        specData.setReflectance(resultSet.getDouble("reflectance"));
        specData.setUncertainity(resultSet.getDouble("uncertainity"));
        specData.setImagesUsed(resultSet.getInt("images_used"));

        return specData;
    }
}
