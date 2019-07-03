package com.myebook.my_ebook.Entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@SequenceGenerator(name="book_id_seq", initialValue=7, allocationSize=1)
public class Books {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="book_id_seq")
    private int bid;
    private int book_id;
    private String title;
    private String author;
    private String language;
    private double price;
    private long stock;//库存
    @Column(name = "cover")
    private byte[] cover;
    public Books(){

    }
    public Books(int book_id, String title, String author, String language, double price, long stock,byte[] cover) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.language = language;
        this.price = price;
        this.stock = stock;
        this.cover = cover;
    }
    public int getBook_id(){
        return book_id;
    }
    public void setBook_id(int book_id){
        this.book_id=book_id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getLanguage(){
        return language;
    }
    public void setLanguage(String language){
        this.language=language;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }
    public byte[] getCover() {
        return cover;
    }
    public void setCover(byte[] cover) {
        this.cover = cover;
    }
}
