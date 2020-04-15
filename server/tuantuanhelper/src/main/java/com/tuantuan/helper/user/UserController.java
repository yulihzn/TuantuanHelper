package com.tuantuan.helper.user;

import com.tuantuan.helper.model.User;
import com.tuantuan.helper.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/user")
@RestController
public class UserController implements UserService{
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/list")
    @Override
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping("/add")
    @Override
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PostMapping("/delete")
    @Override
    public String deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }

    @PostMapping("/update")
    @Override
    public String updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
