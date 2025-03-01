/*
 * This file is generated by jOOQ.
 */
package com.example.generated.tables.records;


import com.example.generated.tables.Trainee;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TraineeRecord extends UpdatableRecordImpl<TraineeRecord> implements Record6<String, Long, String, String, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.trainee.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.trainee.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.trainee.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.trainee.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.trainee.phone</code>.
     */
    public void setPhone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.trainee.phone</code>.
     */
    public String getPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.trainee.payment_method</code>.
     */
    public void setPaymentMethod(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.trainee.payment_method</code>.
     */
    public String getPaymentMethod() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.trainee.note</code>.
     */
    public void setNote(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.trainee.note</code>.
     */
    public String getNote() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.trainee.membership</code>.
     */
    public void setMembership(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.trainee.membership</code>.
     */
    public Long getMembership() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, Long, String, String, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, Long, String, String, String, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Trainee.TRAINEE.NAME;
    }

    @Override
    public Field<Long> field2() {
        return Trainee.TRAINEE.ID;
    }

    @Override
    public Field<String> field3() {
        return Trainee.TRAINEE.PHONE;
    }

    @Override
    public Field<String> field4() {
        return Trainee.TRAINEE.PAYMENT_METHOD;
    }

    @Override
    public Field<String> field5() {
        return Trainee.TRAINEE.NOTE;
    }

    @Override
    public Field<Long> field6() {
        return Trainee.TRAINEE.MEMBERSHIP;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public Long component2() {
        return getId();
    }

    @Override
    public String component3() {
        return getPhone();
    }

    @Override
    public String component4() {
        return getPaymentMethod();
    }

    @Override
    public String component5() {
        return getNote();
    }

    @Override
    public Long component6() {
        return getMembership();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public Long value2() {
        return getId();
    }

    @Override
    public String value3() {
        return getPhone();
    }

    @Override
    public String value4() {
        return getPaymentMethod();
    }

    @Override
    public String value5() {
        return getNote();
    }

    @Override
    public Long value6() {
        return getMembership();
    }

    @Override
    public TraineeRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public TraineeRecord value2(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TraineeRecord value3(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public TraineeRecord value4(String value) {
        setPaymentMethod(value);
        return this;
    }

    @Override
    public TraineeRecord value5(String value) {
        setNote(value);
        return this;
    }

    @Override
    public TraineeRecord value6(Long value) {
        setMembership(value);
        return this;
    }

    @Override
    public TraineeRecord values(String value1, Long value2, String value3, String value4, String value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TraineeRecord
     */
    public TraineeRecord() {
        super(Trainee.TRAINEE);
    }

    /**
     * Create a detached, initialised TraineeRecord
     */
    public TraineeRecord(String name, Long id, String phone, String paymentMethod, String note, Long membership) {
        super(Trainee.TRAINEE);

        setName(name);
        setId(id);
        setPhone(phone);
        setPaymentMethod(paymentMethod);
        setNote(note);
        setMembership(membership);
    }

    /**
     * Create a detached, initialised TraineeRecord
     */
    public TraineeRecord(com.example.generated.tables.pojos.Trainee value) {
        super(Trainee.TRAINEE);

        if (value != null) {
            setName(value.getName());
            setId(value.getId());
            setPhone(value.getPhone());
            setPaymentMethod(value.getPaymentMethod());
            setNote(value.getNote());
            setMembership(value.getMembership());
        }
    }
}
