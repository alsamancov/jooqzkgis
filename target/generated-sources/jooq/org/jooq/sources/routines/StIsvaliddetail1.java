/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import com.vividsolutions.jts.geom.Geometry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.sources.Public;
import org.jooq.sources.udt.records.ValidDetailRecord;


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
public class StIsvaliddetail1 extends AbstractRoutine<ValidDetailRecord> {

    private static final long serialVersionUID = 1691805141;

    /**
     * The parameter <code>public.st_isvaliddetail.RETURN_VALUE</code>.
     */
    public static final Parameter<ValidDetailRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.sources.udt.ValidDetail.VALID_DETAIL.getDataType(), false, false);

    /**
     * The parameter <code>public.st_isvaliddetail._1</code>.
     */
    public static final Parameter<Geometry> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, true, new GeometryConverter());

    /**
     * Create a new routine call instance
     */
    public StIsvaliddetail1() {
        super("st_isvaliddetail", Public.PUBLIC, org.jooq.sources.udt.ValidDetail.VALID_DETAIL.getDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Geometry value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Geometry> field) {
        setField(_1, field);
    }
}
