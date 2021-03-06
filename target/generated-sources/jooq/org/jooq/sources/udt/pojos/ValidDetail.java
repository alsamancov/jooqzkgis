/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt.pojos;


import com.vividsolutions.jts.geom.Geometry;

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
public class ValidDetail implements Serializable {

    private static final long serialVersionUID = -1713780668;

    private Boolean  valid;
    private String   reason;
    private Geometry location;

    public ValidDetail() {}

    public ValidDetail(ValidDetail value) {
        this.valid = value.valid;
        this.reason = value.reason;
        this.location = value.location;
    }

    public ValidDetail(
        Boolean  valid,
        String   reason,
        Geometry location
    ) {
        this.valid = valid;
        this.reason = reason;
        this.location = location;
    }

    public Boolean getValid() {
        return this.valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Geometry getLocation() {
        return this.location;
    }

    public void setLocation(Geometry location) {
        this.location = location;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ValidDetail (");

        sb.append(valid);
        sb.append(", ").append(reason);
        sb.append(", ").append(location);

        sb.append(")");
        return sb.toString();
    }
}
