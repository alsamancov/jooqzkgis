/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.records;


import com.vividsolutions.jts.geom.Geometry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;
import org.jooq.sources.tables.RasterColumns;


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
public class RasterColumnsRecord extends TableRecordImpl<RasterColumnsRecord> implements Record17<String, String, String, String, Integer, Double, Double, Integer, Integer, Boolean, Boolean, Integer, String[], Double[], Boolean[], Geometry, Boolean> {

    private static final long serialVersionUID = 313463283;

    /**
     * Setter for <code>public.raster_columns.r_table_catalog</code>.
     */
    public void setRTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.raster_columns.r_table_catalog</code>.
     */
    public String getRTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.raster_columns.r_table_schema</code>.
     */
    public void setRTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.raster_columns.r_table_schema</code>.
     */
    public String getRTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.raster_columns.r_table_name</code>.
     */
    public void setRTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.raster_columns.r_table_name</code>.
     */
    public String getRTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.raster_columns.r_raster_column</code>.
     */
    public void setRRasterColumn(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.raster_columns.r_raster_column</code>.
     */
    public String getRRasterColumn() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.raster_columns.srid</code>.
     */
    public void setSrid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.raster_columns.srid</code>.
     */
    public Integer getSrid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.raster_columns.scale_x</code>.
     */
    public void setScaleX(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.raster_columns.scale_x</code>.
     */
    public Double getScaleX() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.raster_columns.scale_y</code>.
     */
    public void setScaleY(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.raster_columns.scale_y</code>.
     */
    public Double getScaleY() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.raster_columns.blocksize_x</code>.
     */
    public void setBlocksizeX(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.raster_columns.blocksize_x</code>.
     */
    public Integer getBlocksizeX() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.raster_columns.blocksize_y</code>.
     */
    public void setBlocksizeY(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.raster_columns.blocksize_y</code>.
     */
    public Integer getBlocksizeY() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.raster_columns.same_alignment</code>.
     */
    public void setSameAlignment(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.raster_columns.same_alignment</code>.
     */
    public Boolean getSameAlignment() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.raster_columns.regular_blocking</code>.
     */
    public void setRegularBlocking(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.raster_columns.regular_blocking</code>.
     */
    public Boolean getRegularBlocking() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.raster_columns.num_bands</code>.
     */
    public void setNumBands(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.raster_columns.num_bands</code>.
     */
    public Integer getNumBands() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.raster_columns.pixel_types</code>.
     */
    public void setPixelTypes(String... value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.raster_columns.pixel_types</code>.
     */
    public String[] getPixelTypes() {
        return (String[]) get(12);
    }

    /**
     * Setter for <code>public.raster_columns.nodata_values</code>.
     */
    public void setNodataValues(Double... value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.raster_columns.nodata_values</code>.
     */
    public Double[] getNodataValues() {
        return (Double[]) get(13);
    }

    /**
     * Setter for <code>public.raster_columns.out_db</code>.
     */
    public void setOutDb(Boolean... value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.raster_columns.out_db</code>.
     */
    public Boolean[] getOutDb() {
        return (Boolean[]) get(14);
    }

    /**
     * Setter for <code>public.raster_columns.extent</code>.
     */
    public void setExtent(Geometry value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.raster_columns.extent</code>.
     */
    public Geometry getExtent() {
        return (Geometry) get(15);
    }

    /**
     * Setter for <code>public.raster_columns.spatial_index</code>.
     */
    public void setSpatialIndex(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.raster_columns.spatial_index</code>.
     */
    public Boolean getSpatialIndex() {
        return (Boolean) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, Integer, Double, Double, Integer, Integer, Boolean, Boolean, Integer, String[], Double[], Boolean[], Geometry, Boolean> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, Integer, Double, Double, Integer, Integer, Boolean, Boolean, Integer, String[], Double[], Boolean[], Geometry, Boolean> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RasterColumns.RASTER_COLUMNS.R_TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RasterColumns.RASTER_COLUMNS.R_TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RasterColumns.RASTER_COLUMNS.R_TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RasterColumns.RASTER_COLUMNS.R_RASTER_COLUMN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return RasterColumns.RASTER_COLUMNS.SRID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return RasterColumns.RASTER_COLUMNS.SCALE_X;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return RasterColumns.RASTER_COLUMNS.SCALE_Y;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return RasterColumns.RASTER_COLUMNS.BLOCKSIZE_X;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return RasterColumns.RASTER_COLUMNS.BLOCKSIZE_Y;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return RasterColumns.RASTER_COLUMNS.SAME_ALIGNMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return RasterColumns.RASTER_COLUMNS.REGULAR_BLOCKING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return RasterColumns.RASTER_COLUMNS.NUM_BANDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field13() {
        return RasterColumns.RASTER_COLUMNS.PIXEL_TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double[]> field14() {
        return RasterColumns.RASTER_COLUMNS.NODATA_VALUES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean[]> field15() {
        return RasterColumns.RASTER_COLUMNS.OUT_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Geometry> field16() {
        return RasterColumns.RASTER_COLUMNS.EXTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return RasterColumns.RASTER_COLUMNS.SPATIAL_INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRRasterColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getScaleX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getScaleY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getBlocksizeX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getBlocksizeY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getSameAlignment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getRegularBlocking();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getNumBands();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component13() {
        return getPixelTypes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double[] component14() {
        return getNodataValues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean[] component15() {
        return getOutDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geometry component16() {
        return getExtent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component17() {
        return getSpatialIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRRasterColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getScaleX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getScaleY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getBlocksizeX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getBlocksizeY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getSameAlignment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getRegularBlocking();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getNumBands();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value13() {
        return getPixelTypes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double[] value14() {
        return getNodataValues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean[] value15() {
        return getOutDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geometry value16() {
        return getExtent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getSpatialIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value1(String value) {
        setRTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value2(String value) {
        setRTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value3(String value) {
        setRTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value4(String value) {
        setRRasterColumn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value5(Integer value) {
        setSrid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value6(Double value) {
        setScaleX(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value7(Double value) {
        setScaleY(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value8(Integer value) {
        setBlocksizeX(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value9(Integer value) {
        setBlocksizeY(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value10(Boolean value) {
        setSameAlignment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value11(Boolean value) {
        setRegularBlocking(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value12(Integer value) {
        setNumBands(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value13(String... value) {
        setPixelTypes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value14(Double... value) {
        setNodataValues(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value15(Boolean... value) {
        setOutDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value16(Geometry value) {
        setExtent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord value17(Boolean value) {
        setSpatialIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RasterColumnsRecord values(String value1, String value2, String value3, String value4, Integer value5, Double value6, Double value7, Integer value8, Integer value9, Boolean value10, Boolean value11, Integer value12, String[] value13, Double[] value14, Boolean[] value15, Geometry value16, Boolean value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RasterColumnsRecord
     */
    public RasterColumnsRecord() {
        super(RasterColumns.RASTER_COLUMNS);
    }

    /**
     * Create a detached, initialised RasterColumnsRecord
     */
    public RasterColumnsRecord(String rTableCatalog, String rTableSchema, String rTableName, String rRasterColumn, Integer srid, Double scaleX, Double scaleY, Integer blocksizeX, Integer blocksizeY, Boolean sameAlignment, Boolean regularBlocking, Integer numBands, String[] pixelTypes, Double[] nodataValues, Boolean[] outDb, Geometry extent, Boolean spatialIndex) {
        super(RasterColumns.RASTER_COLUMNS);

        set(0, rTableCatalog);
        set(1, rTableSchema);
        set(2, rTableName);
        set(3, rRasterColumn);
        set(4, srid);
        set(5, scaleX);
        set(6, scaleY);
        set(7, blocksizeX);
        set(8, blocksizeY);
        set(9, sameAlignment);
        set(10, regularBlocking);
        set(11, numBands);
        set(12, pixelTypes);
        set(13, nodataValues);
        set(14, outDb);
        set(15, extent);
        set(16, spatialIndex);
    }
}