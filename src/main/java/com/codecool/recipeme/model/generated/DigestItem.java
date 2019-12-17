package com.codecool.recipeme.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class DigestItem {

    @JsonProperty("schemaOrgTag")
    private String schemaOrgTag;

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

    @JsonProperty("sub")
    private List<SubItem> sub;

    public String getSchemaOrgTag() {
        return schemaOrgTag;
    }

    public void setSchemaOrgTag(String schemaOrgTag) {
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

    public List<SubItem> getSub() {
        return sub;
    }

    public void setSub(List<SubItem> sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return
                "DigestItem{" +
                        "schemaOrgTag = '" + schemaOrgTag + '\'' +
                        ",total = '" + total + '\'' +
                        ",unit = '" + unit + '\'' +
                        ",daily = '" + daily + '\'' +
                        ",hasRDI = '" + hasRDI + '\'' +
                        ",label = '" + label + '\'' +
                        ",tag = '" + tag + '\'' +
                        ",sub = '" + sub + '\'' +
                        "}";
    }
}