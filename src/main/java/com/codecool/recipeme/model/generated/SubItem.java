package com.codecool.recipeme.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SubItem {

    @JsonProperty("schemaOrgTag")
    private Object schemaOrgTag;

    @JsonProperty("total")
    private double total;

    @JsonProperty("unit")
    private String unit;

    @JsonProperty("daily")
    private double daily;

    @JsonProperty("hasRDI")
    private boolean hasRDI;

    @JsonProperty("label")
    private String label;

    @JsonProperty("tag")
    private String tag;

    public Object getSchemaOrgTag() {
        return schemaOrgTag;
    }

    public void setSchemaOrgTag(Object schemaOrgTag) {
        this.schemaOrgTag = schemaOrgTag;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getDaily() {
        return daily;
    }

    public void setDaily(double daily) {
        this.daily = daily;
    }

    public boolean isHasRDI() {
        return hasRDI;
    }

    public void setHasRDI(boolean hasRDI) {
        this.hasRDI = hasRDI;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return
                "SubItem{" +
                        "schemaOrgTag = '" + schemaOrgTag + '\'' +
                        ",total = '" + total + '\'' +
                        ",unit = '" + unit + '\'' +
                        ",daily = '" + daily + '\'' +
                        ",hasRDI = '" + hasRDI + '\'' +
                        ",label = '" + label + '\'' +
                        ",tag = '" + tag + '\'' +
                        "}";
    }
}