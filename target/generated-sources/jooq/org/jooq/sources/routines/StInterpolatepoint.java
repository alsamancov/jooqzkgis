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
public class StInterpolatepoint extends AbstractRoutine<Double> {

    private static final long serialVersionUID = -1302384514;

    /**
     * The parameter <code>public.st_interpolatepoint.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_interpolatepoint.line</code>.
     */
    public static final Parameter<Geometry> LINE = createParameter("line", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_interpolatepoint.point</code>.
     */
    public static final Parameter<Geometry> POINT = createParameter("point", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * Create a new routine call instance
     */
    public StInterpolatepoint() {
        super("st_interpolatepoint", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(LINE);
        addInParameter(POINT);
    }

    /**
     * Set the <code>line</code> parameter IN value to the routine
     */
    public void setLine(Geometry value) {
        setValue(LINE, value);
    }

    /**
     * Set the <code>line</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setLine(Field<Geometry> field) {
        setField(LINE, field);
    }

    /**
     * Set the <code>point</code> parameter IN value to the routine
     */
    public void setPoint(Geometry value) {
        setValue(POINT, value);
    }

    /**
     * Set the <code>point</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPoint(Field<Geometry> field) {
        setField(POINT, field);
    }
}
