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
public class StAsencodedpolyline extends AbstractRoutine<String> {

    private static final long serialVersionUID = -1346907373;

    /**
     * The parameter <code>public.st_asencodedpolyline.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_asencodedpolyline.geom</code>.
     */
    public static final Parameter<Geometry> GEOM = createParameter("geom", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_asencodedpolyline._2</code>.
     */
    public static final Parameter<Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("5", org.jooq.impl.SQLDataType.INTEGER)), true, true);

    /**
     * Create a new routine call instance
     */
    public StAsencodedpolyline() {
        super("st_asencodedpolyline", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOM);
        addInParameter(_2);
    }

    /**
     * Set the <code>geom</code> parameter IN value to the routine
     */
    public void setGeom(Geometry value) {
        setValue(GEOM, value);
    }

    /**
     * Set the <code>geom</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeom(Field<Geometry> field) {
        setField(GEOM, field);
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
}