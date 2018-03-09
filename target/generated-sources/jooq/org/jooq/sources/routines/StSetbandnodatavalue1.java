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
public class StSetbandnodatavalue1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1612312890;

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
     * The parameter <code>public.st_setbandnodatavalue.band</code>.
     */
    public static final Parameter<Integer> BAND = createParameter("band", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.st_setbandnodatavalue.nodatavalue</code>.
     */
    public static final Parameter<Double> NODATAVALUE = createParameter("nodatavalue", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_setbandnodatavalue.forcechecking</code>.
     */
    public static final Parameter<Boolean> FORCECHECKING = createParameter("forcechecking", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public StSetbandnodatavalue1() {
        super("st_setbandnodatavalue", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(BAND);
        addInParameter(NODATAVALUE);
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
     * Set the <code>nodatavalue</code> parameter IN value to the routine
     */
    public void setNodatavalue(Double value) {
        setValue(NODATAVALUE, value);
    }

    /**
     * Set the <code>nodatavalue</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNodatavalue(Field<Double> field) {
        setField(NODATAVALUE, field);
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
