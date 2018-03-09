/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt;


import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;
import org.jooq.sources.Public;
import org.jooq.sources.udt.records.ReclassargRecord;


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
public class Reclassarg extends UDTImpl<ReclassargRecord> {

    private static final long serialVersionUID = 1444560022;

    /**
     * The reference instance of <code>public.reclassarg</code>
     */
    public static final Reclassarg RECLASSARG = new Reclassarg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReclassargRecord> getRecordType() {
        return ReclassargRecord.class;
    }

    /**
     * The attribute <code>public.reclassarg.nband</code>.
     */
    public static final UDTField<ReclassargRecord, Integer> NBAND = createField("nband", org.jooq.impl.SQLDataType.INTEGER, RECLASSARG, "");

    /**
     * The attribute <code>public.reclassarg.reclassexpr</code>.
     */
    public static final UDTField<ReclassargRecord, String> RECLASSEXPR = createField("reclassexpr", org.jooq.impl.SQLDataType.CLOB, RECLASSARG, "");

    /**
     * The attribute <code>public.reclassarg.pixeltype</code>.
     */
    public static final UDTField<ReclassargRecord, String> PIXELTYPE = createField("pixeltype", org.jooq.impl.SQLDataType.CLOB, RECLASSARG, "");

    /**
     * The attribute <code>public.reclassarg.nodataval</code>.
     */
    public static final UDTField<ReclassargRecord, Double> NODATAVAL = createField("nodataval", org.jooq.impl.SQLDataType.DOUBLE, RECLASSARG, "");

    /**
     * No further instances allowed
     */
    private Reclassarg() {
        super("reclassarg", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }
}
