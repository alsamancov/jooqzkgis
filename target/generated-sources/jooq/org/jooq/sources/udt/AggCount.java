/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt;


import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;
import org.jooq.sources.Public;
import org.jooq.sources.udt.records.AggCountRecord;


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
public class AggCount extends UDTImpl<AggCountRecord> {

    private static final long serialVersionUID = -966515352;

    /**
     * The reference instance of <code>public.agg_count</code>
     */
    public static final AggCount AGG_COUNT = new AggCount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AggCountRecord> getRecordType() {
        return AggCountRecord.class;
    }

    /**
     * The attribute <code>public.agg_count.count</code>.
     */
    public static final UDTField<AggCountRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, AGG_COUNT, "");

    /**
     * The attribute <code>public.agg_count.nband</code>.
     */
    public static final UDTField<AggCountRecord, Integer> NBAND = createField("nband", org.jooq.impl.SQLDataType.INTEGER, AGG_COUNT, "");

    /**
     * The attribute <code>public.agg_count.exclude_nodata_value</code>.
     */
    public static final UDTField<AggCountRecord, Boolean> EXCLUDE_NODATA_VALUE = createField("exclude_nodata_value", org.jooq.impl.SQLDataType.BOOLEAN, AGG_COUNT, "");

    /**
     * The attribute <code>public.agg_count.sample_percent</code>.
     */
    public static final UDTField<AggCountRecord, Double> SAMPLE_PERCENT = createField("sample_percent", org.jooq.impl.SQLDataType.DOUBLE, AGG_COUNT, "");

    /**
     * No further instances allowed
     */
    private AggCount() {
        super("agg_count", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }
}