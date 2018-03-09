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
public class Addrasterconstraints3 extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1500534316;

    /**
     * The parameter <code>public.addrasterconstraints.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>public.addrasterconstraints.rastschema</code>.
     */
    public static final Parameter<String> RASTSCHEMA = createParameter("rastschema", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addrasterconstraints.rasttable</code>.
     */
    public static final Parameter<String> RASTTABLE = createParameter("rasttable", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addrasterconstraints.rastcolumn</code>.
     */
    public static final Parameter<String> RASTCOLUMN = createParameter("rastcolumn", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.addrasterconstraints.srid</code>.
     */
    public static final Parameter<Boolean> SRID = createParameter("srid", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.scale_x</code>.
     */
    public static final Parameter<Boolean> SCALE_X = createParameter("scale_x", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.scale_y</code>.
     */
    public static final Parameter<Boolean> SCALE_Y = createParameter("scale_y", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.blocksize_x</code>.
     */
    public static final Parameter<Boolean> BLOCKSIZE_X = createParameter("blocksize_x", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.blocksize_y</code>.
     */
    public static final Parameter<Boolean> BLOCKSIZE_Y = createParameter("blocksize_y", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.same_alignment</code>.
     */
    public static final Parameter<Boolean> SAME_ALIGNMENT = createParameter("same_alignment", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.regular_blocking</code>.
     */
    public static final Parameter<Boolean> REGULAR_BLOCKING = createParameter("regular_blocking", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.num_bands</code>.
     */
    public static final Parameter<Boolean> NUM_BANDS = createParameter("num_bands", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.pixel_types</code>.
     */
    public static final Parameter<Boolean> PIXEL_TYPES = createParameter("pixel_types", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.nodata_values</code>.
     */
    public static final Parameter<Boolean> NODATA_VALUES = createParameter("nodata_values", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.out_db</code>.
     */
    public static final Parameter<Boolean> OUT_DB = createParameter("out_db", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>public.addrasterconstraints.extent</code>.
     */
    public static final Parameter<Boolean> EXTENT = createParameter("extent", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public Addrasterconstraints3() {
        super("addrasterconstraints", Public.PUBLIC, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RASTSCHEMA);
        addInParameter(RASTTABLE);
        addInParameter(RASTCOLUMN);
        addInParameter(SRID);
        addInParameter(SCALE_X);
        addInParameter(SCALE_Y);
        addInParameter(BLOCKSIZE_X);
        addInParameter(BLOCKSIZE_Y);
        addInParameter(SAME_ALIGNMENT);
        addInParameter(REGULAR_BLOCKING);
        addInParameter(NUM_BANDS);
        addInParameter(PIXEL_TYPES);
        addInParameter(NODATA_VALUES);
        addInParameter(OUT_DB);
        addInParameter(EXTENT);
        setOverloaded(true);
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
     * Set the <code>srid</code> parameter IN value to the routine
     */
    public void setSrid(Boolean value) {
        setValue(SRID, value);
    }

    /**
     * Set the <code>srid</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSrid(Field<Boolean> field) {
        setField(SRID, field);
    }

    /**
     * Set the <code>scale_x</code> parameter IN value to the routine
     */
    public void setScaleX(Boolean value) {
        setValue(SCALE_X, value);
    }

    /**
     * Set the <code>scale_x</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setScaleX(Field<Boolean> field) {
        setField(SCALE_X, field);
    }

    /**
     * Set the <code>scale_y</code> parameter IN value to the routine
     */
    public void setScaleY(Boolean value) {
        setValue(SCALE_Y, value);
    }

    /**
     * Set the <code>scale_y</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setScaleY(Field<Boolean> field) {
        setField(SCALE_Y, field);
    }

    /**
     * Set the <code>blocksize_x</code> parameter IN value to the routine
     */
    public void setBlocksizeX(Boolean value) {
        setValue(BLOCKSIZE_X, value);
    }

    /**
     * Set the <code>blocksize_x</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setBlocksizeX(Field<Boolean> field) {
        setField(BLOCKSIZE_X, field);
    }

    /**
     * Set the <code>blocksize_y</code> parameter IN value to the routine
     */
    public void setBlocksizeY(Boolean value) {
        setValue(BLOCKSIZE_Y, value);
    }

    /**
     * Set the <code>blocksize_y</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setBlocksizeY(Field<Boolean> field) {
        setField(BLOCKSIZE_Y, field);
    }

    /**
     * Set the <code>same_alignment</code> parameter IN value to the routine
     */
    public void setSameAlignment(Boolean value) {
        setValue(SAME_ALIGNMENT, value);
    }

    /**
     * Set the <code>same_alignment</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSameAlignment(Field<Boolean> field) {
        setField(SAME_ALIGNMENT, field);
    }

    /**
     * Set the <code>regular_blocking</code> parameter IN value to the routine
     */
    public void setRegularBlocking(Boolean value) {
        setValue(REGULAR_BLOCKING, value);
    }

    /**
     * Set the <code>regular_blocking</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRegularBlocking(Field<Boolean> field) {
        setField(REGULAR_BLOCKING, field);
    }

    /**
     * Set the <code>num_bands</code> parameter IN value to the routine
     */
    public void setNumBands(Boolean value) {
        setValue(NUM_BANDS, value);
    }

    /**
     * Set the <code>num_bands</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNumBands(Field<Boolean> field) {
        setField(NUM_BANDS, field);
    }

    /**
     * Set the <code>pixel_types</code> parameter IN value to the routine
     */
    public void setPixelTypes(Boolean value) {
        setValue(PIXEL_TYPES, value);
    }

    /**
     * Set the <code>pixel_types</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPixelTypes(Field<Boolean> field) {
        setField(PIXEL_TYPES, field);
    }

    /**
     * Set the <code>nodata_values</code> parameter IN value to the routine
     */
    public void setNodataValues(Boolean value) {
        setValue(NODATA_VALUES, value);
    }

    /**
     * Set the <code>nodata_values</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNodataValues(Field<Boolean> field) {
        setField(NODATA_VALUES, field);
    }

    /**
     * Set the <code>out_db</code> parameter IN value to the routine
     */
    public void setOutDb(Boolean value) {
        setValue(OUT_DB, value);
    }

    /**
     * Set the <code>out_db</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setOutDb(Field<Boolean> field) {
        setField(OUT_DB, field);
    }

    /**
     * Set the <code>extent</code> parameter IN value to the routine
     */
    public void setExtent(Boolean value) {
        setValue(EXTENT, value);
    }

    /**
     * Set the <code>extent</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setExtent(Field<Boolean> field) {
        setField(EXTENT, field);
    }
}
