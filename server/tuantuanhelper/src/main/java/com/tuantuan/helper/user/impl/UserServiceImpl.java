package com.tuantuan.helper.user.impl;

import com.tuantuan.helper.model.User;
import com.tuantuan.helper.user.UserMapper;
import com.tuantuan.helper.user.UserService;
import com.tuantuan.helper.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        try {
            return userMapper.getUserList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String addUser(User user) {
        try {
            String timeStr = TimeUtils.getSimpleFormatTime();
            user.setCreateTime(timeStr);
            user.setUpdateTime(timeStr);
            return "添加成功" + userMapper.addUser(user) + "条数据";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String deleteUser(User user) {
        try {
            userMapper.deleteUser(user.getName());
            return "删除" + user.getName() + "成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String updateUser(User user) {
        try {
            user.setUpdateTime(TimeUtils.getSimpleFormatTime());
            userMapper.updateUser(user);
            return "更新" + user.getName() + "成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
