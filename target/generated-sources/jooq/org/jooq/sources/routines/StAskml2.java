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
public class StAskml2 extends AbstractRoutine<String> {

    private static final long serialVersionUID = -1555539883;

    /**
     * The parameter <code>public.st_askml.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_askml.version</code>.
     */
    public static final Parameter<Integer> VERSION = createParameter("version", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.st_askml.geom</code>.
     */
    public static final Parameter<Geometry> GEOM = createParameter("geom", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_askml.maxdecimaldigits</code>.
     */
    public static final Parameter<Integer> MAXDECIMALDIGITS = createParameter("maxdecimaldigits", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("15", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>public.st_askml.nprefix</code>.
     */
    public static final Parameter<String> NPREFIX = createParameter("nprefix", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * Create a new routine call instance
     */
    public StAskml2() {
        super("st_askml", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(VERSION);
        addInParameter(GEOM);
        addInParameter(MAXDECIMALDIGITS);
        addInParameter(NPREFIX);
        setOverloaded(true);
    }

    /**
     * Set the <code>version</code> parameter IN value to the routine
     */
    public void setVersion(Integer value) {
        setValue(VERSION, value);
    }

    /**
     * Set the <code>version</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setVersion(Field<Integer> field) {
        setField(VERSION, field);
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
     * Set the <code>maxdecimaldigits</code> parameter IN value to the routine
     */
    public void setMaxdecimaldigits(Integer value) {
        setValue(MAXDECIMALDIGITS, value);
    }

    /**
     * Set the <code>maxdecimaldigits</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMaxdecimaldigits(Field<Integer> field) {
        setField(MAXDECIMALDIGITS, field);
    }

    /**
     * Set the <code>nprefix</code> parameter IN value to the routine
     */
    public void setNprefix(String value) {
        setValue(NPREFIX, value);
    }

    /**
     * Set the <code>nprefix</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNprefix(Field<String> field) {
        setField(NPREFIX, field);
    }
}