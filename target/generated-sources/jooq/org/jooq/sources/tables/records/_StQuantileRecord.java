/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.sources.tables._StQuantile;


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
public class _StQuantileRecord extends TableRecordImpl<_StQuantileRecord> implements Record4<Double, Double, Double, Double> {

    private static final long serialVersionUID = -1844109969;

    /**
     * Setter for <code>public._st_quantile.quantile</code>.
     */
    public void setQuantile(Double value) {
        set(0, value);
    }

    /**
     * Getter for <code>public._st_quantile.quantile</code>.
     */
    public Double getQuantile() {
        return (Double) get(0);
    }

    /**
     * Setter for <code>public._st_quantile.quantile</code>.
     */
    public void setQuantile(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>public._st_quantile.quantile</code>.
     */
    public Double getQuantile() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>public._st_quantile.value</code>.
     */
    public void setValue(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public._st_quantile.value</code>.
     */
    public Double getValue() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public._st_quantile.value</code>.
     */
    public void setValue(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public._st_quantile.value</code>.
     */
    public Double getValue() {
        return (Double) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Double, Double, Double, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Double, Double, Double, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field1() {
        return _StQuantile._ST_QUANTILE.QUANTILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field2() {
        return _StQuantile._ST_QUANTILE.QUANTILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return _StQuantile._ST_QUANTILE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return _StQuantile._ST_QUANTILE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component1() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component2() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value1() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value2() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StQuantileRecord value1(Double value) {
        setQuantile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StQuantileRecord value2(Double value) {
        setQuantile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StQuantileRecord value3(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StQuantileRecord value4(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StQuantileRecord values(Double value1, Double value2, Double value3, Double value4) {
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
     * Create a detached _StQuantileRecord
     */
    public _StQuantileRecord() {
        super(_StQuantile._ST_QUANTILE);
    }

    /**
     * Create a detached, initialised _StQuantileRecord
     */
    public _StQuantileRecord(Double quantile, Double quantile, Double value, Double value) {
        super(_StQuantile._ST_QUANTILE);

        set(0, quantile);
        set(1, quantile);
        set(2, value);
        set(3, value);
    }
}