package com.atguigu.pojo;

import java.math.BigDecimal;

/**
 * @description:
 * @author: solveBug
 * @time: 2021/6/9 11:40
 */
public class book {
    private int id;
    private String name;
    private String author;
    private BigDecimal price;
    private int sales;
    private int stock;
    private String photo;

    public book() {
    }

    public book(int id, String name, String author, BigDecimal price, int sales, int stock, String photo) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", stock=" + stock +
                ", photo='" + photo + '\'' +
                '}';
    }
}
