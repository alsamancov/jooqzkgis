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
import org.jooq.sources.tables.records.StGdaldriversRecord;


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
public class StGdaldrivers extends TableImpl<StGdaldriversRecord> {

    private static final long serialVersionUID = 617850119;

    /**
     * The reference instance of <code>public.st_gdaldrivers</code>
     */
    public static final StGdaldrivers ST_GDALDRIVERS = new StGdaldrivers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StGdaldriversRecord> getRecordType() {
        return StGdaldriversRecord.class;
    }

    /**
     * The column <code>public.st_gdaldrivers.idx</code>.
     */
    public final TableField<StGdaldriversRecord, Integer> IDX = createField("idx", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_gdaldrivers.short_name</code>.
     */
    public final TableField<StGdaldriversRecord, String> SHORT_NAME = createField("short_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.st_gdaldrivers.long_name</code>.
     */
    public final TableField<StGdaldriversRecord, String> LONG_NAME = createField("long_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.st_gdaldrivers.create_options</code>.
     */
    public final TableField<StGdaldriversRecord, String> CREATE_OPTIONS = createField("create_options", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.st_gdaldrivers</code> table reference
     */
    public StGdaldrivers() {
        this(DSL.name("st_gdaldrivers"), null);
    }

    /**
     * Create an aliased <code>public.st_gdaldrivers</code> table reference
     */
    public StGdaldrivers(String alias) {
        this(DSL.name(alias), ST_GDALDRIVERS);
    }

    /**
     * Create an aliased <code>public.st_gdaldrivers</code> table reference
     */
    public StGdaldrivers(Name alias) {
        this(alias, ST_GDALDRIVERS);
    }

    private StGdaldrivers(Name alias, Table<StGdaldriversRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private StGdaldrivers(Name alias, Table<StGdaldriversRecord> aliased, Field<?>[] parameters) {
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
    public StGdaldrivers as(String alias) {
        return new StGdaldrivers(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StGdaldrivers as(Name alias) {
        return new StGdaldrivers(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StGdaldrivers rename(String name) {
        return new StGdaldrivers(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StGdaldrivers rename(Name name) {
        return new StGdaldrivers(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public StGdaldrivers call() {
        return new StGdaldrivers(DSL.name(getName()), null, new Field[] { 
        });
    }
}
