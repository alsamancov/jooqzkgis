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
public class StOffsetcurve extends AbstractRoutine<Geometry> {

    private static final long serialVersionUID = 1824112108;

    /**
     * The parameter <code>public.st_offsetcurve.RETURN_VALUE</code>.
     */
    public static final Parameter<Geometry> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_offsetcurve.line</code>.
     */
    public static final Parameter<Geometry> LINE = createParameter("line", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_offsetcurve.distance</code>.
     */
    public static final Parameter<Double> DISTANCE = createParameter("distance", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_offsetcurve.params</code>.
     */
    public static final Parameter<String> PARAMS = createParameter("params", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("''::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * Create a new routine call instance
     */
    public StOffsetcurve() {
        super("st_offsetcurve", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), new GeometryConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(LINE);
        addInParameter(DISTANCE);
        addInParameter(PARAMS);
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
     * Set the <code>distance</code> parameter IN value to the routine
     */
    public void setDistance(Double value) {
        setValue(DISTANCE, value);
    }

    /**
     * Set the <code>distance</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDistance(Field<Double> field) {
        setField(DISTANCE, field);
    }

    /**
     * Set the <code>params</code> parameter IN value to the routine
     */
    public void setParams(String value) {
        setValue(PARAMS, value);
    }

    /**
     * Set the <code>params</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setParams(Field<String> field) {
        setField(PARAMS, field);
    }
}
