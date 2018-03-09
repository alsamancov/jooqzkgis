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
public class StApproxcount3 extends AbstractRoutine<Long> {

    private static final long serialVersionUID = -1805413179;

    /**
     * The parameter <code>public.st_approxcount.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_approxcount.exclude_nodata_value</code>.
     */
    public static final Parameter<Boolean> EXCLUDE_NODATA_VALUE = createParameter("exclude_nodata_value", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>public.st_approxcount.sample_percent</code>.
     */
    public static final Parameter<Double> SAMPLE_PERCENT = createParameter("sample_percent", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0.1", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public StApproxcount3() {
        super("st_approxcount", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(EXCLUDE_NODATA_VALUE);
        addInParameter(SAMPLE_PERCENT);
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
}
