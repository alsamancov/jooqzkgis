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
public class Addoverviewconstraints2 extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1864272929;

    /**
     * The parameter <code>public.addoverviewconstraints.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>public.addoverviewconstraints.ovtable</code>.
     */
    public static final Parameter<String> OVTABLE = createParameter("ovtable", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addoverviewconstraints.ovcolumn</code>.
     */
    public static final Parameter<String> OVCOLUMN = createParameter("ovcolumn", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addoverviewconstraints.reftable</code>.
     */
    public static final Parameter<String> REFTABLE = createParameter("reftable", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addoverviewconstraints.refcolumn</code>.
     */
    public static final Parameter<String> REFCOLUMN = createParameter("refcolumn", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addoverviewconstraints.ovfactor</code>.
     */
    public static final Parameter<Integer> OVFACTOR = createParameter("ovfactor", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public Addoverviewconstraints2() {
        super("addoverviewconstraints", Public.PUBLIC, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(OVTABLE);
        addInParameter(OVCOLUMN);
        addInParameter(REFTABLE);
        addInParameter(REFCOLUMN);
        addInParameter(OVFACTOR);
        setOverloaded(true);
    }

    /**
     * Set the <code>ovtable</code> parameter IN value to the routine
     */
    public void setOvtable(String value) {
        setValue(OVTABLE, value);
    }

    /**
     * Set the <code>ovtable</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setOvtable(Field<String> field) {
        setField(OVTABLE, field);
    }

    /**
     * Set the <code>ovcolumn</code> parameter IN value to the routine
     */
    public void setOvcolumn(String value) {
        setValue(OVCOLUMN, value);
    }

    /**
     * Set the <code>ovcolumn</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setOvcolumn(Field<String> field) {
        setField(OVCOLUMN, field);
    }

    /**
     * Set the <code>reftable</code> parameter IN value to the routine
     */
    public void setReftable(String value) {
        setValue(REFTABLE, value);
    }

    /**
     * Set the <code>reftable</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setReftable(Field<String> field) {
        setField(REFTABLE, field);
    }

    /**
     * Set the <code>refcolumn</code> parameter IN value to the routine
     */
    public void setRefcolumn(String value) {
        setValue(REFCOLUMN, value);
    }

    /**
     * Set the <code>refcolumn</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRefcolumn(Field<String> field) {
        setField(REFCOLUMN, field);
    }

    /**
     * Set the <code>ovfactor</code> parameter IN value to the routine
     */
    public void setOvfactor(Integer value) {
        setValue(OVFACTOR, value);
    }

    /**
     * Set the <code>ovfactor</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setOvfactor(Field<Integer> field) {
        setField(OVFACTOR, field);
    }
}
