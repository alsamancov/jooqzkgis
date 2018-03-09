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
public class StAssvg2 extends AbstractRoutine<String> {

    private static final long serialVersionUID = -721354885;

    /**
     * The parameter <code>public.st_assvg.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> GEOG = createParameter("geog", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_assvg.rel</code>.
     */
    public static final Parameter<Integer> REL = createParameter("rel", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>public.st_assvg.maxdecimaldigits</code>.
     */
    public static final Parameter<Integer> MAXDECIMALDIGITS = createParameter("maxdecimaldigits", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("15", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * Create a new routine call instance
     */
    public StAssvg2() {
        super("st_assvg", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOG);
        addInParameter(REL);
        addInParameter(MAXDECIMALDIGITS);
        setOverloaded(true);
    }

    /**
     * Set the <code>geog</code> parameter IN value to the routine
     */
    public void setGeog(Object value) {
        setValue(GEOG, value);
    }

    /**
     * Set the <code>geog</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeog(Field<Object> field) {
        setField(GEOG, field);
    }

    /**
     * Set the <code>rel</code> parameter IN value to the routine
     */
    public void setRel(Integer value) {
        setValue(REL, value);
    }

    /**
     * Set the <code>rel</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRel(Field<Integer> field) {
        setField(REL, field);
    }

    /**
     * Set the <code>maxdecimaldigits</code> parameter IN value to the routine
     */
    public void setMaxdecimaldigits(Integer value) {
        setValue(MAXDECIMALDIGITS, value);
    }

    /**
     * Set the <code>maxdecimaldigits</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMaxdecimaldigits(Field<Integer> field) {
        setField(MAXDECIMALDIGITS, field);
    }
}