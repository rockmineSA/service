package com.rockmine.astrobase.db.postgre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by kkedari on 4/22/16.
 */
@Configuration
public class PostGreConfiguration {

    @Value("${source.db.server}")
    private String dbServer;

    @Value("${source.db.port}")
    private int dbPort;

    @Value("${source.db.username}")
    private String dbUserName;

    @Value("${source.db.password}")
    private String dbPassword;

    @Value("${source.db.driverClassName}")
    private String dbDriverClassName;

    @Value("${source.db.type}")
    private String dbType;

    @Value("${source.db.database}")
    private String dbName;

    @Bean
    public JdbcTemplate sourceJdbcTemplate(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dbDriverClassName);
        dataSource.setUrl("jdbc:" + dbType + "://" + dbServer + ":" + dbPort +"/" + dbName );
        dataSource.setUsername(dbUserName);
        dataSource.setPassword(dbPassword);

        return new JdbcTemplate(dataSource);
    }



}


