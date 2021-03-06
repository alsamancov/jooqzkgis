/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import java.math.BigDecimal;

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
public class _RasterConstraintNodataValues extends AbstractRoutine<BigDecimal[]> {

    private static final long serialVersionUID = -621738119;

    /**
     * The parameter <code>public._raster_constraint_nodata_values.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * Create a new routine call instance
     */
    public _RasterConstraintNodataValues() {
        super("_raster_constraint_nodata_values", Public.PUBLIC, org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
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
}
