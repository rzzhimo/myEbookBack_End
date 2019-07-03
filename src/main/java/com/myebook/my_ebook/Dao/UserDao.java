package com.myebook.my_ebook.Dao;

import com.myebook.my_ebook.Entity.Users;

import java.util.List;

public interface UserDao {
    int addNewUser(String password,String name
            , String phone, String email,String status);
    Users findUserById(int id);
    int ableUser(int id);
    int unableUser(int id);
    List<Users> getAllUsers();
}
