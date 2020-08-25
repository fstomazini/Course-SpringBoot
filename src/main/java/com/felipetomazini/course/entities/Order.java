package com.felipetomazini.course.entities;



import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.felipetomazini.course.entities.enums.OrderStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant instant;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name= "client_id")
    private User client;

    private Integer orderStatus;
    @OneToMany(mappedBy = "id.order")

    private Set<OrderItem> items = new HashSet<>();

    public Order() {
    }

    public Order(Long id, Instant instant,OrderStatus orderStatus, User client) {
        this.id = id;
        this.instant = instant;
        this.client = client;
        setOrderStatus(orderStatus);
    }



    public Long getId() {
        return id;
    }

    public Instant getInstant() {
        return instant;
    }

    public User getClient() {
        return client;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus.getCode();
    }

    public void setClient(User client) {
        this.client = client;
    }

    public  Set<OrderItem> getItems(){
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getId() == order.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
