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
public class _StTile implements Serializable {

    private static final long serialVersionUID = -726864289;

    private Object _StTile;

    public _StTile() {}

    public _StTile(_StTile value) {
        this._StTile = value._StTile;
    }

    public _StTile(
        Object _StTile
    ) {
        this._StTile = _StTile;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object get_StTile() {
        return this._StTile;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void set_StTile(Object _StTile) {
        this._StTile = _StTile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_StTile (");

        sb.append(_StTile);

        sb.append(")");
        return sb.toString();
    }
}
