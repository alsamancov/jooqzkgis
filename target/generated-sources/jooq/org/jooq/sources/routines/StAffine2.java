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
public class StAffine2 extends AbstractRoutine<Geometry> {

    private static final long serialVersionUID = 650352691;

    /**
     * The parameter <code>public.st_affine.RETURN_VALUE</code>.
     */
    public static final Parameter<Geometry> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_affine._1</code>.
     */
    public static final Parameter<Geometry> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, true, new GeometryConverter());

    /**
     * The parameter <code>public.st_affine._2</code>.
     */
    public static final Parameter<Double> _2 = createParameter("_2", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>public.st_affine._3</code>.
     */
    public static final Parameter<Double> _3 = createParameter("_3", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>public.st_affine._4</code>.
     */
    public static final Parameter<Double> _4 = createParameter("_4", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>public.st_affine._5</code>.
     */
    public static final Parameter<Double> _5 = createParameter("_5", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>public.st_affine._6</code>.
     */
    public static final Parameter<Double> _6 = createParameter("_6", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>public.st_affine._7</code>.
     */
    public static final Parameter<Double> _7 = createParameter("_7", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * Create a new routine call instance
     */
    public StAffine2() {
        super("st_affine", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), new GeometryConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
        addInParameter(_6);
        addInParameter(_7);
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

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Double value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Double> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Double value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Double> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Double value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__4(Field<Double> field) {
        setField(_4, field);
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    public void set__5(Double value) {
        setValue(_5, value);
    }

    /**
     * Set the <code>_5</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__5(Field<Double> field) {
        setField(_5, field);
    }

    /**
     * Set the <code>_6</code> parameter IN value to the routine
     */
    public void set__6(Double value) {
        setValue(_6, value);
    }

    /**
     * Set the <code>_6</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__6(Field<Double> field) {
        setField(_6, field);
    }

    /**
     * Set the <code>_7</code> parameter IN value to the routine
     */
    public void set__7(Double value) {
        setValue(_7, value);
    }

    /**
     * Set the <code>_7</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__7(Field<Double> field) {
        setField(_7, field);
    }
}
