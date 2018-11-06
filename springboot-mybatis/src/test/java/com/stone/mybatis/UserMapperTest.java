package com.stone.mybatis;

import com.stone.mybatis.entity.User;
import com.stone.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/6 9:34
 * @Email zou.shiyong@frontsurf.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setName("王五");
        user.setCreateTime(new Date());
        userMapper.insert(user);
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        User user = userMapper.selectByPrimaryKey(2);
        System.out.println(user);
    }

}