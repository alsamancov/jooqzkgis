/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import com.vividsolutions.jts.geom.Geometry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.sources.Public;


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
public class StWkbtosql extends AbstractRoutine<Geometry> {

    private static final long serialVersionUID = 1859291541;

    /**
     * The parameter <code>public.st_wkbtosql.RETURN_VALUE</code>.
     */
    public static final Parameter<Geometry> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_wkbtosql.wkb</code>.
     */
    public static final Parameter<byte[]> WKB = createParameter("wkb", org.jooq.impl.SQLDataType.BLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public StWkbtosql() {
        super("st_wkbtosql", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), new GeometryConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(WKB);
    }

    /**
     * Set the <code>wkb</code> parameter IN value to the routine
     */
    public void setWkb(byte... value) {
        setValue(WKB, value);
    }

    /**
     * Set the <code>wkb</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setWkb(Field<byte[]> field) {
        setField(WKB, field);
    }
}
