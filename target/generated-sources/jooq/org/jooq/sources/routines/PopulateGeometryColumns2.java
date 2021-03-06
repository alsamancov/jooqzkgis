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
public class PopulateGeometryColumns2 extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1870328305;

    /**
     * The parameter <code>public.populate_geometry_columns.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.populate_geometry_columns.tbl_oid</code>.
     */
    public static final Parameter<Long> TBL_OID = createParameter("tbl_oid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>public.populate_geometry_columns.use_typmod</code>.
     */
    public static final Parameter<Boolean> USE_TYPMOD = createParameter("use_typmod", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public PopulateGeometryColumns2() {
        super("populate_geometry_columns", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TBL_OID);
        addInParameter(USE_TYPMOD);
        setOverloaded(true);
    }

    /**
     * Set the <code>tbl_oid</code> parameter IN value to the routine
     */
    public void setTblOid(Long value) {
        setValue(TBL_OID, value);
    }

    /**
     * Set the <code>tbl_oid</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTblOid(Field<Long> field) {
        setField(TBL_OID, field);
    }

    /**
     * Set the <code>use_typmod</code> parameter IN value to the routine
     */
    public void setUseTypmod(Boolean value) {
        setValue(USE_TYPMOD, value);
    }

    /**
     * Set the <code>use_typmod</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUseTypmod(Field<Boolean> field) {
        setField(USE_TYPMOD, field);
    }
}
