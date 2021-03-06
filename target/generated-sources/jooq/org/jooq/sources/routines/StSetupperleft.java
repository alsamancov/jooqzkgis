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
public class StSetupperleft extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -1519778386;

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
     * The parameter <code>public.st_setupperleft.upperleftx</code>.
     */
    public static final Parameter<Double> UPPERLEFTX = createParameter("upperleftx", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_setupperleft.upperlefty</code>.
     */
    public static final Parameter<Double> UPPERLEFTY = createParameter("upperlefty", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public StSetupperleft() {
        super("st_setupperleft", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(UPPERLEFTX);
        addInParameter(UPPERLEFTY);
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
     * Set the <code>upperleftx</code> parameter IN value to the routine
     */
    public void setUpperleftx(Double value) {
        setValue(UPPERLEFTX, value);
    }

    /**
     * Set the <code>upperleftx</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUpperleftx(Field<Double> field) {
        setField(UPPERLEFTX, field);
    }

    /**
     * Set the <code>upperlefty</code> parameter IN value to the routine
     */
    public void setUpperlefty(Double value) {
        setValue(UPPERLEFTY, value);
    }

    /**
     * Set the <code>upperlefty</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUpperlefty(Field<Double> field) {
        setField(UPPERLEFTY, field);
    }
}
