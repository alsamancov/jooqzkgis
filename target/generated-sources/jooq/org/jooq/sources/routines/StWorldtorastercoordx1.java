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
public class StWorldtorastercoordx1 extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1348143141;

    /**
     * The parameter <code>public.st_worldtorastercoordx.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_worldtorastercoordx.xw</code>.
     */
    public static final Parameter<Double> XW = createParameter("xw", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_worldtorastercoordx.yw</code>.
     */
    public static final Parameter<Double> YW = createParameter("yw", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public StWorldtorastercoordx1() {
        super("st_worldtorastercoordx", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(XW);
        addInParameter(YW);
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
     * Set the <code>xw</code> parameter IN value to the routine
     */
    public void setXw(Double value) {
        setValue(XW, value);
    }

    /**
     * Set the <code>xw</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setXw(Field<Double> field) {
        setField(XW, field);
    }

    /**
     * Set the <code>yw</code> parameter IN value to the routine
     */
    public void setYw(Double value) {
        setValue(YW, value);
    }

    /**
     * Set the <code>yw</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setYw(Field<Double> field) {
        setField(YW, field);
    }
}
