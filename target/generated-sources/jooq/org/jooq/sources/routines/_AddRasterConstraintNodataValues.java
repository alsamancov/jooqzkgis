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
public class _AddRasterConstraintNodataValues extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = -1849831255;

    /**
     * The parameter <code>public._add_raster_constraint_nodata_values.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>public._add_raster_constraint_nodata_values.rastschema</code>.
     */
    public static final Parameter<String> RASTSCHEMA = createParameter("rastschema", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public._add_raster_constraint_nodata_values.rasttable</code>.
     */
    public static final Parameter<String> RASTTABLE = createParameter("rasttable", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public._add_raster_constraint_nodata_values.rastcolumn</code>.
     */
    public static final Parameter<String> RASTCOLUMN = createParameter("rastcolumn", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public _AddRasterConstraintNodataValues() {
        super("_add_raster_constraint_nodata_values", Public.PUBLIC, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RASTSCHEMA);
        addInParameter(RASTTABLE);
        addInParameter(RASTCOLUMN);
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
}
