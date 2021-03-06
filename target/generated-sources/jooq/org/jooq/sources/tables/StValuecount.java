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
import org.jooq.sources.tables.records.StValuecountRecord;


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
public class StValuecount extends TableImpl<StValuecountRecord> {

    private static final long serialVersionUID = 1939189579;

    /**
     * The reference instance of <code>public.st_valuecount</code>
     */
    public static final StValuecount ST_VALUECOUNT = new StValuecount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StValuecountRecord> getRecordType() {
        return StValuecountRecord.class;
    }

    /**
     * The column <code>public.st_valuecount.value</code>.
     */
    public final TableField<StValuecountRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuecount.value</code>.
     */
    public final TableField<StValuecountRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuecount.value</code>.
     */
    public final TableField<StValuecountRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuecount.value</code>.
     */
    public final TableField<StValuecountRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuecount.value</code>.
     */
    public final TableField<StValuecountRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuecount.value</code>.
     */
    public final TableField<StValuecountRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuecount.count</code>.
     */
    public final TableField<StValuecountRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_valuecount.count</code>.
     */
    public final TableField<StValuecountRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_valuecount.count</code>.
     */
    public final TableField<StValuecountRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_valuecount.count</code>.
     */
    public final TableField<StValuecountRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_valuecount.count</code>.
     */
    public final TableField<StValuecountRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_valuecount.count</code>.
     */
    public final TableField<StValuecountRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.st_valuecount</code> table reference
     */
    public StValuecount() {
        this(DSL.name("st_valuecount"), null);
    }

    /**
     * Create an aliased <code>public.st_valuecount</code> table reference
     */
    public StValuecount(String alias) {
        this(DSL.name(alias), ST_VALUECOUNT);
    }

    /**
     * Create an aliased <code>public.st_valuecount</code> table reference
     */
    public StValuecount(Name alias) {
        this(alias, ST_VALUECOUNT);
    }

    private StValuecount(Name alias, Table<StValuecountRecord> aliased) {
        this(alias, aliased, new Field[5]);
    }

    private StValuecount(Name alias, Table<StValuecountRecord> aliased, Field<?>[] parameters) {
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
    public StValuecount as(String alias) {
        return new StValuecount(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecount as(Name alias) {
        return new StValuecount(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StValuecount rename(String name) {
        return new StValuecount(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StValuecount rename(Name name) {
        return new StValuecount(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public StValuecount call(Object rast, Integer nband, Boolean excludeNodataValue, Double[] searchvalues, Double roundto) {
        return new StValuecount(DSL.name(getName()), null, new Field[] { 
              DSL.val(rast, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"))
            , DSL.val(nband, org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)))
            , DSL.val(excludeNodataValue, org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)))
            , DSL.val(searchvalues, org.jooq.impl.SQLDataType.FLOAT.getArrayDataType())
            , DSL.val(roundto, org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)))
        });
    }

    /**
     * Call this table-valued function
     */
    public StValuecount call(Field<Object> rast, Field<Integer> nband, Field<Boolean> excludeNodataValue, Field<Double[]> searchvalues, Field<Double> roundto) {
        return new StValuecount(DSL.name(getName()), null, new Field[] { 
              rast
            , nband
            , excludeNodataValue
            , searchvalues
            , roundto
        });
    }
}
