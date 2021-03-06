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
public class _StMapalgebra2 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 111965842;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public._st_mapalgebra.rastbandargset</code>.
     */
    public static final Parameter<RastbandargRecord[]> RASTBANDARGSET = createParameter("rastbandargset", org.jooq.sources.udt.Rastbandarg.RASTBANDARG.getDataType().getArrayDataType(), false, false);

    /**
     * The parameter <code>public._st_mapalgebra.expression</code>.
     */
    public static final Parameter<String> EXPRESSION = createParameter("expression", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public._st_mapalgebra.pixeltype</code>.
     */
    public static final Parameter<String> PIXELTYPE = createParameter("pixeltype", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * The parameter <code>public._st_mapalgebra.extenttype</code>.
     */
    public static final Parameter<String> EXTENTTYPE = createParameter("extenttype", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("'INTERSECTION'::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * The parameter <code>public._st_mapalgebra.nodata1expr</code>.
     */
    public static final Parameter<String> NODATA1EXPR = createParameter("nodata1expr", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * The parameter <code>public._st_mapalgebra.nodata2expr</code>.
     */
    public static final Parameter<String> NODATA2EXPR = createParameter("nodata2expr", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * The parameter <code>public._st_mapalgebra.nodatanodataval</code>.
     */
    public static final Parameter<Double> NODATANODATAVAL = createParameter("nodatanodataval", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.field("NULL::double precision", org.jooq.impl.SQLDataType.DOUBLE)), true, false);

    /**
     * Create a new routine call instance
     */
    public _StMapalgebra2() {
        super("_st_mapalgebra", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RASTBANDARGSET);
        addInParameter(EXPRESSION);
        addInParameter(PIXELTYPE);
        addInParameter(EXTENTTYPE);
        addInParameter(NODATA1EXPR);
        addInParameter(NODATA2EXPR);
        addInParameter(NODATANODATAVAL);
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
     * Set the <code>expression</code> parameter IN value to the routine
     */
    public void setExpression(String value) {
        setValue(EXPRESSION, value);
    }

    /**
     * Set the <code>expression</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setExpression(Field<String> field) {
        setField(EXPRESSION, field);
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
     * Set the <code>nodata1expr</code> parameter IN value to the routine
     */
    public void setNodata1expr(String value) {
        setValue(NODATA1EXPR, value);
    }

    /**
     * Set the <code>nodata1expr</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNodata1expr(Field<String> field) {
        setField(NODATA1EXPR, field);
    }

    /**
     * Set the <code>nodata2expr</code> parameter IN value to the routine
     */
    public void setNodata2expr(String value) {
        setValue(NODATA2EXPR, value);
    }

    /**
     * Set the <code>nodata2expr</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNodata2expr(Field<String> field) {
        setField(NODATA2EXPR, field);
    }

    /**
     * Set the <code>nodatanodataval</code> parameter IN value to the routine
     */
    public void setNodatanodataval(Double value) {
        setValue(NODATANODATAVAL, value);
    }

    /**
     * Set the <code>nodatanodataval</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNodatanodataval(Field<Double> field) {
        setField(NODATANODATAVAL, field);
    }
}
