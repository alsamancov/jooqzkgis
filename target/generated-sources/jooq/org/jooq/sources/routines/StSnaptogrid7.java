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
public class StSnaptogrid7 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -1052735231;

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
     * The parameter <code>public.st_snaptogrid.gridx</code>.
     */
    public static final Parameter<Double> GRIDX = createParameter("gridx", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_snaptogrid.gridy</code>.
     */
    public static final Parameter<Double> GRIDY = createParameter("gridy", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_snaptogrid.scalexy</code>.
     */
    public static final Parameter<Double> SCALEXY = createParameter("scalexy", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_snaptogrid.algorithm</code>.
     */
    public static final Parameter<String> ALGORITHM = createParameter("algorithm", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("'NearestNeighbour'::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * The parameter <code>public.st_snaptogrid.maxerr</code>.
     */
    public static final Parameter<Double> MAXERR = createParameter("maxerr", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0.125", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public StSnaptogrid7() {
        super("st_snaptogrid", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(GRIDX);
        addInParameter(GRIDY);
        addInParameter(SCALEXY);
        addInParameter(ALGORITHM);
        addInParameter(MAXERR);
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
     * Set the <code>gridx</code> parameter IN value to the routine
     */
    public void setGridx(Double value) {
        setValue(GRIDX, value);
    }

    /**
     * Set the <code>gridx</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGridx(Field<Double> field) {
        setField(GRIDX, field);
    }

    /**
     * Set the <code>gridy</code> parameter IN value to the routine
     */
    public void setGridy(Double value) {
        setValue(GRIDY, value);
    }

    /**
     * Set the <code>gridy</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGridy(Field<Double> field) {
        setField(GRIDY, field);
    }

    /**
     * Set the <code>scalexy</code> parameter IN value to the routine
     */
    public void setScalexy(Double value) {
        setValue(SCALEXY, value);
    }

    /**
     * Set the <code>scalexy</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setScalexy(Field<Double> field) {
        setField(SCALEXY, field);
    }

    /**
     * Set the <code>algorithm</code> parameter IN value to the routine
     */
    public void setAlgorithm(String value) {
        setValue(ALGORITHM, value);
    }

    /**
     * Set the <code>algorithm</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setAlgorithm(Field<String> field) {
        setField(ALGORITHM, field);
    }

    /**
     * Set the <code>maxerr</code> parameter IN value to the routine
     */
    public void setMaxerr(Double value) {
        setValue(MAXERR, value);
    }

    /**
     * Set the <code>maxerr</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMaxerr(Field<Double> field) {
        setField(MAXERR, field);
    }
}