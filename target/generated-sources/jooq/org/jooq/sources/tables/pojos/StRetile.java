/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.pojos;


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
public class StRetile implements Serializable {

    private static final long serialVersionUID = -291488997;

    private Object stRetile;

    public StRetile() {}

    public StRetile(StRetile value) {
        this.stRetile = value.stRetile;
    }

    public StRetile(
        Object stRetile
    ) {
        this.stRetile = stRetile;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getStRetile() {
        return this.stRetile;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setStRetile(Object stRetile) {
        this.stRetile = stRetile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StRetile (");

        sb.append(stRetile);

        sb.append(")");
        return sb.toString();
    }
}