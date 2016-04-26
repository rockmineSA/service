package com.rockmine.astrobase;

import com.mongodb.MongoClient;
import com.rockmine.astrobase.db.mongo.dao.AstroDataDAO;
import com.rockmine.astrobase.dto.AstroDataDTO;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.io.IOException;
import java.net.UnknownHostException;

/**
 * Created by kkedari on 4/22/16.
 */
@Configuration
public class AstroBaseConfig {
    @Value("${mongo.server}")
    private String mMongoServer;

    @Value("${mongo.port}")
    private int mMongoPort;

    @Value("${mongo.database}")
    private String databaseName;

    @Bean
    public MongoTemplate template() throws IOException {
        return new MongoTemplate(mongo(), databaseName);
    }

    @Bean
    public MongoClient mongo() throws UnknownHostException {
        return new MongoClient(mMongoServer, mMongoPort);
    }


    @Bean
    public AstroDataDAO astroBaseDAO() throws UnknownHostException, IOException {
        Morphia morphia = new Morphia();
        morphia.map(AstroDataDTO.class);
        morphia.getMapper().getOptions().setStoreEmpties( true);

        return new AstroDataDAO(mongo(), morphia, databaseName, template());
    }

}
