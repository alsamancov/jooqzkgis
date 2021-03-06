/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.sources.Public;
import org.jooq.sources.tables.records.GeographyColumnsRecord;


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
public class GeographyColumns extends TableImpl<GeographyColumnsRecord> {

    private static final long serialVersionUID = -1312144421;

    /**
     * The reference instance of <code>public.geography_columns</code>
     */
    public static final GeographyColumns GEOGRAPHY_COLUMNS = new GeographyColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GeographyColumnsRecord> getRecordType() {
        return GeographyColumnsRecord.class;
    }

    /**
     * The column <code>public.geography_columns.f_table_catalog</code>.
     */
    public final TableField<GeographyColumnsRecord, String> F_TABLE_CATALOG = createField("f_table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.geography_columns.f_table_schema</code>.
     */
    public final TableField<GeographyColumnsRecord, String> F_TABLE_SCHEMA = createField("f_table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.geography_columns.f_table_name</code>.
     */
    public final TableField<GeographyColumnsRecord, String> F_TABLE_NAME = createField("f_table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.geography_columns.f_geography_column</code>.
     */
    public final TableField<GeographyColumnsRecord, String> F_GEOGRAPHY_COLUMN = createField("f_geography_column", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.geography_columns.coord_dimension</code>.
     */
    public final TableField<GeographyColumnsRecord, Integer> COORD_DIMENSION = createField("coord_dimension", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.geography_columns.srid</code>.
     */
    public final TableField<GeographyColumnsRecord, Integer> SRID = createField("srid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.geography_columns.type</code>.
     */
    public final TableField<GeographyColumnsRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.geography_columns</code> table reference
     */
    public GeographyColumns() {
        this(DSL.name("geography_columns"), null);
    }

    /**
     * Create an aliased <code>public.geography_columns</code> table reference
     */
    public GeographyColumns(String alias) {
        this(DSL.name(alias), GEOGRAPHY_COLUMNS);
    }

    /**
     * Create an aliased <code>public.geography_columns</code> table reference
     */
    public GeographyColumns(Name alias) {
        this(alias, GEOGRAPHY_COLUMNS);
    }

    private GeographyColumns(Name alias, Table<GeographyColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private GeographyColumns(Name alias, Table<GeographyColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumns as(String alias) {
        return new GeographyColumns(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeographyColumns as(Name alias) {
        return new GeographyColumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GeographyColumns rename(String name) {
        return new GeographyColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GeographyColumns rename(Name name) {
        return new GeographyColumns(name, null);
    }
}
