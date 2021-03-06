/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
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
public class _StCountaggFinalfn extends AbstractRoutine<Long> {

    private static final long serialVersionUID = -533874723;

    /**
     * The parameter <code>public._st_countagg_finalfn.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>public._st_countagg_finalfn.agg</code>.
     */
    public static final Parameter<AggCountRecord> AGG = createParameter("agg", org.jooq.sources.udt.AggCount.AGG_COUNT.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public _StCountaggFinalfn() {
        super("_st_countagg_finalfn", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(AGG);
    }

    /**
     * Set the <code>agg</code> parameter IN value to the routine
     */
    public void setAgg(AggCountRecord value) {
        setValue(AGG, value);
    }

    /**
     * Set the <code>agg</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setAgg(Field<AggCountRecord> field) {
        setField(AGG, field);
    }
}
