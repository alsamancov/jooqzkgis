/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.records;


import com.vividsolutions.jts.geom.Geometry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;
import org.jooq.sources.tables.StSubdivide;


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
public class StSubdivideRecord extends TableRecordImpl<StSubdivideRecord> implements Record1<Geometry> {

    private static final long serialVersionUID = -135106753;

    /**
     * Setter for <code>public.st_subdivide.st_subdivide</code>.
     */
    public void setStSubdivide(Geometry value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.st_subdivide.st_subdivide</code>.
     */
    public Geometry getStSubdivide() {
        return (Geometry) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Geometry> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Geometry> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Geometry> field1() {
        return StSubdivide.ST_SUBDIVIDE.ST_SUBDIVIDE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geometry component1() {
        return getStSubdivide();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geometry value1() {
        return getStSubdivide();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StSubdivideRecord value1(Geometry value) {
        setStSubdivide(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StSubdivideRecord values(Geometry value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StSubdivideRecord
     */
    public StSubdivideRecord() {
        super(StSubdivide.ST_SUBDIVIDE);
    }

    /**
     * Create a detached, initialised StSubdivideRecord
     */
    public StSubdivideRecord(Geometry stSubdivide) {
        super(StSubdivide.ST_SUBDIVIDE);

        set(0, stSubdivide);
    }
}
