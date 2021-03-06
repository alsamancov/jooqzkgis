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
public class Dropoverviewconstraints2 extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = -852857374;

    /**
     * The parameter <code>public.dropoverviewconstraints.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>public.dropoverviewconstraints.ovtable</code>.
     */
    public static final Parameter<String> OVTABLE = createParameter("ovtable", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.dropoverviewconstraints.ovcolumn</code>.
     */
    public static final Parameter<String> OVCOLUMN = createParameter("ovcolumn", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public Dropoverviewconstraints2() {
        super("dropoverviewconstraints", Public.PUBLIC, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(OVTABLE);
        addInParameter(OVCOLUMN);
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
}
