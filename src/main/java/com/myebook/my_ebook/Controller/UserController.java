package com.myebook.my_ebook.Controller;

import com.myebook.my_ebook.Entity.Users;
import com.myebook.my_ebook.Repository.UserRepository;
import com.myebook.my_ebook.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path="/ebook")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path="/addUser") // Map ONLY GET Requests
    public @ResponseBody
    int addNewUser (@RequestParam String password,@RequestParam String name
            , @RequestParam String phone,@RequestParam String email,@RequestParam String status) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        return userService.addNewUser(password,name
                , phone, email,status);
    }

    @GetMapping(path = "/unableUser")
    public @ResponseBody
    int unableUser(@RequestParam int id){

        return userService.unableUser(id);
    }
    @GetMapping(path = "/ableUser")
    public @ResponseBody
    int ableUser(@RequestParam int id){

        return userService.ableUser(id);
    }
    @GetMapping(path="/allUsers")
    public @ResponseBody Iterable<Users> getAllUsers() {
        // This returns a JSON or XML with the users
        return userService.getAllUsers();
    }
}
