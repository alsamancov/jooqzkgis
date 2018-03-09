/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


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
public class _RasterConstraintInfoScale extends AbstractRoutine<Double> {

    private static final long serialVersionUID = -1037654818;

    /**
     * The parameter <code>public._raster_constraint_info_scale.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public._raster_constraint_info_scale.rastschema</code>.
     */
    public static final Parameter<String> RASTSCHEMA = createParameter("rastschema", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public._raster_constraint_info_scale.rasttable</code>.
     */
    public static final Parameter<String> RASTTABLE = createParameter("rasttable", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public._raster_constraint_info_scale.rastcolumn</code>.
     */
    public static final Parameter<String> RASTCOLUMN = createParameter("rastcolumn", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public._raster_constraint_info_scale.axis</code>.
     */
    public static final Parameter<String> AXIS = createParameter("axis", org.jooq.impl.SQLDataType.CHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public _RasterConstraintInfoScale() {
        super("_raster_constraint_info_scale", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RASTSCHEMA);
        addInParameter(RASTTABLE);
        addInParameter(RASTCOLUMN);
        addInParameter(AXIS);
    }

    /**
     * Set the <code>rastschema</code> parameter IN value to the routine
     */
    public void setRastschema(String value) {
        setValue(RASTSCHEMA, value);
    }

    /**
     * Set the <code>rastschema</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRastschema(Field<String> field) {
        setField(RASTSCHEMA, field);
    }

    /**
     * Set the <code>rasttable</code> parameter IN value to the routine
     */
    public void setRasttable(String value) {
        setValue(RASTTABLE, value);
    }

    /**
     * Set the <code>rasttable</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRasttable(Field<String> field) {
        setField(RASTTABLE, field);
    }

    /**
     * Set the <code>rastcolumn</code> parameter IN value to the routine
     */
    public void setRastcolumn(String value) {
        setValue(RASTCOLUMN, value);
    }

    /**
     * Set the <code>rastcolumn</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRastcolumn(Field<String> field) {
        setField(RASTCOLUMN, field);
    }

    /**
     * Set the <code>axis</code> parameter IN value to the routine
     */
    public void setAxis(String value) {
        setValue(AXIS, value);
    }

    /**
     * Set the <code>axis</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setAxis(Field<String> field) {
        setField(AXIS, field);
    }
}
