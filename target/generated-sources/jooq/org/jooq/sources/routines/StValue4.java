/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import com.vividsolutions.jts.geom.Geometry;

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
public class StValue4 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = -827419149;

    /**
     * The parameter <code>public.st_value.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_value.pt</code>.
     */
    public static final Parameter<Geometry> PT = createParameter("pt", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_value.exclude_nodata_value</code>.
     */
    public static final Parameter<Boolean> EXCLUDE_NODATA_VALUE = createParameter("exclude_nodata_value", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public StValue4() {
        super("st_value", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(PT);
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
     * Set the <code>pt</code> parameter IN value to the routine
     */
    public void setPt(Geometry value) {
        setValue(PT, value);
    }

    /**
     * Set the <code>pt</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPt(Field<Geometry> field) {
        setField(PT, field);
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
