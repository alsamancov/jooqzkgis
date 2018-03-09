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
public class StApproxquantile8 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 1415924626;

    /**
     * The parameter <code>public.st_approxquantile.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_approxquantile.rastertable</code>.
     */
    public static final Parameter<String> RASTERTABLE = createParameter("rastertable", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_approxquantile.rastercolumn</code>.
     */
    public static final Parameter<String> RASTERCOLUMN = createParameter("rastercolumn", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_approxquantile.sample_percent</code>.
     */
    public static final Parameter<Double> SAMPLE_PERCENT = createParameter("sample_percent", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_approxquantile.quantile</code>.
     */
    public static final Parameter<Double> QUANTILE = createParameter("quantile", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public StApproxquantile8() {
        super("st_approxquantile", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RASTERTABLE);
        addInParameter(RASTERCOLUMN);
        addInParameter(SAMPLE_PERCENT);
        addInParameter(QUANTILE);
        setOverloaded(true);
    }

    /**
     * Set the <code>rastertable</code> parameter IN value to the routine
     */
    public void setRastertable(String value) {
        setValue(RASTERTABLE, value);
    }

    /**
     * Set the <code>rastertable</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRastertable(Field<String> field) {
        setField(RASTERTABLE, field);
    }

    /**
     * Set the <code>rastercolumn</code> parameter IN value to the routine
     */
    public void setRastercolumn(String value) {
        setValue(RASTERCOLUMN, value);
    }

    /**
     * Set the <code>rastercolumn</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRastercolumn(Field<String> field) {
        setField(RASTERCOLUMN, field);
    }

    /**
     * Set the <code>sample_percent</code> parameter IN value to the routine
     */
    public void setSamplePercent(Double value) {
        setValue(SAMPLE_PERCENT, value);
    }

    /**
     * Set the <code>sample_percent</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSamplePercent(Field<Double> field) {
        setField(SAMPLE_PERCENT, field);
    }

    /**
     * Set the <code>quantile</code> parameter IN value to the routine
     */
    public void setQuantile(Double value) {
        setValue(QUANTILE, value);
    }

    /**
     * Set the <code>quantile</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setQuantile(Field<Double> field) {
        setField(QUANTILE, field);
    }
}