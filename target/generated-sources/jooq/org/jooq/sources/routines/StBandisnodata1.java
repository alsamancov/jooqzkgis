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
public class StBandisnodata1 extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = -1769166959;

    /**
     * The parameter <code>public.st_bandisnodata.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_bandisnodata.band</code>.
     */
    public static final Parameter<Integer> BAND = createParameter("band", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>public.st_bandisnodata.forcechecking</code>.
     */
    public static final Parameter<Boolean> FORCECHECKING = createParameter("forcechecking", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public StBandisnodata1() {
        super("st_bandisnodata", Public.PUBLIC, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(BAND);
        addInParameter(FORCECHECKING);
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
     * Set the <code>band</code> parameter IN value to the routine
     */
    public void setBand(Integer value) {
        setValue(BAND, value);
    }

    /**
     * Set the <code>band</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setBand(Field<Integer> field) {
        setField(BAND, field);
    }

    /**
     * Set the <code>forcechecking</code> parameter IN value to the routine
     */
    public void setForcechecking(Boolean value) {
        setValue(FORCECHECKING, value);
    }

    /**
     * Set the <code>forcechecking</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setForcechecking(Field<Boolean> field) {
        setField(FORCECHECKING, field);
    }
}
