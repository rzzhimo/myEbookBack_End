package com.myebook.my_ebook.Entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@SequenceGenerator(name="user_id_seq", initialValue=6, allocationSize=1)
public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_id_seq")

    private Integer id;
    private String password;
    private String name;

    private  String phone;
    private String email;
    private  String status;
    private Integer usable;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   public String getPassword(){
        return password;
   }
   public  void setPassword(String password){
        this.password=password;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {


        this.name = name;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}

    public Integer getUsable() {
        return usable;
    }

    public void setUsable(Integer usable) {
        this.usable = usable;
    }
}