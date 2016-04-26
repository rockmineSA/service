package com.rockmine.astrobase.dto;

/**
 * Created by kkedari on 4/23/16.
 */
public class SpecData {
    private String fileName;

    private String junk;

    private Double wavelength;

    private Double reflectance;

    private Double uncertainity;

    private int imagesUsed;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getJunk() {
        return junk;
    }

    public void setJunk(String junk) {
        this.junk = junk;
    }

    public Double getWavelength() {
        return wavelength;
    }

    public void setWavelength(Double wavelength) {
        this.wavelength = wavelength;
    }

    public Double getReflectance() {
        return reflectance;
    }

    public void setReflectance(Double reflectance) {
        this.reflectance = reflectance;
    }

    public Double getUncertainity() {
        return uncertainity;
    }

    public void setUncertainity(Double uncertainity) {
        this.uncertainity = uncertainity;
    }

    public int getImagesUsed() {
        return imagesUsed;
    }

    public void setImagesUsed(int imagesUsed) {
        this.imagesUsed = imagesUsed;
    }
}
