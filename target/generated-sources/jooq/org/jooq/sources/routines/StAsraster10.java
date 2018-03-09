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
public class StAsraster10 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -2077229593;

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
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> REF = createParameter("ref", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_asraster.pixeltype</code>.
     */
    public static final Parameter<String> PIXELTYPE = createParameter("pixeltype", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_asraster.value</code>.
     */
    public static final Parameter<Double> VALUE = createParameter("value", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * The parameter <code>public.st_asraster.nodataval</code>.
     */
    public static final Parameter<Double> NODATAVAL = createParameter("nodataval", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * The parameter <code>public.st_asraster.touched</code>.
     */
    public static final Parameter<Boolean> TOUCHED = createParameter("touched", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public StAsraster10() {
        super("st_asraster", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOM);
        addInParameter(REF);
        addInParameter(PIXELTYPE);
        addInParameter(VALUE);
        addInParameter(NODATAVAL);
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
     * Set the <code>ref</code> parameter IN value to the routine
     */
    public void setRef(Object value) {
        setValue(REF, value);
    }

    /**
     * Set the <code>ref</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRef(Field<Object> field) {
        setField(REF, field);
    }

    /**
     * Set the <code>pixeltype</code> parameter IN value to the routine
     */
    public void setPixeltype(String value) {
        setValue(PIXELTYPE, value);
    }

    /**
     * Set the <code>pixeltype</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPixeltype(Field<String> field) {
        setField(PIXELTYPE, field);
    }

    /**
     * Set the <code>value</code> parameter IN value to the routine
     */
    public void setValue(Double value) {
        setValue(VALUE, value);
    }

    /**
     * Set the <code>value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setValue(Field<Double> field) {
        setField(VALUE, field);
    }

    /**
     * Set the <code>nodataval</code> parameter IN value to the routine
     */
    public void setNodataval(Double value) {
        setValue(NODATAVAL, value);
    }

    /**
     * Set the <code>nodataval</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNodataval(Field<Double> field) {
        setField(NODATAVAL, field);
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