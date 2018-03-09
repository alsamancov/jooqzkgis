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
public class StAddpoint2 extends AbstractRoutine<Geometry> {

    private static final long serialVersionUID = -365885452;

    /**
     * The parameter <code>public.st_addpoint.RETURN_VALUE</code>.
     */
    public static final Parameter<Geometry> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_addpoint.geom1</code>.
     */
    public static final Parameter<Geometry> GEOM1 = createParameter("geom1", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_addpoint.geom2</code>.
     */
    public static final Parameter<Geometry> GEOM2 = createParameter("geom2", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_addpoint._3</code>.
     */
    public static final Parameter<Integer> _3 = createParameter("_3", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public StAddpoint2() {
        super("st_addpoint", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), new GeometryConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOM1);
        addInParameter(GEOM2);
        addInParameter(_3);
        setOverloaded(true);
    }

    /**
     * Set the <code>geom1</code> parameter IN value to the routine
     */
    public void setGeom1(Geometry value) {
        setValue(GEOM1, value);
    }

    /**
     * Set the <code>geom1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeom1(Field<Geometry> field) {
        setField(GEOM1, field);
    }

    /**
     * Set the <code>geom2</code> parameter IN value to the routine
     */
    public void setGeom2(Geometry value) {
        setValue(GEOM2, value);
    }

    /**
     * Set the <code>geom2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeom2(Field<Geometry> field) {
        setField(GEOM2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Integer value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Integer> field) {
        setField(_3, field);
    }
}
