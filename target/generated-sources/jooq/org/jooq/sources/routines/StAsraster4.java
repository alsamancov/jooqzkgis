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
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
 */
@java.lang.Deprecated
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StAsraster4 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -186625128;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_asraster.geom</code>.
     */
    public static final Parameter<Geometry> GEOM = createParameter("geom", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_asraster.width</code>.
     */
    public static final Parameter<Integer> WIDTH = createParameter("width", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.st_asraster.height</code>.
     */
    public static final Parameter<Integer> HEIGHT = createParameter("height", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.st_asraster.pixeltype</code>.
     */
    public static final Parameter<String[]> PIXELTYPE = createParameter("pixeltype", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * The parameter <code>public.st_asraster.value</code>.
     */
    public static final Parameter<Double[]> VALUE = createParameter("value", org.jooq.impl.SQLDataType.FLOAT.getArrayDataType(), true, false);

    /**
     * The parameter <code>public.st_asraster.nodataval</code>.
     */
    public static final Parameter<Double[]> NODATAVAL = createParameter("nodataval", org.jooq.impl.SQLDataType.FLOAT.getArrayDataType(), true, false);

    /**
     * The parameter <code>public.st_asraster.upperleftx</code>.
     */
    public static final Parameter<Double> UPPERLEFTX = createParameter("upperleftx", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("NULL::double precision", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * The parameter <code>public.st_asraster.upperlefty</code>.
     */
    public static final Parameter<Double> UPPERLEFTY = createParameter("upperlefty", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("NULL::double precision", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * The parameter <code>public.st_asraster.skewx</code>.
     */
    public static final Parameter<Double> SKEWX = createParameter("skewx", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * The parameter <code>public.st_asraster.skewy</code>.
     */
    public static final Parameter<Double> SKEWY = createParameter("skewy", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * The parameter <code>public.st_asraster.touched</code>.
     */
    public static final Parameter<Boolean> TOUCHED = createParameter("touched", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public StAsraster4() {
        super("st_asraster", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOM);
        addInParameter(WIDTH);
        addInParameter(HEIGHT);
        addInParameter(PIXELTYPE);
        addInParameter(VALUE);
        addInParameter(NODATAVAL);
        addInParameter(UPPERLEFTX);
        addInParameter(UPPERLEFTY);
        addInParameter(SKEWX);
        addInParameter(SKEWY);
        addInParameter(TOUCHED);
        setOverloaded(true);
    }

    /**
     * Set the <code>geom</code> parameter IN value to the routine
     */
    public void setGeom(Geometry value) {
        setValue(GEOM, value);
    }

    /**
     * Set the <code>geom</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeom(Field<Geometry> field) {
        setField(GEOM, field);
    }

    /**
     * Set the <code>width</code> parameter IN value to the routine
     */
    public void setWidth(Integer value) {
        setValue(WIDTH, value);
    }

    /**
     * Set the <code>width</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setWidth(Field<Integer> field) {
        setField(WIDTH, field);
    }

    /**
     * Set the <code>height</code> parameter IN value to the routine
     */
    public void setHeight(Integer value) {
        setValue(HEIGHT, value);
    }

    /**
     * Set the <code>height</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setHeight(Field<Integer> field) {
        setField(HEIGHT, field);
    }

    /**
     * Set the <code>pixeltype</code> parameter IN value to the routine
     */
    public void setPixeltype(String... value) {
        setValue(PIXELTYPE, value);
    }

    /**
     * Set the <code>pixeltype</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPixeltype(Field<String[]> field) {
        setField(PIXELTYPE, field);
    }

    /**
     * Set the <code>value</code> parameter IN value to the routine
     */
    public void setValue(Double... value) {
        setValue(VALUE, value);
    }

    /**
     * Set the <code>value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setValue(Field<Double[]> field) {
        setField(VALUE, field);
    }

    /**
     * Set the <code>nodataval</code> parameter IN value to the routine
     */
    public void setNodataval(Double... value) {
        setValue(NODATAVAL, value);
    }

    /**
     * Set the <code>nodataval</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNodataval(Field<Double[]> field) {
        setField(NODATAVAL, field);
    }

    /**
     * Set the <code>upperleftx</code> parameter IN value to the routine
     */
    public void setUpperleftx(Double value) {
        setValue(UPPERLEFTX, value);
    }

    /**
     * Set the <code>upperleftx</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUpperleftx(Field<Double> field) {
        setField(UPPERLEFTX, field);
    }

    /**
     * Set the <code>upperlefty</code> parameter IN value to the routine
     */
    public void setUpperlefty(Double value) {
        setValue(UPPERLEFTY, value);
    }

    /**
     * Set the <code>upperlefty</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUpperlefty(Field<Double> field) {
        setField(UPPERLEFTY, field);
    }

    /**
     * Set the <code>skewx</code> parameter IN value to the routine
     */
    public void setSkewx(Double value) {
        setValue(SKEWX, value);
    }

    /**
     * Set the <code>skewx</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSkewx(Field<Double> field) {
        setField(SKEWX, field);
    }

    /**
     * Set the <code>skewy</code> parameter IN value to the routine
     */
    public void setSkewy(Double value) {
        setValue(SKEWY, value);
    }

    /**
     * Set the <code>skewy</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSkewy(Field<Double> field) {
        setField(SKEWY, field);
    }

    /**
     * Set the <code>touched</code> parameter IN value to the routine
     */
    public void setTouched(Boolean value) {
        setValue(TOUCHED, value);
    }

    /**
     * Set the <code>touched</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTouched(Field<Boolean> field) {
        setField(TOUCHED, field);
    }
}
