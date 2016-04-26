package com.rockmine.astrobase.controller;

import com.rockmine.astrobase.db.mongo.dao.AstroDataDAO;
import com.rockmine.astrobase.db.postgre.QueryFilter;
import com.rockmine.astrobase.db.postgre.QueryOrder;
import com.rockmine.astrobase.db.postgre.dao.AsteroidDAO;
import com.rockmine.astrobase.dto.Asteroid;
import com.rockmine.astrobase.dto.AsteroidOrbit;
import com.rockmine.astrobase.dto.AstroDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by kkedari on 4/22/16.
 */
@RestController
@RequestMapping("/api")
public class AstroBaseController {
    @Autowired
    private AstroDataDAO astroDataDAO;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping(value = "/astrobase/get", method = RequestMethod.GET)
    public String getData() {
        return "{\"data\" :\"Astro Data coming soon\"}";
    }

    @RequestMapping(value = "/rockmine/asteroid", method = RequestMethod.GET)
    public List<AsteroidOrbit> getAsteroidList(
            @RequestParam(value="limit", defaultValue = "100", required=false) String limit,
            @RequestParam(value="offset", defaultValue = "0", required=false) String offset,
            @RequestParam(value="spec", defaultValue = "", required=false) String spec
        ) throws IOException {
        
        List<QueryFilter> filters = new ArrayList<QueryFilter>();
        List<QueryOrder> orders = new ArrayList<QueryOrder>();

        if (spec.length() > 0){
            filters.add(new QueryFilter("asteroid", "spec_B","=",spec));
        }else{
            filters.add(new QueryFilter("asteroid", "spec_B","is","not null"));
        }
        filters.add(new QueryFilter("asteroid", "diameter","is","not null"));
        orders.add(new QueryOrder("asteroid.name", "asc"));

        return new AsteroidDAO(jdbcTemplate).getAsteroidOrbits(filters, orders, limit, offset);
    }


    @RequestMapping(value = "/rockmine/asteroid/{id}", method = RequestMethod.GET)
    public Asteroid getAsteroid(@PathVariable("id") String asteroidId) throws IOException {
        return new AsteroidDAO(jdbcTemplate).getAsteroidById(asteroidId);
    }

    @RequestMapping(value = "/rockmine/asteroid/{id}/specHeader", method = RequestMethod.GET)
    public Asteroid getAsteroidSpecHeader(@PathVariable("id") String asteroidId) throws IOException {
        return new AsteroidDAO(jdbcTemplate).getAsteroidById(asteroidId);
    }

    @RequestMapping(value = "/rockmine/asteroid/{id}/specComposition", method = RequestMethod.GET)
    public Asteroid getAsteroidSpecComposition(@PathVariable("id") String asteroidId) throws IOException {
        return new AsteroidDAO(jdbcTemplate).getAsteroidById(asteroidId);
    }

    @RequestMapping(value = "/rockmine/composition/{component}", method = RequestMethod.GET)
    public List<String> getAsteroidByComposition(@PathVariable("component") String component) throws IOException {

        List<QueryFilter> filters = new ArrayList<QueryFilter>();
        List<QueryOrder> orders = new ArrayList<QueryOrder>();

        filters.add(new QueryFilter("composition", "component","=",component));
        orders.add(new QueryOrder("composition.x", "asc"));

        return  new AsteroidDAO(jdbcTemplate).getAsteroids(filters, orders);

    }

}
