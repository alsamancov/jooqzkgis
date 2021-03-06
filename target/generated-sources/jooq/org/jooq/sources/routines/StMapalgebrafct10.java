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
public class StMapalgebrafct10 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -1810656721;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST1 = createParameter("rast1", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST2 = createParameter("rast2", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> TWORASTUSERFUNC = createParameter("tworastuserfunc", org.jooq.impl.DefaultDataType.getDefaultDataType("regprocedure"), false, false);

    /**
     * The parameter <code>public.st_mapalgebrafct.pixeltype</code>.
     */
    public static final Parameter<String> PIXELTYPE = createParameter("pixeltype", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * The parameter <code>public.st_mapalgebrafct.extenttype</code>.
     */
    public static final Parameter<String> EXTENTTYPE = createParameter("extenttype", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("'INTERSECTION'::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * The parameter <code>public.st_mapalgebrafct.userargs</code>.
     */
    public static final Parameter<String[]> USERARGS = createParameter("userargs", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), true, false);

    /**
     * Create a new routine call instance
     */
    public StMapalgebrafct10() {
        super("st_mapalgebrafct", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST1);
        addInParameter(RAST2);
        addInParameter(TWORASTUSERFUNC);
        addInParameter(PIXELTYPE);
        addInParameter(EXTENTTYPE);
        addInParameter(USERARGS);
        setOverloaded(true);
    }

    /**
     * Set the <code>rast1</code> parameter IN value to the routine
     */
    public void setRast1(Object value) {
        setValue(RAST1, value);
    }

    /**
     * Set the <code>rast1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRast1(Field<Object> field) {
        setField(RAST1, field);
    }

    /**
     * Set the <code>rast2</code> parameter IN value to the routine
     */
    public void setRast2(Object value) {
        setValue(RAST2, value);
    }

    /**
     * Set the <code>rast2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRast2(Field<Object> field) {
        setField(RAST2, field);
    }

    /**
     * Set the <code>tworastuserfunc</code> parameter IN value to the routine
     */
    public void setTworastuserfunc(Object value) {
        setValue(TWORASTUSERFUNC, value);
    }

    /**
     * Set the <code>tworastuserfunc</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTworastuserfunc(Field<Object> field) {
        setField(TWORASTUSERFUNC, field);
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
     * Set the <code>extenttype</code> parameter IN value to the routine
     */
    public void setExtenttype(String value) {
        setValue(EXTENTTYPE, value);
    }

    /**
     * Set the <code>extenttype</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setExtenttype(Field<String> field) {
        setField(EXTENTTYPE, field);
    }

    /**
     * Set the <code>userargs</code> parameter IN value to the routine
     */
    public void setUserargs(String... value) {
        setValue(USERARGS, value);
    }

    /**
     * Set the <code>userargs</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUserargs(Field<String[]> field) {
        setField(USERARGS, field);
    }
}
