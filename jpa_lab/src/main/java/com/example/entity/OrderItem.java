package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    private Double price;

    // 多对一：多个订单项属于同一个订单
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id") // 在数据库中生成 order_id 作为外键
    private Order order;

    public OrderItem() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}