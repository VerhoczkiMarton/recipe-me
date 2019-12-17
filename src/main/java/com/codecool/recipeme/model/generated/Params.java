package com.codecool.recipeme.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Params {

    @JsonProperty("sane")
    private List<Object> sane;

    @JsonProperty("q")
    private List<String> Q;

    @JsonProperty("app_key")
    private List<String> appKey;

    @JsonProperty("health")
    private List<String> health;

    @JsonProperty("time")
    private List<String> time;

    @JsonProperty("app_id")
    private List<String> appId;

    public List<Object> getSane() {
        return sane;
    }

    public void setSane(List<Object> sane) {
        this.sane = sane;
    }

    public List<String> getQ() {
        return Q;
    }

    public void setQ(List<String> Q) {
        this.Q = Q;
    }

    public List<String> getAppKey() {
        return appKey;
    }

    public void setAppKey(List<String> appKey) {
        this.appKey = appKey;
    }

    public List<String> getHealth() {
        return health;
    }

    public void setHealth(List<String> health) {
        this.health = health;
    }

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<String> getAppId() {
        return appId;
    }

    public void setAppId(List<String> appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return
                "Params{" +
                        "sane = '" + sane + '\'' +
                        ",q = '" + Q + '\'' +
                        ",app_key = '" + appKey + '\'' +
                        ",health = '" + health + '\'' +
                        ",time = '" + time + '\'' +
                        ",app_id = '" + appId + '\'' +
                        "}";
    }
}