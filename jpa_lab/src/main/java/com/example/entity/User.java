package com.example.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_user") // 指定数据库表名
public class User {
    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增
    private Long id;

    @Column(name = "username", nullable = false, length = 50) // 列名，不能为空，长度50
    private String username;

    // 一对多关系：一个用户对应多个订单
    // mappedBy = "user" 表示由 Order 类中的 user 属性来维护外键
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Order> orders = new HashSet<>();

    // 必须有无参构造方法
    public User() {}

    // Getter 和 Setter (Alt+Insert 快捷键可以自动生成，这里为了你方便直接贴出来)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public Set<Order> getOrders() { return orders; }
    public void setOrders(Set<Order> orders) { this.orders = orders; }
}