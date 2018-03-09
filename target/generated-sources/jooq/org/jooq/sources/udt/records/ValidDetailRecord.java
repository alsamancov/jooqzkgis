/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.udt.records;


import com.vividsolutions.jts.geom.Geometry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.sources.udt.ValidDetail;


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
public class ValidDetailRecord extends UDTRecordImpl<ValidDetailRecord> implements Record3<Boolean, String, Geometry> {

    private static final long serialVersionUID = 1588420528;

    /**
     * Setter for <code>public.valid_detail.valid</code>.
     */
    public void setValid(Boolean value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.valid_detail.valid</code>.
     */
    public Boolean getValid() {
        return (Boolean) get(0);
    }

    /**
     * Setter for <code>public.valid_detail.reason</code>.
     */
    public void setReason(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.valid_detail.reason</code>.
     */
    public String getReason() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.valid_detail.location</code>.
     */
    public void setLocation(Geometry value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.valid_detail.location</code>.
     */
    public Geometry getLocation() {
        return (Geometry) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Boolean, String, Geometry> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Boolean, String, Geometry> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field1() {
        return ValidDetail.VALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ValidDetail.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Geometry> field3() {
        return ValidDetail.LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component1() {
        return getValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geometry component3() {
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value1() {
        return getValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geometry value3() {
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidDetailRecord value1(Boolean value) {
        setValid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidDetailRecord value2(String value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidDetailRecord value3(Geometry value) {
        setLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidDetailRecord values(Boolean value1, String value2, Geometry value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ValidDetailRecord
     */
    public ValidDetailRecord() {
        super(ValidDetail.VALID_DETAIL);
    }

    /**
     * Create a detached, initialised ValidDetailRecord
     */
    public ValidDetailRecord(Boolean valid, String reason, Geometry location) {
        super(ValidDetail.VALID_DETAIL);

        set(0, valid);
        set(1, reason);
        set(2, location);
    }
}