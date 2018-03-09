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
public class StAddband4 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -1310362020;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> TORAST = createParameter("torast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> FROMRAST = createParameter("fromrast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_addband.fromband</code>.
     */
    public static final Parameter<Integer> FROMBAND = createParameter("fromband", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>public.st_addband.torastindex</code>.
     */
    public static final Parameter<Integer> TORASTINDEX = createParameter("torastindex", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL::integer", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * Create a new routine call instance
     */
    public StAddband4() {
        super("st_addband", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(TORAST);
        addInParameter(FROMRAST);
        addInParameter(FROMBAND);
        addInParameter(TORASTINDEX);
        setOverloaded(true);
    }

    /**
     * Set the <code>torast</code> parameter IN value to the routine
     */
    public void setTorast(Object value) {
        setValue(TORAST, value);
    }

    /**
     * Set the <code>torast</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTorast(Field<Object> field) {
        setField(TORAST, field);
    }

    /**
     * Set the <code>fromrast</code> parameter IN value to the routine
     */
    public void setFromrast(Object value) {
        setValue(FROMRAST, value);
    }

    /**
     * Set the <code>fromrast</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFromrast(Field<Object> field) {
        setField(FROMRAST, field);
    }

    /**
     * Set the <code>fromband</code> parameter IN value to the routine
     */
    public void setFromband(Integer value) {
        setValue(FROMBAND, value);
    }

    /**
     * Set the <code>fromband</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFromband(Field<Integer> field) {
        setField(FROMBAND, field);
    }

    /**
     * Set the <code>torastindex</code> parameter IN value to the routine
     */
    public void setTorastindex(Integer value) {
        setValue(TORASTINDEX, value);
    }

    /**
     * Set the <code>torastindex</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTorastindex(Field<Integer> field) {
        setField(TORASTINDEX, field);
    }
}
