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
public class StCurvetoline1 extends AbstractRoutine<Geometry> {

    private static final long serialVersionUID = -293369420;

    /**
     * The parameter <code>public.st_curvetoline.RETURN_VALUE</code>.
     */
    public static final Parameter<Geometry> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_curvetoline.geom</code>.
     */
    public static final Parameter<Geometry> GEOM = createParameter("geom", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_curvetoline.tol</code>.
     */
    public static final Parameter<Double> TOL = createParameter("tol", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_curvetoline.toltype</code>.
     */
    public static final Parameter<Integer> TOLTYPE = createParameter("toltype", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.st_curvetoline.flags</code>.
     */
    public static final Parameter<Integer> FLAGS = createParameter("flags", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public StCurvetoline1() {
        super("st_curvetoline", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), new GeometryConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOM);
        addInParameter(TOL);
        addInParameter(TOLTYPE);
        addInParameter(FLAGS);
        setOverloaded(true);
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
     * Set the <code>tol</code> parameter IN value to the routine
     */
    public void setTol(Double value) {
        setValue(TOL, value);
    }

    /**
     * Set the <code>tol</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTol(Field<Double> field) {
        setField(TOL, field);
    }

    /**
     * Set the <code>toltype</code> parameter IN value to the routine
     */
    public void setToltype(Integer value) {
        setValue(TOLTYPE, value);
    }

    /**
     * Set the <code>toltype</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setToltype(Field<Integer> field) {
        setField(TOLTYPE, field);
    }

    /**
     * Set the <code>flags</code> parameter IN value to the routine
     */
    public void setFlags(Integer value) {
        setValue(FLAGS, value);
    }

    /**
     * Set the <code>flags</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFlags(Field<Integer> field) {
        setField(FLAGS, field);
    }
}
