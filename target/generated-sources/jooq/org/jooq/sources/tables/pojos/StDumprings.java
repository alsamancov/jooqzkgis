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
public class StDumprings implements Serializable {

    private static final long serialVersionUID = 137769823;

    private Object stDumprings;

    public StDumprings() {}

    public StDumprings(StDumprings value) {
        this.stDumprings = value.stDumprings;
    }

    public StDumprings(
        Object stDumprings
    ) {
        this.stDumprings = stDumprings;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getStDumprings() {
        return this.stDumprings;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setStDumprings(Object stDumprings) {
        this.stDumprings = stDumprings;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StDumprings (");

        sb.append(stDumprings);

        sb.append(")");
        return sb.toString();
    }
}