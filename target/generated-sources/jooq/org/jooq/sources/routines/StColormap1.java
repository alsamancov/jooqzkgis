/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


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
public class StColormap1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 949812614;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_colormap.nband</code>.
     */
    public static final Parameter<Integer> NBAND = createParameter("nband", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>public.st_colormap.colormap</code>.
     */
    public static final Parameter<String> COLORMAP = createParameter("colormap", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("'grayscale'::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * The parameter <code>public.st_colormap.method</code>.
     */
    public static final Parameter<String> METHOD = createParameter("method", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("'INTERPOLATE'::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * Create a new routine call instance
     */
    public StColormap1() {
        super("st_colormap", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(NBAND);
        addInParameter(COLORMAP);
        addInParameter(METHOD);
        setOverloaded(true);
    }

    /**
     * Set the <code>rast</code> parameter IN value to the routine
     */
    public void setRast(Object value) {
        setValue(RAST, value);
    }

    /**
     * Set the <code>rast</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRast(Field<Object> field) {
        setField(RAST, field);
    }

    /**
     * Set the <code>nband</code> parameter IN value to the routine
     */
    public void setNband(Integer value) {
        setValue(NBAND, value);
    }

    /**
     * Set the <code>nband</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNband(Field<Integer> field) {
        setField(NBAND, field);
    }

    /**
     * Set the <code>colormap</code> parameter IN value to the routine
     */
    public void setColormap(String value) {
        setValue(COLORMAP, value);
    }

    /**
     * Set the <code>colormap</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setColormap(Field<String> field) {
        setField(COLORMAP, field);
    }

    /**
     * Set the <code>method</code> parameter IN value to the routine
     */
    public void setMethod(String value) {
        setValue(METHOD, value);
    }

    /**
     * Set the <code>method</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMethod(Field<String> field) {
        setField(METHOD, field);
    }
}