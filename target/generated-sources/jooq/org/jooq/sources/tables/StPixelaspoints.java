/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables;


import com.vividsolutions.jts.geom.Geometry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.sources.Public;
import org.jooq.sources.tables.records.StPixelaspointsRecord;


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
public class StPixelaspoints extends TableImpl<StPixelaspointsRecord> {

    private static final long serialVersionUID = -1369471938;

    /**
     * The reference instance of <code>public.st_pixelaspoints</code>
     */
    public static final StPixelaspoints ST_PIXELASPOINTS = new StPixelaspoints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StPixelaspointsRecord> getRecordType() {
        return StPixelaspointsRecord.class;
    }

    /**
     * The column <code>public.st_pixelaspoints.geom</code>.
     */
    public final TableField<StPixelaspointsRecord, Geometry> GEOM = createField("geom", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "", new GeometryConverter());

    /**
     * The column <code>public.st_pixelaspoints.val</code>.
     */
    public final TableField<StPixelaspointsRecord, Double> VAL = createField("val", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.st_pixelaspoints.x</code>.
     */
    public final TableField<StPixelaspointsRecord, Integer> X = createField("x", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.st_pixelaspoints.y</code>.
     */
    public final TableField<StPixelaspointsRecord, Integer> Y = createField("y", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.st_pixelaspoints</code> table reference
     */
    public StPixelaspoints() {
        this(DSL.name("st_pixelaspoints"), null);
    }

    /**
     * Create an aliased <code>public.st_pixelaspoints</code> table reference
     */
    public StPixelaspoints(String alias) {
        this(DSL.name(alias), ST_PIXELASPOINTS);
    }

    /**
     * Create an aliased <code>public.st_pixelaspoints</code> table reference
     */
    public StPixelaspoints(Name alias) {
        this(alias, ST_PIXELASPOINTS);
    }

    private StPixelaspoints(Name alias, Table<StPixelaspointsRecord> aliased) {
        this(alias, aliased, new Field[3]);
    }

    private StPixelaspoints(Name alias, Table<StPixelaspointsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StPixelaspoints as(String alias) {
        return new StPixelaspoints(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StPixelaspoints as(Name alias) {
        return new StPixelaspoints(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StPixelaspoints rename(String name) {
        return new StPixelaspoints(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StPixelaspoints rename(Name name) {
        return new StPixelaspoints(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public StPixelaspoints call(Object rast, Integer band, Boolean excludeNodataValue) {
        return new StPixelaspoints(DSL.name(getName()), null, new Field[] { 
              DSL.val(rast, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"))
            , DSL.val(band, org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)))
            , DSL.val(excludeNodataValue, org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)))
        });
    }

    /**
     * Call this table-valued function
     */
    public StPixelaspoints call(Field<Object> rast, Field<Integer> band, Field<Boolean> excludeNodataValue) {
        return new StPixelaspoints(DSL.name(getName()), null, new Field[] { 
              rast
            , band
            , excludeNodataValue
        });
    }
}