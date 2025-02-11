/*
 * This file is generated by jOOQ.
 */
package com.example.generated.tables;


import com.example.generated.Keys;
import com.example.generated.Public;
import com.example.generated.tables.records.TrainingRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Training extends TableImpl<TrainingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.training</code>
     */
    public static final Training TRAINING = new Training();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrainingRecord> getRecordType() {
        return TrainingRecord.class;
    }

    /**
     * The column <code>public.training.id</code>.
     */
    public final TableField<TrainingRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("nextval('\"Training_id_seq\"'::regclass)", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.training.type</code>.
     */
    public final TableField<TrainingRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.training.max_trainees</code>.
     */
    public final TableField<TrainingRecord, Long> MAX_TRAINEES = createField(DSL.name("max_trainees"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("3", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.training.date_time</code>.
     */
    public final TableField<TrainingRecord, LocalDateTime> DATE_TIME = createField(DSL.name("date_time"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.training.duration</code>.
     */
    public final TableField<TrainingRecord, Long> DURATION = createField(DSL.name("duration"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("60", SQLDataType.BIGINT)), this, "");

    private Training(Name alias, Table<TrainingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Training(Name alias, Table<TrainingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.training</code> table reference
     */
    public Training(String alias) {
        this(DSL.name(alias), TRAINING);
    }

    /**
     * Create an aliased <code>public.training</code> table reference
     */
    public Training(Name alias) {
        this(alias, TRAINING);
    }

    /**
     * Create a <code>public.training</code> table reference
     */
    public Training() {
        this(DSL.name("training"), null);
    }

    public <O extends Record> Training(Table<O> child, ForeignKey<O, TrainingRecord> key) {
        super(child, key, TRAINING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<TrainingRecord> getPrimaryKey() {
        return Keys.TRAINING_PKEY;
    }

    @Override
    public Training as(String alias) {
        return new Training(DSL.name(alias), this);
    }

    @Override
    public Training as(Name alias) {
        return new Training(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Training rename(String name) {
        return new Training(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Training rename(Name name) {
        return new Training(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, Long, LocalDateTime, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
