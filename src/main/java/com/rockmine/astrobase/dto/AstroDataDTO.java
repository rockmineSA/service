package com.rockmine.astrobase.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by kkedari on 4/22/16.
 */
@Entity
public class AstroDataDTO {
    @Id
    @JsonProperty("id")
    private ObjectId id;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
