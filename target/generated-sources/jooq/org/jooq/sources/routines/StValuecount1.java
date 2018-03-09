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
public class StValuecount1 extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 53721678;

    /**
     * The parameter <code>public.st_valuecount.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_valuecount.nband</code>.
     */
    public static final Parameter<Integer> NBAND = createParameter("nband", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.st_valuecount.exclude_nodata_value</code>.
     */
    public static final Parameter<Boolean> EXCLUDE_NODATA_VALUE = createParameter("exclude_nodata_value", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>public.st_valuecount.searchvalue</code>.
     */
    public static final Parameter<Double> SEARCHVALUE = createParameter("searchvalue", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_valuecount.roundto</code>.
     */
    public static final Parameter<Double> ROUNDTO = createParameter("roundto", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public StValuecount1() {
        super("st_valuecount", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(NBAND);
        addInParameter(EXCLUDE_NODATA_VALUE);
        addInParameter(SEARCHVALUE);
        addInParameter(ROUNDTO);
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

    /**
     * Set the <code>searchvalue</code> parameter IN value to the routine
     */
    public void setSearchvalue(Double value) {
        setValue(SEARCHVALUE, value);
    }

    /**
     * Set the <code>searchvalue</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSearchvalue(Field<Double> field) {
        setField(SEARCHVALUE, field);
    }

    /**
     * Set the <code>roundto</code> parameter IN value to the routine
     */
    public void setRoundto(Double value) {
        setValue(ROUNDTO, value);
    }

    /**
     * Set the <code>roundto</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRoundto(Field<Double> field) {
        setField(ROUNDTO, field);
    }
}