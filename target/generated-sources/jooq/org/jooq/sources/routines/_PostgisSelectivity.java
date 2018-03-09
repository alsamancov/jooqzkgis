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
public class _PostgisSelectivity extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 2055001103;

    /**
     * The parameter <code>public._postgis_selectivity.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> TBL = createParameter("tbl", org.jooq.impl.DefaultDataType.getDefaultDataType("regclass"), false, false);

    /**
     * The parameter <code>public._postgis_selectivity.att_name</code>.
     */
    public static final Parameter<String> ATT_NAME = createParameter("att_name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public._postgis_selectivity.geom</code>.
     */
    public static final Parameter<Geometry> GEOM = createParameter("geom", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public._postgis_selectivity.mode</code>.
     */
    public static final Parameter<String> MODE = createParameter("mode", org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("'2'::text", org.jooq.impl.SQLDataType.CLOB)), true, false);

    /**
     * Create a new routine call instance
     */
    public _PostgisSelectivity() {
        super("_postgis_selectivity", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TBL);
        addInParameter(ATT_NAME);
        addInParameter(GEOM);
        addInParameter(MODE);
    }

    /**
     * Set the <code>tbl</code> parameter IN value to the routine
     */
    public void setTbl(Object value) {
        setValue(TBL, value);
    }

    /**
     * Set the <code>tbl</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTbl(Field<Object> field) {
        setField(TBL, field);
    }

    /**
     * Set the <code>att_name</code> parameter IN value to the routine
     */
    public void setAttName(String value) {
        setValue(ATT_NAME, value);
    }

    /**
     * Set the <code>att_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setAttName(Field<String> field) {
        setField(ATT_NAME, field);
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
     * Set the <code>mode</code> parameter IN value to the routine
     */
    public void setMode(String value) {
        setValue(MODE, value);
    }

    /**
     * Set the <code>mode</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMode(Field<String> field) {
        setField(MODE, field);
    }
}
