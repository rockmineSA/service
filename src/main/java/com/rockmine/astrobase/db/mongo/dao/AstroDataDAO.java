package com.rockmine.astrobase.db.mongo.dao;

import com.mongodb.MongoClient;
import com.rockmine.astrobase.dto.AstroDataDTO;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by kkedari on 4/22/16.
 */
public class AstroDataDAO extends BasicDAO<AstroDataDTO,ObjectId> {

    private MongoTemplate mongoTemplate;

    public AstroDataDAO(MongoClient mongoClient, Morphia morphia, String dbName, MongoTemplate mongoTemplate) {
        super(mongoClient, morphia, dbName);
        this.mongoTemplate = mongoTemplate;
    }

    public MongoTemplate getMongoTemplate() {
        return this.mongoTemplate;
    }

    // Sample function on astroData Collection
    public AstroDataDTO getData(String objectId) {

        // FOR Reference
        Query query = new Query();

        query.addCriteria(new Criteria("ojectId").is(objectId));
        Datastore ds = this.getDatastore();
        AstroDataDTO astroDataDTO = ds.find(AstroDataDTO.class).field("objectId").equal(objectId).get();

        return  astroDataDTO;
    }
}
