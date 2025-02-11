/*
 * This file is generated by jOOQ.
 */
package com.example.generated.tables.records;


import com.example.generated.tables.Trainer;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrainerRecord extends TableRecordImpl<TrainerRecord> implements Record4<Long, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.trainer.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.trainer.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.trainer.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.trainer.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.trainer.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.trainer.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.trainer.phone</code>.
     */
    public void setPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.trainer.phone</code>.
     */
    public String getPhone() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Trainer.TRAINER.ID;
    }

    @Override
    public Field<String> field2() {
        return Trainer.TRAINER.NAME;
    }

    @Override
    public Field<String> field3() {
        return Trainer.TRAINER.ADDRESS;
    }

    @Override
    public Field<String> field4() {
        return Trainer.TRAINER.PHONE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getAddress();
    }

    @Override
    public String component4() {
        return getPhone();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getAddress();
    }

    @Override
    public String value4() {
        return getPhone();
    }

    @Override
    public TrainerRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TrainerRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TrainerRecord value3(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public TrainerRecord value4(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public TrainerRecord values(Long value1, String value2, String value3, String value4) {
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
     * Create a detached TrainerRecord
     */
    public TrainerRecord() {
        super(Trainer.TRAINER);
    }

    /**
     * Create a detached, initialised TrainerRecord
     */
    public TrainerRecord(Long id, String name, String address, String phone) {
        super(Trainer.TRAINER);

        setId(id);
        setName(name);
        setAddress(address);
        setPhone(phone);
    }

    /**
     * Create a detached, initialised TrainerRecord
     */
    public TrainerRecord(com.example.generated.tables.pojos.Trainer value) {
        super(Trainer.TRAINER);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setAddress(value.getAddress());
            setPhone(value.getPhone());
        }
    }
}
