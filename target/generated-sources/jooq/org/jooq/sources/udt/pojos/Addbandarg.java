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
public class Addbandarg implements Serializable {

    private static final long serialVersionUID = 1572032352;

    private Integer index;
    private String  pixeltype;
    private Double  initialvalue;
    private Double  nodataval;

    public Addbandarg() {}

    public Addbandarg(Addbandarg value) {
        this.index = value.index;
        this.pixeltype = value.pixeltype;
        this.initialvalue = value.initialvalue;
        this.nodataval = value.nodataval;
    }

    public Addbandarg(
        Integer index,
        String  pixeltype,
        Double  initialvalue,
        Double  nodataval
    ) {
        this.index = index;
        this.pixeltype = pixeltype;
        this.initialvalue = initialvalue;
        this.nodataval = nodataval;
    }

    public Integer getIndex() {
        return this.index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getPixeltype() {
        return this.pixeltype;
    }

    public void setPixeltype(String pixeltype) {
        this.pixeltype = pixeltype;
    }

    public Double getInitialvalue() {
        return this.initialvalue;
    }

    public void setInitialvalue(Double initialvalue) {
        this.initialvalue = initialvalue;
    }

    public Double getNodataval() {
        return this.nodataval;
    }

    public void setNodataval(Double nodataval) {
        this.nodataval = nodataval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Addbandarg (");

        sb.append(index);
        sb.append(", ").append(pixeltype);
        sb.append(", ").append(initialvalue);
        sb.append(", ").append(nodataval);

        sb.append(")");
        return sb.toString();
    }
}
