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
import org.jooq.sources.tables.records.StValuepercentRecord;


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
public class StValuepercent extends TableImpl<StValuepercentRecord> {

    private static final long serialVersionUID = 1705586915;

    /**
     * The reference instance of <code>public.st_valuepercent</code>
     */
    public static final StValuepercent ST_VALUEPERCENT = new StValuepercent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StValuepercentRecord> getRecordType() {
        return StValuepercentRecord.class;
    }

    /**
     * The column <code>public.st_valuepercent.value</code>.
     */
    public final TableField<StValuepercentRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.value</code>.
     */
    public final TableField<StValuepercentRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.value</code>.
     */
    public final TableField<StValuepercentRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.value</code>.
     */
    public final TableField<StValuepercentRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.value</code>.
     */
    public final TableField<StValuepercentRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.value</code>.
     */
    public final TableField<StValuepercentRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.percent</code>.
     */
    public final TableField<StValuepercentRecord, Double> PERCENT = createField("percent", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.percent</code>.
     */
    public final TableField<StValuepercentRecord, Double> PERCENT = createField("percent", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.percent</code>.
     */
    public final TableField<StValuepercentRecord, Double> PERCENT = createField("percent", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.percent</code>.
     */
    public final TableField<StValuepercentRecord, Double> PERCENT = createField("percent", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.percent</code>.
     */
    public final TableField<StValuepercentRecord, Double> PERCENT = createField("percent", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_valuepercent.percent</code>.
     */
    public final TableField<StValuepercentRecord, Double> PERCENT = createField("percent", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>public.st_valuepercent</code> table reference
     */
    public StValuepercent() {
        this(DSL.name("st_valuepercent"), null);
    }

    /**
     * Create an aliased <code>public.st_valuepercent</code> table reference
     */
    public StValuepercent(String alias) {
        this(DSL.name(alias), ST_VALUEPERCENT);
    }

    /**
     * Create an aliased <code>public.st_valuepercent</code> table reference
     */
    public StValuepercent(Name alias) {
        this(alias, ST_VALUEPERCENT);
    }

    private StValuepercent(Name alias, Table<StValuepercentRecord> aliased) {
        this(alias, aliased, new Field[5]);
    }

    private StValuepercent(Name alias, Table<StValuepercentRecord> aliased, Field<?>[] parameters) {
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
    public StValuepercent as(String alias) {
        return new StValuepercent(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuepercent as(Name alias) {
        return new StValuepercent(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StValuepercent rename(String name) {
        return new StValuepercent(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StValuepercent rename(Name name) {
        return new StValuepercent(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public StValuepercent call(Object rast, Integer nband, Boolean excludeNodataValue, Double[] searchvalues, Double roundto) {
        return new StValuepercent(DSL.name(getName()), null, new Field[] { 
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
    public StValuepercent call(Field<Object> rast, Field<Integer> nband, Field<Boolean> excludeNodataValue, Field<Double[]> searchvalues, Field<Double> roundto) {
        return new StValuepercent(DSL.name(getName()), null, new Field[] { 
              rast
            , nband
            , excludeNodataValue
            , searchvalues
            , roundto
        });
    }
}
