package com.codecool.recipeme.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Response {

    @JsonProperty("hits")
    private List<HitsItem> hits;

    @JsonProperty("q")
    private String Q;

    @JsonProperty("more")
    private boolean more;

    @JsonProperty("count")
    private int count;

    @JsonProperty("from")
    private int from;

    @JsonProperty("to")
    private int to;

    @JsonProperty("params")
    private Params params;

    public List<HitsItem> getHits() {
        return hits;
    }

    public void setHits(List<HitsItem> hits) {
        this.hits = hits;
    }

    public String getQ() {
        return Q;
    }

    public void setQ(String Q) {
        this.Q = Q;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "hits = '" + hits + '\'' +
                        ",q = '" + Q + '\'' +
                        ",more = '" + more + '\'' +
                        ",count = '" + count + '\'' +
                        ",from = '" + from + '\'' +
                        ",to = '" + to + '\'' +
                        ",params = '" + params + '\'' +
                        "}";
    }
}