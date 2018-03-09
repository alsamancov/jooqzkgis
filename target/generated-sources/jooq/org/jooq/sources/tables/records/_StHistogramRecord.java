/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
import org.jooq.sources.tables._StHistogram;


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
public class _StHistogramRecord extends TableRecordImpl<_StHistogramRecord> implements Record8<Double, Double, Double, Double, Long, Long, Double, Double> {

    private static final long serialVersionUID = 899977505;

    /**
     * Setter for <code>public._st_histogram.min</code>.
     */
    public void setMin(Double value) {
        set(0, value);
    }

    /**
     * Getter for <code>public._st_histogram.min</code>.
     */
    public Double getMin() {
        return (Double) get(0);
    }

    /**
     * Setter for <code>public._st_histogram.min</code>.
     */
    public void setMin(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>public._st_histogram.min</code>.
     */
    public Double getMin() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>public._st_histogram.max</code>.
     */
    public void setMax(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public._st_histogram.max</code>.
     */
    public Double getMax() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public._st_histogram.max</code>.
     */
    public void setMax(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public._st_histogram.max</code>.
     */
    public Double getMax() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public._st_histogram.count</code>.
     */
    public void setCount(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public._st_histogram.count</code>.
     */
    public Long getCount() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public._st_histogram.count</code>.
     */
    public void setCount(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public._st_histogram.count</code>.
     */
    public Long getCount() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public._st_histogram.percent</code>.
     */
    public void setPercent(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public._st_histogram.percent</code>.
     */
    public Double getPercent() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public._st_histogram.percent</code>.
     */
    public void setPercent(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>public._st_histogram.percent</code>.
     */
    public Double getPercent() {
        return (Double) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Double, Double, Double, Double, Long, Long, Double, Double> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Double, Double, Double, Double, Long, Long, Double, Double> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field1() {
        return _StHistogram._ST_HISTOGRAM.MIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field2() {
        return _StHistogram._ST_HISTOGRAM.MIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return _StHistogram._ST_HISTOGRAM.MAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return _StHistogram._ST_HISTOGRAM.MAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return _StHistogram._ST_HISTOGRAM.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return _StHistogram._ST_HISTOGRAM.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return _StHistogram._ST_HISTOGRAM.PERCENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return _StHistogram._ST_HISTOGRAM.PERCENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component1() {
        return getMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component2() {
        return getMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getPercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getPercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value1() {
        return getMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value2() {
        return getMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getPercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getPercent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogramRecord value1(Double value) {
        setMin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogramRecord value2(Double value) {
        setMin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogramRecord value3(Double value) {
        setMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogramRecord value4(Double value) {
        setMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogramRecord value5(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogramRecord value6(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogramRecord value7(Double value) {
        setPercent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogramRecord value8(Double value) {
        setPercent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public _StHistogramRecord values(Double value1, Double value2, Double value3, Double value4, Long value5, Long value6, Double value7, Double value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _StHistogramRecord
     */
    public _StHistogramRecord() {
        super(_StHistogram._ST_HISTOGRAM);
    }

    /**
     * Create a detached, initialised _StHistogramRecord
     */
    public _StHistogramRecord(Double min, Double min, Double max, Double max, Long count, Long count, Double percent, Double percent) {
        super(_StHistogram._ST_HISTOGRAM);

        set(0, min);
        set(1, min);
        set(2, max);
        set(3, max);
        set(4, count);
        set(5, count);
        set(6, percent);
        set(7, percent);
    }
}
