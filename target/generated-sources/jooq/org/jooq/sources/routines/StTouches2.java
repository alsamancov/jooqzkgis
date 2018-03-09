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
public class StTouches2 extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = -1880432201;

    /**
     * The parameter <code>public.st_touches.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST1 = createParameter("rast1", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_touches.nband1</code>.
     */
    public static final Parameter<Integer> NBAND1 = createParameter("nband1", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST2 = createParameter("rast2", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_touches.nband2</code>.
     */
    public static final Parameter<Integer> NBAND2 = createParameter("nband2", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public StTouches2() {
        super("st_touches", Public.PUBLIC, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST1);
        addInParameter(NBAND1);
        addInParameter(RAST2);
        addInParameter(NBAND2);
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
     * Set the <code>nband1</code> parameter IN value to the routine
     */
    public void setNband1(Integer value) {
        setValue(NBAND1, value);
    }

    /**
     * Set the <code>nband1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNband1(Field<Integer> field) {
        setField(NBAND1, field);
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
     * Set the <code>nband2</code> parameter IN value to the routine
     */
    public void setNband2(Integer value) {
        setValue(NBAND2, value);
    }

    /**
     * Set the <code>nband2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNband2(Field<Integer> field) {
        setField(NBAND2, field);
    }
}
