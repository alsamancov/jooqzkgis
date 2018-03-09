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
public class StMapalgebrafct7 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -988342632;

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
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> ONERASTUSERFUNC = createParameter("onerastuserfunc", org.jooq.impl.DefaultDataType.getDefaultDataType("regprocedure"), false, false);

    /**
     * The parameter <code>public.st_mapalgebrafct.args</code>.
     */
    public static final Parameter<String[]> ARGS = createParameter("args", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public StMapalgebrafct7() {
        super("st_mapalgebrafct", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(ONERASTUSERFUNC);
        addInParameter(ARGS);
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
     * Set the <code>onerastuserfunc</code> parameter IN value to the routine
     */
    public void setOnerastuserfunc(Object value) {
        setValue(ONERASTUSERFUNC, value);
    }

    /**
     * Set the <code>onerastuserfunc</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setOnerastuserfunc(Field<Object> field) {
        setField(ONERASTUSERFUNC, field);
    }

    /**
     * Set the <code>args</code> parameter IN value to the routine
     */
    public void setArgs(String... value) {
        setValue(ARGS, value);
    }

    /**
     * Set the <code>args</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setArgs(Field<String[]> field) {
        setField(ARGS, field);
    }
}
