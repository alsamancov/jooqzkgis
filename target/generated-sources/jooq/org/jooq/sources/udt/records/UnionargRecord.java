/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.sources.udt.Unionarg;


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
public class UnionargRecord extends UDTRecordImpl<UnionargRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1150132107;

    /**
     * Setter for <code>public.unionarg.nband</code>.
     */
    public void setNband(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.unionarg.nband</code>.
     */
    public Integer getNband() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.unionarg.uniontype</code>.
     */
    public void setUniontype(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.unionarg.uniontype</code>.
     */
    public String getUniontype() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Unionarg.NBAND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Unionarg.UNIONTYPE;
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
        return getUniontype();
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
        return getUniontype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnionargRecord value1(Integer value) {
        setNband(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnionargRecord value2(String value) {
        setUniontype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnionargRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UnionargRecord
     */
    public UnionargRecord() {
        super(Unionarg.UNIONARG);
    }

    /**
     * Create a detached, initialised UnionargRecord
     */
    public UnionargRecord(Integer nband, String uniontype) {
        super(Unionarg.UNIONARG);

        set(0, nband);
        set(1, uniontype);
    }
}
