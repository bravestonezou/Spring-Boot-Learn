package com.stone.druid.controller;

import com.stone.druid.entity.User;
import com.stone.druid.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/6 22:42
 * @Email zou.shiyong@frontsurf.com
 */
@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/getUser")
    @ResponseBody
    public String index(){
        User user = userMapper.selectByPrimaryKey(1);
        return user.toString();
    }
}
