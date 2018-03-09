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
public class StMax4ma2 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 169957236;

    /**
     * The parameter <code>public.st_max4ma.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_max4ma.value</code>.
     */
    public static final Parameter<Double[]> VALUE = createParameter("value", org.jooq.impl.SQLDataType.FLOAT.getArrayDataType(), false, false);

    /**
     * The parameter <code>public.st_max4ma.pos</code>.
     */
    public static final Parameter<Integer[]> POS = createParameter("pos", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), false, false);

    /**
     * The parameter <code>public.st_max4ma.userargs</code>.
     */
    public static final Parameter<String[]> USERARGS = createParameter("userargs", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), true, false);

    /**
     * Create a new routine call instance
     */
    public StMax4ma2() {
        super("st_max4ma", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(VALUE);
        addInParameter(POS);
        addInParameter(USERARGS);
        setOverloaded(true);
    }

    /**
     * Set the <code>value</code> parameter IN value to the routine
     */
    public void setValue(Double... value) {
        setValue(VALUE, value);
    }

    /**
     * Set the <code>value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setValue(Field<Double[]> field) {
        setField(VALUE, field);
    }

    /**
     * Set the <code>pos</code> parameter IN value to the routine
     */
    public void setPos(Integer... value) {
        setValue(POS, value);
    }

    /**
     * Set the <code>pos</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPos(Field<Integer[]> field) {
        setField(POS, field);
    }

    /**
     * Set the <code>userargs</code> parameter IN value to the routine
     */
    public void setUserargs(String... value) {
        setValue(USERARGS, value);
    }

    /**
     * Set the <code>userargs</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUserargs(Field<String[]> field) {
        setField(USERARGS, field);
    }
}
