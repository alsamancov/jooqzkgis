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
public class Summarystats implements Serializable {

    private static final long serialVersionUID = -1379203792;

    private Long   count;
    private Double sum;
    private Double mean;
    private Double stddev;
    private Double min;
    private Double max;

    public Summarystats() {}

    public Summarystats(Summarystats value) {
        this.count = value.count;
        this.sum = value.sum;
        this.mean = value.mean;
        this.stddev = value.stddev;
        this.min = value.min;
        this.max = value.max;
    }

    public Summarystats(
        Long   count,
        Double sum,
        Double mean,
        Double stddev,
        Double min,
        Double max
    ) {
        this.count = count;
        this.sum = sum;
        this.mean = mean;
        this.stddev = stddev;
        this.min = min;
        this.max = max;
    }

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Double getSum() {
        return this.sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getMean() {
        return this.mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }

    public Double getStddev() {
        return this.stddev;
    }

    public void setStddev(Double stddev) {
        this.stddev = stddev;
    }

    public Double getMin() {
        return this.min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return this.max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Summarystats (");

        sb.append(count);
        sb.append(", ").append(sum);
        sb.append(", ").append(mean);
        sb.append(", ").append(stddev);
        sb.append(", ").append(min);
        sb.append(", ").append(max);

        sb.append(")");
        return sb.toString();
    }
}