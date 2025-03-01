/*
 * This file is generated by jOOQ.
 */
package com.example.generated.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Trainee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Long   id;
    private String phone;
    private String paymentMethod;
    private String note;
    private Long   membership;

    public Trainee() {}

    public Trainee(Trainee value) {
        this.name = value.name;
        this.id = value.id;
        this.phone = value.phone;
        this.paymentMethod = value.paymentMethod;
        this.note = value.note;
        this.membership = value.membership;
    }

    public Trainee(
        String name,
        Long   id,
        String phone,
        String paymentMethod,
        String note,
        Long   membership
    ) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.paymentMethod = paymentMethod;
        this.note = note;
        this.membership = membership;
    }

    /**
     * Getter for <code>public.trainee.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.trainee.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>public.trainee.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.trainee.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.trainee.phone</code>.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>public.trainee.phone</code>.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for <code>public.trainee.payment_method</code>.
     */
    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     * Setter for <code>public.trainee.payment_method</code>.
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for <code>public.trainee.note</code>.
     */
    public String getNote() {
        return this.note;
    }

    /**
     * Setter for <code>public.trainee.note</code>.
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Getter for <code>public.trainee.membership</code>.
     */
    public Long getMembership() {
        return this.membership;
    }

    /**
     * Setter for <code>public.trainee.membership</code>.
     */
    public void setMembership(Long membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Trainee (");

        sb.append(name);
        sb.append(", ").append(id);
        sb.append(", ").append(phone);
        sb.append(", ").append(paymentMethod);
        sb.append(", ").append(note);
        sb.append(", ").append(membership);

        sb.append(")");
        return sb.toString();
    }
}
