/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.sources.Public;
import org.jooq.sources.udt.records.SummarystatsRecord;


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
public class StSummarystatsagg3 extends AbstractRoutine<SummarystatsRecord> {

    private static final long serialVersionUID = -829043028;

    /**
     * The parameter <code>public.st_summarystatsagg.RETURN_VALUE</code>.
     */
    public static final Parameter<SummarystatsRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.sources.udt.Summarystats.SUMMARYSTATS.getDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, true);

    /**
     * The parameter <code>public.st_summarystatsagg._2</code>.
     */
    public static final Parameter<Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * The parameter <code>public.st_summarystatsagg._3</code>.
     */
    public static final Parameter<Boolean> _3 = createParameter("_3", org.jooq.impl.SQLDataType.BOOLEAN, false, true);

    /**
     * Create a new routine call instance
     */
    public StSummarystatsagg3() {
        super("st_summarystatsagg", Public.PUBLIC, org.jooq.sources.udt.Summarystats.SUMMARYSTATS.getDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Integer value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Integer> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Boolean value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Boolean> field) {
        setField(_3, field);
    }
}
