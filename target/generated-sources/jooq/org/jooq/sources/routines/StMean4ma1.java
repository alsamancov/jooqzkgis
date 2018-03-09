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
public class StMean4ma1 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 398722163;

    /**
     * The parameter <code>public.st_mean4ma.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_mean4ma.matrix</code>.
     */
    public static final Parameter<Double[]> MATRIX = createParameter("matrix", org.jooq.impl.SQLDataType.FLOAT.getArrayDataType(), false, false);

    /**
     * The parameter <code>public.st_mean4ma.nodatamode</code>.
     */
    public static final Parameter<String> NODATAMODE = createParameter("nodatamode", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_mean4ma.args</code>.
     */
    public static final Parameter<String[]> ARGS = createParameter("args", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public StMean4ma1() {
        super("st_mean4ma", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(MATRIX);
        addInParameter(NODATAMODE);
        addInParameter(ARGS);
        setOverloaded(true);
    }

    /**
     * Set the <code>matrix</code> parameter IN value to the routine
     */
    public void setMatrix(Double... value) {
        setValue(MATRIX, value);
    }

    /**
     * Set the <code>matrix</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMatrix(Field<Double[]> field) {
        setField(MATRIX, field);
    }

    /**
     * Set the <code>nodatamode</code> parameter IN value to the routine
     */
    public void setNodatamode(String value) {
        setValue(NODATAMODE, value);
    }

    /**
     * Set the <code>nodatamode</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNodatamode(Field<String> field) {
        setField(NODATAMODE, field);
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
