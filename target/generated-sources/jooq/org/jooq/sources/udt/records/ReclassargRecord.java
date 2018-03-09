/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.sources.udt.Reclassarg;


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
public class ReclassargRecord extends UDTRecordImpl<ReclassargRecord> implements Record4<Integer, String, String, Double> {

    private static final long serialVersionUID = -930543929;

    /**
     * Setter for <code>public.reclassarg.nband</code>.
     */
    public void setNband(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.reclassarg.nband</code>.
     */
    public Integer getNband() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.reclassarg.reclassexpr</code>.
     */
    public void setReclassexpr(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.reclassarg.reclassexpr</code>.
     */
    public String getReclassexpr() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.reclassarg.pixeltype</code>.
     */
    public void setPixeltype(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.reclassarg.pixeltype</code>.
     */
    public String getPixeltype() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.reclassarg.nodataval</code>.
     */
    public void setNodataval(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.reclassarg.nodataval</code>.
     */
    public Double getNodataval() {
        return (Double) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Reclassarg.NBAND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Reclassarg.RECLASSEXPR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Reclassarg.PIXELTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Reclassarg.NODATAVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getNband();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getReclassexpr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPixeltype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getNodataval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNband();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getReclassexpr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPixeltype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getNodataval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReclassargRecord value1(Integer value) {
        setNband(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReclassargRecord value2(String value) {
        setReclassexpr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReclassargRecord value3(String value) {
        setPixeltype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReclassargRecord value4(Double value) {
        setNodataval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReclassargRecord values(Integer value1, String value2, String value3, Double value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReclassargRecord
     */
    public ReclassargRecord() {
        super(Reclassarg.RECLASSARG);
    }

    /**
     * Create a detached, initialised ReclassargRecord
     */
    public ReclassargRecord(Integer nband, String reclassexpr, String pixeltype, Double nodataval) {
        super(Reclassarg.RECLASSARG);

        set(0, nband);
        set(1, reclassexpr);
        set(2, pixeltype);
        set(3, nodataval);
    }
}
