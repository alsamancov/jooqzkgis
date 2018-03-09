/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
import org.jooq.sources.tables.StQuantile;


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
public class StQuantileRecord extends TableRecordImpl<StQuantileRecord> implements Record12<Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double> {

    private static final long serialVersionUID = 304763728;

    /**
     * Setter for <code>public.st_quantile.quantile</code>.
     */
    public void setQuantile(Double value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.st_quantile.quantile</code>.
     */
    public Double getQuantile() {
        return (Double) get(0);
    }

    /**
     * Setter for <code>public.st_quantile.quantile</code>.
     */
    public void setQuantile(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.st_quantile.quantile</code>.
     */
    public Double getQuantile() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>public.st_quantile.quantile</code>.
     */
    public void setQuantile(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.st_quantile.quantile</code>.
     */
    public Double getQuantile() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.st_quantile.quantile</code>.
     */
    public void setQuantile(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.st_quantile.quantile</code>.
     */
    public Double getQuantile() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.st_quantile.quantile</code>.
     */
    public void setQuantile(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.st_quantile.quantile</code>.
     */
    public Double getQuantile() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.st_quantile.quantile</code>.
     */
    public void setQuantile(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.st_quantile.quantile</code>.
     */
    public Double getQuantile() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.st_quantile.value</code>.
     */
    public void setValue(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.st_quantile.value</code>.
     */
    public Double getValue() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.st_quantile.value</code>.
     */
    public void setValue(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.st_quantile.value</code>.
     */
    public Double getValue() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>public.st_quantile.value</code>.
     */
    public void setValue(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.st_quantile.value</code>.
     */
    public Double getValue() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>public.st_quantile.value</code>.
     */
    public void setValue(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.st_quantile.value</code>.
     */
    public Double getValue() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>public.st_quantile.value</code>.
     */
    public void setValue(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.st_quantile.value</code>.
     */
    public Double getValue() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>public.st_quantile.value</code>.
     */
    public void setValue(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.st_quantile.value</code>.
     */
    public Double getValue() {
        return (Double) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field1() {
        return StQuantile.ST_QUANTILE.QUANTILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field2() {
        return StQuantile.ST_QUANTILE.QUANTILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return StQuantile.ST_QUANTILE.QUANTILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return StQuantile.ST_QUANTILE.QUANTILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return StQuantile.ST_QUANTILE.QUANTILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return StQuantile.ST_QUANTILE.QUANTILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return StQuantile.ST_QUANTILE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return StQuantile.ST_QUANTILE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return StQuantile.ST_QUANTILE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field10() {
        return StQuantile.ST_QUANTILE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field11() {
        return StQuantile.ST_QUANTILE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return StQuantile.ST_QUANTILE.VALUE;
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
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component9() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component10() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component11() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component12() {
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
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getQuantile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value10() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value11() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value1(Double value) {
        setQuantile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value2(Double value) {
        setQuantile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value3(Double value) {
        setQuantile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value4(Double value) {
        setQuantile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value5(Double value) {
        setQuantile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value6(Double value) {
        setQuantile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value7(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value8(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value9(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value10(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value11(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord value12(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StQuantileRecord values(Double value1, Double value2, Double value3, Double value4, Double value5, Double value6, Double value7, Double value8, Double value9, Double value10, Double value11, Double value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StQuantileRecord
     */
    public StQuantileRecord() {
        super(StQuantile.ST_QUANTILE);
    }

    /**
     * Create a detached, initialised StQuantileRecord
     */
    public StQuantileRecord(Double quantile, Double quantile, Double quantile, Double quantile, Double quantile, Double quantile, Double value, Double value, Double value, Double value, Double value, Double value) {
        super(StQuantile.ST_QUANTILE);

        set(0, quantile);
        set(1, quantile);
        set(2, quantile);
        set(3, quantile);
        set(4, quantile);
        set(5, quantile);
        set(6, value);
        set(7, value);
        set(8, value);
        set(9, value);
        set(10, value);
        set(11, value);
    }
}
