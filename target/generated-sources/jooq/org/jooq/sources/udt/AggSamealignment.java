/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt;


import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;
import org.jooq.sources.Public;
import org.jooq.sources.udt.records.AggSamealignmentRecord;


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
public class AggSamealignment extends UDTImpl<AggSamealignmentRecord> {

    private static final long serialVersionUID = 403844935;

    /**
     * The reference instance of <code>public.agg_samealignment</code>
     */
    public static final AggSamealignment AGG_SAMEALIGNMENT = new AggSamealignment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AggSamealignmentRecord> getRecordType() {
        return AggSamealignmentRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final UDTField<AggSamealignmentRecord, Object> REFRASTER = createField("refraster", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), AGG_SAMEALIGNMENT, "");

    /**
     * The attribute <code>public.agg_samealignment.aligned</code>.
     */
    public static final UDTField<AggSamealignmentRecord, Boolean> ALIGNED = createField("aligned", org.jooq.impl.SQLDataType.BOOLEAN, AGG_SAMEALIGNMENT, "");

    /**
     * No further instances allowed
     */
    private AggSamealignment() {
        super("agg_samealignment", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }
}