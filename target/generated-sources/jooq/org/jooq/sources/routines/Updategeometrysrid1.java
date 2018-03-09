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
public class Updategeometrysrid1 extends AbstractRoutine<String> {

    private static final long serialVersionUID = -1208977752;

    /**
     * The parameter <code>public.updategeometrysrid.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.updategeometrysrid.catalogn_name</code>.
     */
    public static final Parameter<String> CATALOGN_NAME = createParameter("catalogn_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.updategeometrysrid.schema_name</code>.
     */
    public static final Parameter<String> SCHEMA_NAME = createParameter("schema_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.updategeometrysrid.table_name</code>.
     */
    public static final Parameter<String> TABLE_NAME = createParameter("table_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.updategeometrysrid.column_name</code>.
     */
    public static final Parameter<String> COLUMN_NAME = createParameter("column_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.updategeometrysrid.new_srid_in</code>.
     */
    public static final Parameter<Integer> NEW_SRID_IN = createParameter("new_srid_in", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public Updategeometrysrid1() {
        super("updategeometrysrid", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(CATALOGN_NAME);
        addInParameter(SCHEMA_NAME);
        addInParameter(TABLE_NAME);
        addInParameter(COLUMN_NAME);
        addInParameter(NEW_SRID_IN);
        setOverloaded(true);
    }

    /**
     * Set the <code>catalogn_name</code> parameter IN value to the routine
     */
    public void setCatalognName(String value) {
        setValue(CATALOGN_NAME, value);
    }

    /**
     * Set the <code>catalogn_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setCatalognName(Field<String> field) {
        setField(CATALOGN_NAME, field);
    }

    /**
     * Set the <code>schema_name</code> parameter IN value to the routine
     */
    public void setSchemaName(String value) {
        setValue(SCHEMA_NAME, value);
    }

    /**
     * Set the <code>schema_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSchemaName(Field<String> field) {
        setField(SCHEMA_NAME, field);
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
     * Set the <code>new_srid_in</code> parameter IN value to the routine
     */
    public void setNewSridIn(Integer value) {
        setValue(NEW_SRID_IN, value);
    }

    /**
     * Set the <code>new_srid_in</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNewSridIn(Field<Integer> field) {
        setField(NEW_SRID_IN, field);
    }
}
