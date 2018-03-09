/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AggCount implements Serializable {

    private static final long serialVersionUID = 716695188;

    private Long    count;
    private Integer nband;
    private Boolean excludeNodataValue;
    private Double  samplePercent;

    public AggCount() {}

    public AggCount(AggCount value) {
        this.count = value.count;
        this.nband = value.nband;
        this.excludeNodataValue = value.excludeNodataValue;
        this.samplePercent = value.samplePercent;
    }

    public AggCount(
        Long    count,
        Integer nband,
        Boolean excludeNodataValue,
        Double  samplePercent
    ) {
        this.count = count;
        this.nband = nband;
        this.excludeNodataValue = excludeNodataValue;
        this.samplePercent = samplePercent;
    }

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getNband() {
        return this.nband;
    }

    public void setNband(Integer nband) {
        this.nband = nband;
    }

    public Boolean getExcludeNodataValue() {
        return this.excludeNodataValue;
    }

    public void setExcludeNodataValue(Boolean excludeNodataValue) {
        this.excludeNodataValue = excludeNodataValue;
    }

    public Double getSamplePercent() {
        return this.samplePercent;
    }

    public void setSamplePercent(Double samplePercent) {
        this.samplePercent = samplePercent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AggCount (");

        sb.append(count);
        sb.append(", ").append(nband);
        sb.append(", ").append(excludeNodataValue);
        sb.append(", ").append(samplePercent);

        sb.append(")");
        return sb.toString();
    }
}