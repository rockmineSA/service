package com.rockmine.astrobase.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by kkedari on 4/22/16.
 */
public class Asteroid {
    @JsonProperty("id")
    public String id;
    @JsonProperty("spkid")
    public String spkid;
    @JsonProperty("full_name")
    public String full_name;
    @JsonProperty("pdes")
    public String pdes;
    @JsonProperty("name")
    public String name;
    @JsonProperty("prefix")
    public String prefix;
    @JsonProperty("neo")
    public String neo;
    @JsonProperty("pha")
    public String pha;
    @JsonProperty("h")
    public Double h;
    @JsonProperty("g")
    public Double g;
    @JsonProperty("m1")
    public Double m1;
    @JsonProperty("m2")
    public Double m2;
    @JsonProperty("k1")
    public Double k1;
    @JsonProperty("k2")
    public Double k2;
    @JsonProperty("pc")
    public Double pc;
    @JsonProperty("diameter")
    public Double diameter;
    @JsonProperty("extent")
    public String extent;
    @JsonProperty("albedo")
    public Double albedo;
    @JsonProperty("rot_per")
    public Double rot_per;
    @JsonProperty("gm")
    public String gm;
    @JsonProperty("bv")
    public Double bv;
    @JsonProperty("ub")
    public Double ub;
    @JsonProperty("ir")
    public String ir;
    @JsonProperty("spec_b")
    public String spec_b;
    @JsonProperty("spec_t")
    public String spec_t;
    @JsonProperty("h_sigma")
    public Double h_sigma;
    @JsonProperty("diameter_sigma")
    public Double diameter_sigma;
    @JsonProperty("orbit_id")
    public String orbit_id;
    @JsonProperty("epoch")
    public String epoch;
    @JsonProperty("epoch_mjd")
    public String epoch_mjd;
    @JsonProperty("epoch_cal")
    public String epoch_cal;
    @JsonProperty("equinox")
    public String equinox;
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
    @JsonProperty("ad")
    public Double ad;
    @JsonProperty("n")
    public Double n;
    @JsonProperty("tp")
    public Double tp;
    @JsonProperty("tp_cal")
    public String tp_cal;
    @JsonProperty("per")
    public Double per;
    @JsonProperty("per_y")
    public Double per_y;
    @JsonProperty("moid")
    public Double moid;
    @JsonProperty("moid_ld")
    public Double moid_ld;
    @JsonProperty("moid_jup")
    public Double moid_jup;
    @JsonProperty("t_jup")
    public Double t_jup;
    @JsonProperty("sigma_e")
    public String sigma_e;
    @JsonProperty("sigma_a")
    public String sigma_a;
    @JsonProperty("sigma_q")
    public String sigma_q;
    @JsonProperty("sigma_i")
    public String sigma_i;
    @JsonProperty("sigma_om")
    public String sigma_om;
    @JsonProperty("sigma_w")
    public String sigma_w;
    @JsonProperty("sigma_ma")
    public String sigma_ma;
    @JsonProperty("sigma_ad")
    public String sigma_ad;
    @JsonProperty("sigma_n")
    public String sigma_n;
    @JsonProperty("sigma_tp")
    public String sigma_tp;
    @JsonProperty("sigma_per")
    public String sigma_per;
    @JsonProperty("class")
    public String className;
    @JsonProperty("producer")
    public String producer;
    @JsonProperty("data_arc")
    public Integer data_arc;
    @JsonProperty("first_obs")
    public Long first_obs;
    @JsonProperty("last_obs")
    public Long last_obs;
    @JsonProperty("n_obs_used")
    public Integer n_obs_used;
    @JsonProperty("n_del_obs_used")
    public Integer n_del_obs_used;
    @JsonProperty("n_dop_obs_used")
    public Integer n_dop_obs_used;
    @JsonProperty("condition_code")
    public String condition_code;
    @JsonProperty("rms")
    public Double rms;
    @JsonProperty("two_body")
    public String two_body;
    @JsonProperty("a1")
    public String a1;
    @JsonProperty("a2")
    public String a2;
    @JsonProperty("a3")
    public String a3;
    @JsonProperty("dt")
    public String dt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpkid() {
        return spkid;
    }

    public void setSpkid(String spkid) {
        this.spkid = spkid;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPdes() {
        return pdes;
    }

    public void setPdes(String pdes) {
        this.pdes = pdes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getNeo() {
        return neo;
    }

    public void setNeo(String neo) {
        this.neo = neo;
    }

    public String getPha() {
        return pha;
    }

    public void setPha(String pha) {
        this.pha = pha;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getG() {
        return g;
    }

    public void setG(Double g) {
        this.g = g;
    }

    public Double getM1() {
        return m1;
    }

    public void setM1(Double m1) {
        this.m1 = m1;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    public Double getK1() {
        return k1;
    }

    public void setK1(Double k1) {
        this.k1 = k1;
    }

    public Double getK2() {
        return k2;
    }

    public void setK2(Double k2) {
        this.k2 = k2;
    }

    public Double getPc() {
        return pc;
    }

    public void setPc(Double pc) {
        this.pc = pc;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public String getExtent() {
        return extent;
    }

    public void setExtent(String extent) {
        this.extent = extent;
    }

    public Double getAlbedo() {
        return albedo;
    }

    public void setAlbedo(Double albedo) {
        this.albedo = albedo;
    }

    public Double getRot_per() {
        return rot_per;
    }

    public void setRot_per(Double rot_per) {
        this.rot_per = rot_per;
    }

    public String getGm() {
        return gm;
    }

    public void setGm(String gm) {
        this.gm = gm;
    }

    public Double getBv() {
        return bv;
    }

    public void setBv(Double bv) {
        this.bv = bv;
    }

    public Double getUb() {
        return ub;
    }

    public void setUb(Double ub) {
        this.ub = ub;
    }

    public String getIr() {
        return ir;
    }

    public void setIr(String ir) {
        this.ir = ir;
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

    public Double getH_sigma() {
        return h_sigma;
    }

    public void setH_sigma(Double h_sigma) {
        this.h_sigma = h_sigma;
    }

    public Double getDiameter_sigma() {
        return diameter_sigma;
    }

    public void setDiameter_sigma(Double diameter_sigma) {
        this.diameter_sigma = diameter_sigma;
    }

    public String getOrbit_id() {
        return orbit_id;
    }

    public void setOrbit_id(String orbit_id) {
        this.orbit_id = orbit_id;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getEpoch_mjd() {
        return epoch_mjd;
    }

    public void setEpoch_mjd(String epoch_mjd) {
        this.epoch_mjd = epoch_mjd;
    }

    public String getEpoch_cal() {
        return epoch_cal;
    }

    public void setEpoch_cal(String epoch_cal) {
        this.epoch_cal = epoch_cal;
    }

    public String getEquinox() {
        return equinox;
    }

    public void setEquinox(String equinox) {
        this.equinox = equinox;
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

    public Double getAd() {
        return ad;
    }

    public void setAd(Double ad) {
        this.ad = ad;
    }

    public Double getN() {
        return n;
    }

    public void setN(Double n) {
        this.n = n;
    }

    public Double getTp() {
        return tp;
    }

    public void setTp(Double tp) {
        this.tp = tp;
    }

    public String getTp_cal() {
        return tp_cal;
    }

    public void setTp_cal(String tp_cal) {
        this.tp_cal = tp_cal;
    }

    public Double getPer() {
        return per;
    }

    public void setPer(Double per) {
        this.per = per;
    }

    public Double getPer_y() {
        return per_y;
    }

    public void setPer_y(Double per_y) {
        this.per_y = per_y;
    }

    public Double getMoid() {
        return moid;
    }

    public void setMoid(Double moid) {
        this.moid = moid;
    }

    public Double getMoid_ld() {
        return moid_ld;
    }

    public void setMoid_ld(Double moid_ld) {
        this.moid_ld = moid_ld;
    }

    public Double getMoid_jup() {
        return moid_jup;
    }

    public void setMoid_jup(Double moid_jup) {
        this.moid_jup = moid_jup;
    }

    public Double getT_jup() {
        return t_jup;
    }

    public void setT_jup(Double t_jup) {
        this.t_jup = t_jup;
    }

    public String getSigma_e() {
        return sigma_e;
    }

    public void setSigma_e(String sigma_e) {
        this.sigma_e = sigma_e;
    }

    public String getSigma_a() {
        return sigma_a;
    }

    public void setSigma_a(String sigma_a) {
        this.sigma_a = sigma_a;
    }

    public String getSigma_q() {
        return sigma_q;
    }

    public void setSigma_q(String sigma_q) {
        this.sigma_q = sigma_q;
    }

    public String getSigma_i() {
        return sigma_i;
    }

    public void setSigma_i(String sigma_i) {
        this.sigma_i = sigma_i;
    }

    public String getSigma_om() {
        return sigma_om;
    }

    public void setSigma_om(String sigma_om) {
        this.sigma_om = sigma_om;
    }

    public String getSigma_w() {
        return sigma_w;
    }

    public void setSigma_w(String sigma_w) {
        this.sigma_w = sigma_w;
    }

    public String getSigma_ma() {
        return sigma_ma;
    }

    public void setSigma_ma(String sigma_ma) {
        this.sigma_ma = sigma_ma;
    }

    public String getSigma_ad() {
        return sigma_ad;
    }

    public void setSigma_ad(String sigma_ad) {
        this.sigma_ad = sigma_ad;
    }

    public String getSigma_n() {
        return sigma_n;
    }

    public void setSigma_n(String sigma_n) {
        this.sigma_n = sigma_n;
    }

    public String getSigma_tp() {
        return sigma_tp;
    }

    public void setSigma_tp(String sigma_tp) {
        this.sigma_tp = sigma_tp;
    }

    public String getSigma_per() {
        return sigma_per;
    }

    public void setSigma_per(String sigma_per) {
        this.sigma_per = sigma_per;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getData_arc() {
        return data_arc;
    }

    public void setData_arc(Integer data_arc) {
        this.data_arc = data_arc;
    }

    public Long getFirst_obs() {
        return first_obs;
    }

    public void setFirst_obs(Long first_obs) {
        this.first_obs = first_obs;
    }

    public Long getLast_obs() {
        return last_obs;
    }

    public void setLast_obs(Long last_obs) {
        this.last_obs = last_obs;
    }

    public Integer getN_obs_used() {
        return n_obs_used;
    }

    public void setN_obs_used(Integer n_obs_used) {
        this.n_obs_used = n_obs_used;
    }

    public Integer getN_del_obs_used() {
        return n_del_obs_used;
    }

    public void setN_del_obs_used(Integer n_del_obs_used) {
        this.n_del_obs_used = n_del_obs_used;
    }

    public Integer getN_dop_obs_used() {
        return n_dop_obs_used;
    }

    public void setN_dop_obs_used(Integer n_dop_obs_used) {
        this.n_dop_obs_used = n_dop_obs_used;
    }

    public String getCondition_code() {
        return condition_code;
    }

    public void setCondition_code(String condition_code) {
        this.condition_code = condition_code;
    }

    public Double getRms() {
        return rms;
    }

    public void setRms(Double rms) {
        this.rms = rms;
    }

    public String getTwo_body() {
        return two_body;
    }

    public void setTwo_body(String two_body) {
        this.two_body = two_body;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }
}
