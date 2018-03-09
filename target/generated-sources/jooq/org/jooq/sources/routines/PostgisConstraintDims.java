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
public class PostgisConstraintDims extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 730656670;

    /**
     * The parameter <code>public.postgis_constraint_dims.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.postgis_constraint_dims.geomschema</code>.
     */
    public static final Parameter<String> GEOMSCHEMA = createParameter("geomschema", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.postgis_constraint_dims.geomtable</code>.
     */
    public static final Parameter<String> GEOMTABLE = createParameter("geomtable", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.postgis_constraint_dims.geomcolumn</code>.
     */
    public static final Parameter<String> GEOMCOLUMN = createParameter("geomcolumn", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public PostgisConstraintDims() {
        super("postgis_constraint_dims", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOMSCHEMA);
        addInParameter(GEOMTABLE);
        addInParameter(GEOMCOLUMN);
    }

    /**
     * Set the <code>geomschema</code> parameter IN value to the routine
     */
    public void setGeomschema(String value) {
        setValue(GEOMSCHEMA, value);
    }

    /**
     * Set the <code>geomschema</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeomschema(Field<String> field) {
        setField(GEOMSCHEMA, field);
    }

    /**
     * Set the <code>geomtable</code> parameter IN value to the routine
     */
    public void setGeomtable(String value) {
        setValue(GEOMTABLE, value);
    }

    /**
     * Set the <code>geomtable</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeomtable(Field<String> field) {
        setField(GEOMTABLE, field);
    }

    /**
     * Set the <code>geomcolumn</code> parameter IN value to the routine
     */
    public void setGeomcolumn(String value) {
        setValue(GEOMCOLUMN, value);
    }

    /**
     * Set the <code>geomcolumn</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeomcolumn(Field<String> field) {
        setField(GEOMCOLUMN, field);
    }
}
