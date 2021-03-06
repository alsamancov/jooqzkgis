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
public class StValuepercent6 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 1091102279;

    /**
     * The parameter <code>public.st_valuepercent.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_valuepercent.rastertable</code>.
     */
    public static final Parameter<String> RASTERTABLE = createParameter("rastertable", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_valuepercent.rastercolumn</code>.
     */
    public static final Parameter<String> RASTERCOLUMN = createParameter("rastercolumn", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_valuepercent.searchvalue</code>.
     */
    public static final Parameter<Double> SEARCHVALUE = createParameter("searchvalue", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_valuepercent.roundto</code>.
     */
    public static final Parameter<Double> ROUNDTO = createParameter("roundto", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public StValuepercent6() {
        super("st_valuepercent", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RASTERTABLE);
        addInParameter(RASTERCOLUMN);
        addInParameter(SEARCHVALUE);
        addInParameter(ROUNDTO);
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
