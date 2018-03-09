/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;
import org.jooq.sources.tables.GeometryColumns;


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
public class GeometryColumnsRecord extends TableRecordImpl<GeometryColumnsRecord> implements Record7<String, String, String, String, Integer, Integer, String> {

    private static final long serialVersionUID = 1308758675;

    /**
     * Setter for <code>public.geometry_columns.f_table_catalog</code>.
     */
    public void setFTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.geometry_columns.f_table_catalog</code>.
     */
    public String getFTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.geometry_columns.f_table_schema</code>.
     */
    public void setFTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.geometry_columns.f_table_schema</code>.
     */
    public String getFTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.geometry_columns.f_table_name</code>.
     */
    public void setFTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.geometry_columns.f_table_name</code>.
     */
    public String getFTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.geometry_columns.f_geometry_column</code>.
     */
    public void setFGeometryColumn(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.geometry_columns.f_geometry_column</code>.
     */
    public String getFGeometryColumn() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.geometry_columns.coord_dimension</code>.
     */
    public void setCoordDimension(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.geometry_columns.coord_dimension</code>.
     */
    public Integer getCoordDimension() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.geometry_columns.srid</code>.
     */
    public void setSrid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.geometry_columns.srid</code>.
     */
    public Integer getSrid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.geometry_columns.type</code>.
     */
    public void setType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.geometry_columns.type</code>.
     */
    public String getType() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Integer, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, Integer, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GeometryColumns.GEOMETRY_COLUMNS.F_TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GeometryColumns.GEOMETRY_COLUMNS.F_TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GeometryColumns.GEOMETRY_COLUMNS.F_TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GeometryColumns.GEOMETRY_COLUMNS.F_GEOMETRY_COLUMN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return GeometryColumns.GEOMETRY_COLUMNS.COORD_DIMENSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return GeometryColumns.GEOMETRY_COLUMNS.SRID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GeometryColumns.GEOMETRY_COLUMNS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getFTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFGeometryColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCoordDimension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getSrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFGeometryColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCoordDimension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getSrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeometryColumnsRecord value1(String value) {
        setFTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeometryColumnsRecord value2(String value) {
        setFTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeometryColumnsRecord value3(String value) {
        setFTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeometryColumnsRecord value4(String value) {
        setFGeometryColumn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeometryColumnsRecord value5(Integer value) {
        setCoordDimension(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeometryColumnsRecord value6(Integer value) {
        setSrid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeometryColumnsRecord value7(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GeometryColumnsRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GeometryColumnsRecord
     */
    public GeometryColumnsRecord() {
        super(GeometryColumns.GEOMETRY_COLUMNS);
    }

    /**
     * Create a detached, initialised GeometryColumnsRecord
     */
    public GeometryColumnsRecord(String fTableCatalog, String fTableSchema, String fTableName, String fGeometryColumn, Integer coordDimension, Integer srid, String type) {
        super(GeometryColumns.GEOMETRY_COLUMNS);

        set(0, fTableCatalog);
        set(1, fTableSchema);
        set(2, fTableName);
        set(3, fGeometryColumn);
        set(4, coordDimension);
        set(5, srid);
        set(6, type);
    }
}
