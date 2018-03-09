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
public class StQuantile7 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 860987787;

    /**
     * The parameter <code>public.st_quantile.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_quantile.rastertable</code>.
     */
    public static final Parameter<String> RASTERTABLE = createParameter("rastertable", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_quantile.rastercolumn</code>.
     */
    public static final Parameter<String> RASTERCOLUMN = createParameter("rastercolumn", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_quantile.exclude_nodata_value</code>.
     */
    public static final Parameter<Boolean> EXCLUDE_NODATA_VALUE = createParameter("exclude_nodata_value", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>public.st_quantile.quantile</code>.
     */
    public static final Parameter<Double> QUANTILE = createParameter("quantile", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("NULL::double precision", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public StQuantile7() {
        super("st_quantile", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RASTERTABLE);
        addInParameter(RASTERCOLUMN);
        addInParameter(EXCLUDE_NODATA_VALUE);
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
     * Set the <code>exclude_nodata_value</code> parameter IN value to the routine
     */
    public void setExcludeNodataValue(Boolean value) {
        setValue(EXCLUDE_NODATA_VALUE, value);
    }

    /**
     * Set the <code>exclude_nodata_value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setExcludeNodataValue(Field<Boolean> field) {
        setField(EXCLUDE_NODATA_VALUE, field);
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
