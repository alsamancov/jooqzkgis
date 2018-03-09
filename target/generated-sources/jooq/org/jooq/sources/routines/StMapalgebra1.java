/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.sources.Public;
import org.jooq.sources.udt.records.RastbandargRecord;



/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
 */
@java.lang.Deprecated
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StMapalgebra1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 2007771620;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_mapalgebra.rastbandargset</code>.
     */
    public static final Parameter<RastbandargRecord[]> RASTBANDARGSET = createParameter("rastbandargset", org.jooq.sources.udt.Rastbandarg.RASTBANDARG.getDataType().getArrayDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> CALLBACKFUNC = createParameter("callbackfunc", org.jooq.impl.DefaultDataType.getDefaultDataType("regprocedure"), false, false);

    /**
     * The parameter <code>public.st_mapalgebra.pixeltype</code>.
     */
    public static final Parameter<String> PIXELTYPE = createParameter("pixeltype", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * The parameter <code>public.st_mapalgebra.extenttype</code>.
     */
    public static final Parameter<String> EXTENTTYPE = createParameter("extenttype", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("'INTERSECTION'::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> CUSTOMEXTENT = createParameter("customextent", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), true, false);

    /**
     * The parameter <code>public.st_mapalgebra.distancex</code>.
     */
    public static final Parameter<Integer> DISTANCEX = createParameter("distancex", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>public.st_mapalgebra.distancey</code>.
     */
    public static final Parameter<Integer> DISTANCEY = createParameter("distancey", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * The parameter <code>public.st_mapalgebra.userargs</code>.
     */
    public static final Parameter<String[]> USERARGS = createParameter("userargs", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), true, false);

    /**
     * Create a new routine call instance
     */
    public StMapalgebra1() {
        super("st_mapalgebra", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RASTBANDARGSET);
        addInParameter(CALLBACKFUNC);
        addInParameter(PIXELTYPE);
        addInParameter(EXTENTTYPE);
        addInParameter(CUSTOMEXTENT);
        addInParameter(DISTANCEX);
        addInParameter(DISTANCEY);
        addInParameter(USERARGS);
        setOverloaded(true);
    }

    /**
     * Set the <code>rastbandargset</code> parameter IN value to the routine
     */
    public void setRastbandargset(RastbandargRecord... value) {
        setValue(RASTBANDARGSET, value);
    }

    /**
     * Set the <code>rastbandargset</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRastbandargset(Field<RastbandargRecord[]> field) {
        setField(RASTBANDARGSET, field);
    }

    /**
     * Set the <code>callbackfunc</code> parameter IN value to the routine
     */
    public void setCallbackfunc(Object value) {
        setValue(CALLBACKFUNC, value);
    }

    /**
     * Set the <code>callbackfunc</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setCallbackfunc(Field<Object> field) {
        setField(CALLBACKFUNC, field);
    }

    /**
     * Set the <code>pixeltype</code> parameter IN value to the routine
     */
    public void setPixeltype(String value) {
        setValue(PIXELTYPE, value);
    }

    /**
     * Set the <code>pixeltype</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPixeltype(Field<String> field) {
        setField(PIXELTYPE, field);
    }

    /**
     * Set the <code>extenttype</code> parameter IN value to the routine
     */
    public void setExtenttype(String value) {
        setValue(EXTENTTYPE, value);
    }

    /**
     * Set the <code>extenttype</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setExtenttype(Field<String> field) {
        setField(EXTENTTYPE, field);
    }

    /**
     * Set the <code>customextent</code> parameter IN value to the routine
     */
    public void setCustomextent(Object value) {
        setValue(CUSTOMEXTENT, value);
    }

    /**
     * Set the <code>customextent</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setCustomextent(Field<Object> field) {
        setField(CUSTOMEXTENT, field);
    }

    /**
     * Set the <code>distancex</code> parameter IN value to the routine
     */
    public void setDistancex(Integer value) {
        setValue(DISTANCEX, value);
    }

    /**
     * Set the <code>distancex</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDistancex(Field<Integer> field) {
        setField(DISTANCEX, field);
    }

    /**
     * Set the <code>distancey</code> parameter IN value to the routine
     */
    public void setDistancey(Integer value) {
        setValue(DISTANCEY, value);
    }

    /**
     * Set the <code>distancey</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDistancey(Field<Integer> field) {
        setField(DISTANCEY, field);
    }

    /**
     * Set the <code>userargs</code> parameter IN value to the routine
     */
    public void setUserargs(String... value) {
        setValue(USERARGS, value);
    }

    /**
     * Set the <code>userargs</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUserargs(Field<String[]> field) {
        setField(USERARGS, field);
    }
}
