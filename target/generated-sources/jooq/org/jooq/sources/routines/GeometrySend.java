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
public class GeometrySend extends AbstractRoutine<byte[]> {

    private static final long serialVersionUID = -1752149622;

    /**
     * The parameter <code>public.geometry_send.RETURN_VALUE</code>.
     */
    public static final Parameter<byte[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BLOB, false, false);

    /**
     * The parameter <code>public.geometry_send._1</code>.
     */
    public static final Parameter<Geometry> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, true, new GeometryConverter());

    /**
     * Create a new routine call instance
     */
    public GeometrySend() {
        super("geometry_send", Public.PUBLIC, org.jooq.impl.SQLDataType.BLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Geometry value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Geometry> field) {
        setField(_1, field);
    }
}