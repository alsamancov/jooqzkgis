/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.sources.udt.Addbandarg;


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
public class AddbandargRecord extends UDTRecordImpl<AddbandargRecord> implements Record4<Integer, String, Double, Double> {

    private static final long serialVersionUID = -435953147;

    /**
     * Setter for <code>public.addbandarg.index</code>.
     */
    public void setIndex(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.addbandarg.index</code>.
     */
    public Integer getIndex() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.addbandarg.pixeltype</code>.
     */
    public void setPixeltype(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.addbandarg.pixeltype</code>.
     */
    public String getPixeltype() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.addbandarg.initialvalue</code>.
     */
    public void setInitialvalue(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.addbandarg.initialvalue</code>.
     */
    public Double getInitialvalue() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.addbandarg.nodataval</code>.
     */
    public void setNodataval(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.addbandarg.nodataval</code>.
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
    public Row4<Integer, String, Double, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Double, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Addbandarg.INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Addbandarg.PIXELTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return Addbandarg.INITIALVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Addbandarg.NODATAVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPixeltype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getInitialvalue();
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
        return getIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPixeltype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getInitialvalue();
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
    public AddbandargRecord value1(Integer value) {
        setIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddbandargRecord value2(String value) {
        setPixeltype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddbandargRecord value3(Double value) {
        setInitialvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddbandargRecord value4(Double value) {
        setNodataval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddbandargRecord values(Integer value1, String value2, Double value3, Double value4) {
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
     * Create a detached AddbandargRecord
     */
    public AddbandargRecord() {
        super(Addbandarg.ADDBANDARG);
    }

    /**
     * Create a detached, initialised AddbandargRecord
     */
    public AddbandargRecord(Integer index, String pixeltype, Double initialvalue, Double nodataval) {
        super(Addbandarg.ADDBANDARG);

        set(0, index);
        set(1, pixeltype);
        set(2, initialvalue);
        set(3, nodataval);
    }
}
