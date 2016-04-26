package com.rockmine.astrobase.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by kkedari on 4/23/16.
 */
public class SpecComposition {
    @JsonProperty("spec")
    private String spec;

    @JsonProperty("spec")
    private String component;

    @JsonProperty("spec")
    private Float x;

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }
}
