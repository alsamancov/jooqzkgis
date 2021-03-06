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
import org.jooq.sources.tables.records.StPixelofvalueRecord;


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
public class StPixelofvalue extends TableImpl<StPixelofvalueRecord> {

    private static final long serialVersionUID = -1402146205;

    /**
     * The reference instance of <code>public.st_pixelofvalue</code>
     */
    public static final StPixelofvalue ST_PIXELOFVALUE = new StPixelofvalue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StPixelofvalueRecord> getRecordType() {
        return StPixelofvalueRecord.class;
    }

    /**
     * The column <code>public.st_pixelofvalue.val</code>.
     */
    public final TableField<StPixelofvalueRecord, Double> VAL = createField("val", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_pixelofvalue.val</code>.
     */
    public final TableField<StPixelofvalueRecord, Double> VAL = createField("val", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_pixelofvalue.val</code>.
     */
    public final TableField<StPixelofvalueRecord, Double> VAL = createField("val", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_pixelofvalue.val</code>.
     */
    public final TableField<StPixelofvalueRecord, Double> VAL = createField("val", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_pixelofvalue.x</code>.
     */
    public final TableField<StPixelofvalueRecord, Integer> X = createField("x", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_pixelofvalue.x</code>.
     */
    public final TableField<StPixelofvalueRecord, Integer> X = createField("x", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_pixelofvalue.x</code>.
     */
    public final TableField<StPixelofvalueRecord, Integer> X = createField("x", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_pixelofvalue.x</code>.
     */
    public final TableField<StPixelofvalueRecord, Integer> X = createField("x", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_pixelofvalue.y</code>.
     */
    public final TableField<StPixelofvalueRecord, Integer> Y = createField("y", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_pixelofvalue.y</code>.
     */
    public final TableField<StPixelofvalueRecord, Integer> Y = createField("y", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_pixelofvalue.y</code>.
     */
    public final TableField<StPixelofvalueRecord, Integer> Y = createField("y", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_pixelofvalue.y</code>.
     */
    public final TableField<StPixelofvalueRecord, Integer> Y = createField("y", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.st_pixelofvalue</code> table reference
     */
    public StPixelofvalue() {
        this(DSL.name("st_pixelofvalue"), null);
    }

    /**
     * Create an aliased <code>public.st_pixelofvalue</code> table reference
     */
    public StPixelofvalue(String alias) {
        this(DSL.name(alias), ST_PIXELOFVALUE);
    }

    /**
     * Create an aliased <code>public.st_pixelofvalue</code> table reference
     */
    public StPixelofvalue(Name alias) {
        this(alias, ST_PIXELOFVALUE);
    }

    private StPixelofvalue(Name alias, Table<StPixelofvalueRecord> aliased) {
        this(alias, aliased, new Field[4]);
    }

    private StPixelofvalue(Name alias, Table<StPixelofvalueRecord> aliased, Field<?>[] parameters) {
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
    public StPixelofvalue as(String alias) {
        return new StPixelofvalue(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StPixelofvalue as(Name alias) {
        return new StPixelofvalue(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StPixelofvalue rename(String name) {
        return new StPixelofvalue(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StPixelofvalue rename(Name name) {
        return new StPixelofvalue(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public StPixelofvalue call(Object rast, Integer nband, Double[] search, Boolean excludeNodataValue) {
        return new StPixelofvalue(DSL.name(getName()), null, new Field[] { 
              DSL.val(rast, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"))
            , DSL.val(nband, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(search, org.jooq.impl.SQLDataType.FLOAT.getArrayDataType())
            , DSL.val(excludeNodataValue, org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)))
        });
    }

    /**
     * Call this table-valued function
     */
    public StPixelofvalue call(Field<Object> rast, Field<Integer> nband, Field<Double[]> search, Field<Boolean> excludeNodataValue) {
        return new StPixelofvalue(DSL.name(getName()), null, new Field[] { 
              rast
            , nband
            , search
            , excludeNodataValue
        });
    }
}
