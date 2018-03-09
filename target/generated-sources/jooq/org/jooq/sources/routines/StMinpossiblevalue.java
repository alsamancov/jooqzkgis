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
public class StMinpossiblevalue extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 1816041971;

    /**
     * The parameter <code>public.st_minpossiblevalue.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_minpossiblevalue.pixeltype</code>.
     */
    public static final Parameter<String> PIXELTYPE = createParameter("pixeltype", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public StMinpossiblevalue() {
        super("st_minpossiblevalue", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(PIXELTYPE);
    }

    /**
     * Set the <code>pixeltype</code> parameter IN value to the routine
     */
    public void setPixeltype(String value) {
        setValue(PIXELTYPE, value);
    }

    /**
     * Set the <code>pixeltype</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPixeltype(Field<String> field) {
        setField(PIXELTYPE, field);
    }
}