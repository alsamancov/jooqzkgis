/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt;


import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;
import org.jooq.sources.Public;
import org.jooq.sources.udt.records.AddbandargRecord;


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
public class Addbandarg extends UDTImpl<AddbandargRecord> {

    private static final long serialVersionUID = 1478253894;

    /**
     * The reference instance of <code>public.addbandarg</code>
     */
    public static final Addbandarg ADDBANDARG = new Addbandarg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddbandargRecord> getRecordType() {
        return AddbandargRecord.class;
    }

    /**
     * The attribute <code>public.addbandarg.index</code>.
     */
    public static final UDTField<AddbandargRecord, Integer> INDEX = createField("index", org.jooq.impl.SQLDataType.INTEGER, ADDBANDARG, "");

    /**
     * The attribute <code>public.addbandarg.pixeltype</code>.
     */
    public static final UDTField<AddbandargRecord, String> PIXELTYPE = createField("pixeltype", org.jooq.impl.SQLDataType.CLOB, ADDBANDARG, "");

    /**
     * The attribute <code>public.addbandarg.initialvalue</code>.
     */
    public static final UDTField<AddbandargRecord, Double> INITIALVALUE = createField("initialvalue", org.jooq.impl.SQLDataType.DOUBLE, ADDBANDARG, "");

    /**
     * The attribute <code>public.addbandarg.nodataval</code>.
     */
    public static final UDTField<AddbandargRecord, Double> NODATAVAL = createField("nodataval", org.jooq.impl.SQLDataType.DOUBLE, ADDBANDARG, "");

    /**
     * No further instances allowed
     */
    private Addbandarg() {
        super("addbandarg", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }
}
