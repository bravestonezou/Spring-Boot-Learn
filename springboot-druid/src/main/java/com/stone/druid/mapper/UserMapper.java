package com.stone.druid.mapper;

import com.stone.druid.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zou.shiyong
 * @Description
 * @date 2018/11/6 9:30
 * @Email zou.shiyong@frontsurf.com
 */
@Mapper
public interface UserMapper {
    int insert(User record);
    User selectByPrimaryKey(Integer id);
}
