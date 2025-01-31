package com.felipetomazini.course.entities.pk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.felipetomazini.course.entities.Order;
import com.felipetomazini.course.entities.Product;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;



    public Order getOrder() {
        return order;
    }

    public Product getProduct() {
        return product;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemPK)) return false;
        OrderItemPK that = (OrderItemPK) o;
        return Objects.equals(getOrder(), that.getOrder()) &&
                Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrder(), getProduct());
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
