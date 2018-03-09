/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.sources.Public;
import org.jooq.sources.udt.records.SummarystatsRecord;


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
public class StSummarystats1 extends AbstractRoutine<SummarystatsRecord> {

    private static final long serialVersionUID = 1666704488;

    /**
     * The parameter <code>public.st_summarystats.RETURN_VALUE</code>.
     */
    public static final Parameter<SummarystatsRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.sources.udt.Summarystats.SUMMARYSTATS.getDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_summarystats.nband</code>.
     */
    public static final Parameter<Integer> NBAND = createParameter("nband", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>public.st_summarystats.exclude_nodata_value</code>.
     */
    public static final Parameter<Boolean> EXCLUDE_NODATA_VALUE = createParameter("exclude_nodata_value", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public StSummarystats1() {
        super("st_summarystats", Public.PUBLIC, org.jooq.sources.udt.Summarystats.SUMMARYSTATS.getDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(NBAND);
        addInParameter(EXCLUDE_NODATA_VALUE);
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
     * Set the <code>nband</code> parameter IN value to the routine
     */
    public void setNband(Integer value) {
        setValue(NBAND, value);
    }

    /**
     * Set the <code>nband</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNband(Field<Integer> field) {
        setField(NBAND, field);
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
}
