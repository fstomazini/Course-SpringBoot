package com.felipetomazini.course.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
@Entity
@Table(name = "tb_payment")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    @OneToOne
    @MapsId
    private Order order;

    public Payment(Long id, Instant moment, Order order) {
        this.id = id;
        this.moment = moment;
        this.order = order;
    }

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Objects.equals(getId(), payment.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
