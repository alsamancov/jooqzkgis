/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
import org.jooq.sources.tables.StValuecount;


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
public class StValuecountRecord extends TableRecordImpl<StValuecountRecord> implements Record12<Double, Double, Double, Double, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -1780459302;

    /**
     * Setter for <code>public.st_valuecount.value</code>.
     */
    public void setValue(Double value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.st_valuecount.value</code>.
     */
    public Double getValue() {
        return (Double) get(0);
    }

    /**
     * Setter for <code>public.st_valuecount.value</code>.
     */
    public void setValue(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.st_valuecount.value</code>.
     */
    public Double getValue() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>public.st_valuecount.value</code>.
     */
    public void setValue(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.st_valuecount.value</code>.
     */
    public Double getValue() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.st_valuecount.value</code>.
     */
    public void setValue(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.st_valuecount.value</code>.
     */
    public Double getValue() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.st_valuecount.value</code>.
     */
    public void setValue(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.st_valuecount.value</code>.
     */
    public Double getValue() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.st_valuecount.value</code>.
     */
    public void setValue(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.st_valuecount.value</code>.
     */
    public Double getValue() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.st_valuecount.count</code>.
     */
    public void setCount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.st_valuecount.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.st_valuecount.count</code>.
     */
    public void setCount(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.st_valuecount.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.st_valuecount.count</code>.
     */
    public void setCount(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.st_valuecount.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.st_valuecount.count</code>.
     */
    public void setCount(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.st_valuecount.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.st_valuecount.count</code>.
     */
    public void setCount(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.st_valuecount.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.st_valuecount.count</code>.
     */
    public void setCount(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.st_valuecount.count</code>.
     */
    public Integer getCount() {
        return (Integer) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Double, Double, Double, Double, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Double, Double, Double, Double, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field1() {
        return StValuecount.ST_VALUECOUNT.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field2() {
        return StValuecount.ST_VALUECOUNT.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return StValuecount.ST_VALUECOUNT.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return StValuecount.ST_VALUECOUNT.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return StValuecount.ST_VALUECOUNT.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return StValuecount.ST_VALUECOUNT.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return StValuecount.ST_VALUECOUNT.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return StValuecount.ST_VALUECOUNT.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return StValuecount.ST_VALUECOUNT.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return StValuecount.ST_VALUECOUNT.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return StValuecount.ST_VALUECOUNT.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return StValuecount.ST_VALUECOUNT.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component1() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component2() {
        return getValue();
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
    public Double component5() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value1() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value2() {
        return getValue();
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
    public Double value5() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value1(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value2(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value3(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value4(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value5(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value6(Double value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value7(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value8(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value9(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value10(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value11(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord value12(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StValuecountRecord values(Double value1, Double value2, Double value3, Double value4, Double value5, Double value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12) {
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
     * Create a detached StValuecountRecord
     */
    public StValuecountRecord() {
        super(StValuecount.ST_VALUECOUNT);
    }

    /**
     * Create a detached, initialised StValuecountRecord
     */
    public StValuecountRecord(Double value, Double value, Double value, Double value, Double value, Double value, Integer count, Integer count, Integer count, Integer count, Integer count, Integer count) {
        super(StValuecount.ST_VALUECOUNT);

        set(0, value);
        set(1, value);
        set(2, value);
        set(3, value);
        set(4, value);
        set(5, value);
        set(6, count);
        set(7, count);
        set(8, count);
        set(9, count);
        set(10, count);
        set(11, count);
    }
}
