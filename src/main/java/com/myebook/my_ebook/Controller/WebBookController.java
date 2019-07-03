package com.myebook.my_ebook.Controller;

import com.myebook.my_ebook.Entity.*;
import com.myebook.my_ebook.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Date;

@RequestMapping(path="/ebook")
@RestController
public class WebBookController {

@Autowired // This means to get the bean called userRepository
private UserRepository userRepository;

    @RequestMapping(path = "/check")//登录检查
    public @ResponseBody Users check(@RequestParam int id,@RequestParam String password,@RequestParam String status) throws SQLException {
        int id1 = id;
        String password1=password;
        Users u1 = userRepository.getUsersByIdAndPassword(id1,password1);
        if(u1.getName().equals("")){
            return u1;
        }
        return u1;
    }


}
