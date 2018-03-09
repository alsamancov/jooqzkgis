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
public class StLocatealong extends AbstractRoutine<Geometry> {

    private static final long serialVersionUID = -1020372818;

    /**
     * The parameter <code>public.st_locatealong.RETURN_VALUE</code>.
     */
    public static final Parameter<Geometry> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_locatealong.geometry</code>.
     */
    public static final Parameter<Geometry> GEOMETRY = createParameter("geometry", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_locatealong.measure</code>.
     */
    public static final Parameter<Double> MEASURE = createParameter("measure", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_locatealong.leftrightoffset</code>.
     */
    public static final Parameter<Double> LEFTRIGHTOFFSET = createParameter("leftrightoffset", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0.0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public StLocatealong() {
        super("st_locatealong", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), new GeometryConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOMETRY);
        addInParameter(MEASURE);
        addInParameter(LEFTRIGHTOFFSET);
    }

    /**
     * Set the <code>geometry</code> parameter IN value to the routine
     */
    public void setGeometry(Geometry value) {
        setValue(GEOMETRY, value);
    }

    /**
     * Set the <code>geometry</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeometry(Field<Geometry> field) {
        setField(GEOMETRY, field);
    }

    /**
     * Set the <code>measure</code> parameter IN value to the routine
     */
    public void setMeasure(Double value) {
        setValue(MEASURE, value);
    }

    /**
     * Set the <code>measure</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMeasure(Field<Double> field) {
        setField(MEASURE, field);
    }

    /**
     * Set the <code>leftrightoffset</code> parameter IN value to the routine
     */
    public void setLeftrightoffset(Double value) {
        setValue(LEFTRIGHTOFFSET, value);
    }

    /**
     * Set the <code>leftrightoffset</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setLeftrightoffset(Field<Double> field) {
        setField(LEFTRIGHTOFFSET, field);
    }
}
