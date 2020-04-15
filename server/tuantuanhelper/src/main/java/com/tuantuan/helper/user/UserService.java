package com.tuantuan.helper.user;

import com.tuantuan.helper.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> getUserList();
    String addUser(User user);
    String deleteUser(User user);
    String updateUser(User user);
}
