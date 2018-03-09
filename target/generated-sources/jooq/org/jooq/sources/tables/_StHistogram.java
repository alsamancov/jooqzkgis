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
import org.jooq.sources.tables.records._StHistogramRecord;


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
public class _StHistogram extends TableImpl<_StHistogramRecord> {

    private static final long serialVersionUID = 1462333438;

    /**
     * The reference instance of <code>public._st_histogram</code>
     */
    public static final _StHistogram _ST_HISTOGRAM = new _StHistogram();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_StHistogramRecord> getRecordType() {
        return _StHistogramRecord.class;
    }

    /**
     * The column <code>public._st_histogram.min</code>.
     */
    public final TableField<_StHistogramRecord, Double> MIN = createField("min", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public._st_histogram.min</code>.
     */
    public final TableField<_StHistogramRecord, Double> MIN = createField("min", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public._st_histogram.max</code>.
     */
    public final TableField<_StHistogramRecord, Double> MAX = createField("max", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public._st_histogram.max</code>.
     */
    public final TableField<_StHistogramRecord, Double> MAX = createField("max", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public._st_histogram.count</code>.
     */
    public final TableField<_StHistogramRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public._st_histogram.count</code>.
     */
    public final TableField<_StHistogramRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public._st_histogram.percent</code>.
     */
    public final TableField<_StHistogramRecord, Double> PERCENT = createField("percent", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public._st_histogram.percent</code>.
     */
    public final TableField<_StHistogramRecord, Double> PERCENT = createField("percent", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>public._st_histogram</code> table reference
     */
    public _StHistogram() {
        this(DSL.name("_st_histogram"), null);
    }

    /**
     * Create an aliased <code>public._st_histogram</code> table reference
     */
    public _StHistogram(String alias) {
        this(DSL.name(alias), _ST_HISTOGRAM);
    }

    /**
     * Create an aliased <code>public._st_histogram</code> table reference
     */
    public _StHistogram(Name alias) {
        this(alias, _ST_HISTOGRAM);
    }

    private _StHistogram(Name alias, Table<_StHistogramRecord> aliased) {
        this(alias, aliased, new Field[8]);
    }

    private _StHistogram(Name alias, Table<_StHistogramRecord> aliased, Field<?>[] parameters) {
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
    public _StHistogram as(String alias) {
        return new _StHistogram(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogram as(Name alias) {
        return new _StHistogram(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public _StHistogram rename(String name) {
        return new _StHistogram(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public _StHistogram rename(Name name) {
        return new _StHistogram(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public _StHistogram call(String rastertable, String rastercolumn, Integer nband, Boolean excludeNodataValue, Double samplePercent, Integer bins, Double[] width, Boolean right) {
        return new _StHistogram(DSL.name(getName()), null, new Field[] { 
              DSL.val(rastertable, org.jooq.impl.SQLDataType.CLOB)
            , DSL.val(rastercolumn, org.jooq.impl.SQLDataType.CLOB)
            , DSL.val(nband, org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)))
            , DSL.val(excludeNodataValue, org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)))
            , DSL.val(samplePercent, org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.DOUBLE)))
            , DSL.val(bins, org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)))
            , DSL.val(width, org.jooq.impl.SQLDataType.FLOAT.getArrayDataType())
            , DSL.val(right, org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)))
        });
    }

    /**
     * Call this table-valued function
     */
    public _StHistogram call(Field<String> rastertable, Field<String> rastercolumn, Field<Integer> nband, Field<Boolean> excludeNodataValue, Field<Double> samplePercent, Field<Integer> bins, Field<Double[]> width, Field<Boolean> right) {
        return new _StHistogram(DSL.name(getName()), null, new Field[] { 
              rastertable
            , rastercolumn
            , nband
            , excludeNodataValue
            , samplePercent
            , bins
            , width
            , right
        });
    }
}