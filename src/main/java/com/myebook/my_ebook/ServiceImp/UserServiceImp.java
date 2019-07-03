package com.myebook.my_ebook.ServiceImp;


import com.myebook.my_ebook.Dao.UserDao;
import com.myebook.my_ebook.Entity.Users;
import com.myebook.my_ebook.Repository.UserRepository;

import com.myebook.my_ebook.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired // This means to get the bean called userRepository
    private UserDao userDao;

    @Override
    public int addNewUser(String password, String name, String phone, String email, String status) {

        return userDao.addNewUser(password,name,phone,email,status);
    }

    @Override
    public Users findUserById(int id){
        return userDao.findUserById(id);
    }

    @Override
    public int ableUser(int id) {

        return userDao.ableUser(id);
    }

    @Override
    public int unableUser(int id) {
      return userDao.unableUser(id);
    }

    @Override
    public Iterable<Users> getAllUsers() {
        return userDao.getAllUsers();
    }
}
