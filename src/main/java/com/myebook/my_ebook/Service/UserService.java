package com.myebook.my_ebook.Service;

import com.myebook.my_ebook.Entity.Users;
import org.springframework.web.bind.annotation.RequestParam;


public interface UserService {

    int addNewUser(String password,String name
            , String phone, String email,String status);
    Users findUserById(int id);
    int ableUser(int id);
    int unableUser(int id);
    Iterable<Users> getAllUsers();
}
