package com.myebook.my_ebook.DaoImp;

import com.myebook.my_ebook.Dao.UserDao;
import com.myebook.my_ebook.Entity.Users;
import com.myebook.my_ebook.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class UserDaoImp implements UserDao {

    @Autowired // This means to get the bean called userRepository
    private UserRepository userRepository;

    @Override
    public int addNewUser(String password, String name, String phone, String email, String status) {
        List<Users> usersList=userRepository.findAll();
        for (int i=0;i<usersList.size();i++){
            if (usersList.get(i).getName().equals(name)){
                return -1;
            }
        }
        Users n = new Users();
        n.setPassword(password);
        n.setName(name);
        n.setPhone(phone);
        n.setEmail(email);
        n.setStatus(status);
        if(status.equals("user")){n.setUsable(1);}
        else {
            n.setUsable(0);
        }

        userRepository.save(n);
        return n.getId();
    }

    @Override
    public Users findUserById(int id){
        return userRepository.getUsersById(id);
    }

    @Override
    public int ableUser(int id) {
        Users u =userRepository.getUsersById(id);
        u.setUsable(1);
        userRepository.save(u);
        return 1;
    }

    @Override
    public int unableUser(int id) {
        Users u =userRepository.getUsersById(id);
        u.setUsable(0);
        userRepository.save(u);
        return 1;
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
