package com.rockmine.astrobase.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by kkedari on 4/22/16.
 * Updated by Eric Theis 4/24/16
 */
public class AsteroidOrbit {
    @JsonProperty("id")
    public String id;
    @JsonProperty("full_name")
    public String full_name;
    @JsonProperty("diameter")
    public Double diameter;
    @JsonProperty("spec_b")
    public String spec_b;
    @JsonProperty("spec_t")
    public String spec_t;
    @JsonProperty("epoch_cal")
    public String epoch_cal;
    @JsonProperty("e")
    public Double e;
    @JsonProperty("a")
    public Double a;
    @JsonProperty("q")
    public Double q;
    @JsonProperty("i")
    public Double i;
    @JsonProperty("om")
    public Double om;
    @JsonProperty("w")
    public Double w;
    @JsonProperty("ma")
    public Double ma;
    @JsonProperty("per")
    public Double per;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public String getSpec_b() {
        return spec_b;
    }

    public void setSpec_b(String spec_b) {
        this.spec_b = spec_b;
    }

    public String getSpec_t() {
        return spec_t;
    }

    public void setSpec_t(String spec_t) {
        this.spec_t = spec_t;
    }

    public String getEpoch_cal() {
        return epoch_cal;
    }

    public void setEpoch_cal(String epoch_cal) {
        this.epoch_cal = epoch_cal;
    }

    public Double getE() {
        return e;
    }

    public void setE(Double e) {
        this.e = e;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getQ() {
        return q;
    }

    public void setQ(Double q) {
        this.q = q;
    }

    public Double getI() {
        return i;
    }

    public void setI(Double i) {
        this.i = i;
    }

    public Double getOm() {
        return om;
    }

    public void setOm(Double om) {
        this.om = om;
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }

    public Double getMa() {
        return ma;
    }

    public void setMa(Double ma) {
        this.ma = ma;
    }

    public Double getPer() {
        return per;
    }

    public void setPer(Double per) {
        this.per = per;
    }

}
