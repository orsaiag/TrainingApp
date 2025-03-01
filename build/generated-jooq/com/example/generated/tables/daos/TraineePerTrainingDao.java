/*
 * This file is generated by jOOQ.
 */
package com.example.generated.tables.daos;


import com.example.generated.tables.TraineePerTraining;
import com.example.generated.tables.records.TraineePerTrainingRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TraineePerTrainingDao extends DAOImpl<TraineePerTrainingRecord, com.example.generated.tables.pojos.TraineePerTraining, Long> {

    /**
     * Create a new TraineePerTrainingDao without any configuration
     */
    public TraineePerTrainingDao() {
        super(TraineePerTraining.TRAINEE_PER_TRAINING, com.example.generated.tables.pojos.TraineePerTraining.class);
    }

    /**
     * Create a new TraineePerTrainingDao with an attached configuration
     */
    public TraineePerTrainingDao(Configuration configuration) {
        super(TraineePerTraining.TRAINEE_PER_TRAINING, com.example.generated.tables.pojos.TraineePerTraining.class, configuration);
    }

    @Override
    public Long getId(com.example.generated.tables.pojos.TraineePerTraining object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.example.generated.tables.pojos.TraineePerTraining> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TraineePerTraining.TRAINEE_PER_TRAINING.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.example.generated.tables.pojos.TraineePerTraining> fetchById(Long... values) {
        return fetch(TraineePerTraining.TRAINEE_PER_TRAINING.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.example.generated.tables.pojos.TraineePerTraining fetchOneById(Long value) {
        return fetchOne(TraineePerTraining.TRAINEE_PER_TRAINING.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.example.generated.tables.pojos.TraineePerTraining> fetchOptionalById(Long value) {
        return fetchOptional(TraineePerTraining.TRAINEE_PER_TRAINING.ID, value);
    }

    /**
     * Fetch records that have <code>trainee_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.example.generated.tables.pojos.TraineePerTraining> fetchRangeOfTraineeId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TraineePerTraining.TRAINEE_PER_TRAINING.TRAINEE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>trainee_id IN (values)</code>
     */
    public List<com.example.generated.tables.pojos.TraineePerTraining> fetchByTraineeId(Long... values) {
        return fetch(TraineePerTraining.TRAINEE_PER_TRAINING.TRAINEE_ID, values);
    }

    /**
     * Fetch records that have <code>training_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.example.generated.tables.pojos.TraineePerTraining> fetchRangeOfTrainingId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TraineePerTraining.TRAINEE_PER_TRAINING.TRAINING_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>training_id IN (values)</code>
     */
    public List<com.example.generated.tables.pojos.TraineePerTraining> fetchByTrainingId(Long... values) {
        return fetch(TraineePerTraining.TRAINEE_PER_TRAINING.TRAINING_ID, values);
    }

    /**
     * Fetch records that have <code>date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.example.generated.tables.pojos.TraineePerTraining> fetchRangeOfDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(TraineePerTraining.TRAINEE_PER_TRAINING.DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>date IN (values)</code>
     */
    public List<com.example.generated.tables.pojos.TraineePerTraining> fetchByDate(LocalDateTime... values) {
        return fetch(TraineePerTraining.TRAINEE_PER_TRAINING.DATE, values);
    }
}
