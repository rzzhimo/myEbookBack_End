package com.myebook.my_ebook.Entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Table(name="orders")
@Entity
public class Orders {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private Integer id;

    @Column(name = "order_time")
    private Timestamp orderTime;
    private int user_id;

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    //private Users user;

    /**
     * 映射单项 n-1 的关联关系（Customer 和 Order，Order 中有 Customer 属性，而 Customer 中没有 Order 属性）
     * 使用 @ManyToOne 来映射多对一的关联关系
     * 使用 @JoinColumn 来映射外键
     * 可以使用 @ManyToOne 的 fetch 属性来修改默认的关联属性的加载策略
     */
//    @JoinColumn(name="User_id")
//    @ManyToOne(fetch=FetchType.LAZY)
//    public Users getUser() {
//        return user;
//    }
//
//    public void setUser(Users user) {
//        this.user = user;
//    }

}
