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
public class Addgeometrycolumn3 extends AbstractRoutine<String> {

    private static final long serialVersionUID = -2073396150;

    /**
     * The parameter <code>public.addgeometrycolumn.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.addgeometrycolumn.table_name</code>.
     */
    public static final Parameter<String> TABLE_NAME = createParameter("table_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addgeometrycolumn.column_name</code>.
     */
    public static final Parameter<String> COLUMN_NAME = createParameter("column_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addgeometrycolumn.new_srid</code>.
     */
    public static final Parameter<Integer> NEW_SRID = createParameter("new_srid", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.addgeometrycolumn.new_type</code>.
     */
    public static final Parameter<String> NEW_TYPE = createParameter("new_type", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addgeometrycolumn.new_dim</code>.
     */
    public static final Parameter<Integer> NEW_DIM = createParameter("new_dim", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.addgeometrycolumn.use_typmod</code>.
     */
    public static final Parameter<Boolean> USE_TYPMOD = createParameter("use_typmod", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public Addgeometrycolumn3() {
        super("addgeometrycolumn", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TABLE_NAME);
        addInParameter(COLUMN_NAME);
        addInParameter(NEW_SRID);
        addInParameter(NEW_TYPE);
        addInParameter(NEW_DIM);
        addInParameter(USE_TYPMOD);
        setOverloaded(true);
    }

    /**
     * Set the <code>table_name</code> parameter IN value to the routine
     */
    public void setTableName(String value) {
        setValue(TABLE_NAME, value);
    }

    /**
     * Set the <code>table_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTableName(Field<String> field) {
        setField(TABLE_NAME, field);
    }

    /**
     * Set the <code>column_name</code> parameter IN value to the routine
     */
    public void setColumnName(String value) {
        setValue(COLUMN_NAME, value);
    }

    /**
     * Set the <code>column_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setColumnName(Field<String> field) {
        setField(COLUMN_NAME, field);
    }

    /**
     * Set the <code>new_srid</code> parameter IN value to the routine
     */
    public void setNewSrid(Integer value) {
        setValue(NEW_SRID, value);
    }

    /**
     * Set the <code>new_srid</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNewSrid(Field<Integer> field) {
        setField(NEW_SRID, field);
    }

    /**
     * Set the <code>new_type</code> parameter IN value to the routine
     */
    public void setNewType(String value) {
        setValue(NEW_TYPE, value);
    }

    /**
     * Set the <code>new_type</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNewType(Field<String> field) {
        setField(NEW_TYPE, field);
    }

    /**
     * Set the <code>new_dim</code> parameter IN value to the routine
     */
    public void setNewDim(Integer value) {
        setValue(NEW_DIM, value);
    }

    /**
     * Set the <code>new_dim</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNewDim(Field<Integer> field) {
        setField(NEW_DIM, field);
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
