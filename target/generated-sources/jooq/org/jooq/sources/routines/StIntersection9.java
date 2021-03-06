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
public class StIntersection9 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1296471828;

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
     * The parameter <code>public.st_intersection.returnband</code>.
     */
    public static final Parameter<String> RETURNBAND = createParameter("returnband", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_intersection.nodataval</code>.
     */
    public static final Parameter<Double> NODATAVAL = createParameter("nodataval", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public StIntersection9() {
        super("st_intersection", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST1);
        addInParameter(RAST2);
        addInParameter(RETURNBAND);
        addInParameter(NODATAVAL);
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
     * Set the <code>returnband</code> parameter IN value to the routine
     */
    public void setReturnband(String value) {
        setValue(RETURNBAND, value);
    }

    /**
     * Set the <code>returnband</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setReturnband(Field<String> field) {
        setField(RETURNBAND, field);
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
}
