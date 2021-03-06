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
public class StLocatebetween extends AbstractRoutine<Geometry> {

    private static final long serialVersionUID = -22854110;

    /**
     * The parameter <code>public.st_locatebetween.RETURN_VALUE</code>.
     */
    public static final Parameter<Geometry> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_locatebetween.geometry</code>.
     */
    public static final Parameter<Geometry> GEOMETRY = createParameter("geometry", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_locatebetween.frommeasure</code>.
     */
    public static final Parameter<Double> FROMMEASURE = createParameter("frommeasure", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_locatebetween.tomeasure</code>.
     */
    public static final Parameter<Double> TOMEASURE = createParameter("tomeasure", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_locatebetween.leftrightoffset</code>.
     */
    public static final Parameter<Double> LEFTRIGHTOFFSET = createParameter("leftrightoffset", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0.0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public StLocatebetween() {
        super("st_locatebetween", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), new GeometryConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOMETRY);
        addInParameter(FROMMEASURE);
        addInParameter(TOMEASURE);
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
     * Set the <code>frommeasure</code> parameter IN value to the routine
     */
    public void setFrommeasure(Double value) {
        setValue(FROMMEASURE, value);
    }

    /**
     * Set the <code>frommeasure</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFrommeasure(Field<Double> field) {
        setField(FROMMEASURE, field);
    }

    /**
     * Set the <code>tomeasure</code> parameter IN value to the routine
     */
    public void setTomeasure(Double value) {
        setValue(TOMEASURE, value);
    }

    /**
     * Set the <code>tomeasure</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTomeasure(Field<Double> field) {
        setField(TOMEASURE, field);
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
