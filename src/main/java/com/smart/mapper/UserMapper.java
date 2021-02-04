package com.smart.mapper;

import com.smart.domain.User;

import java.util.List;

/**
 * @author hacker
 * @date 2020/12/26 15:52
 * @describe
 */
public interface UserMapper {

    /***
     * insert One User
     * @param user
     */
    void insert(User user);

    List<User> listByThingNameKey(String thingNameKey);

    int delByThingName(String thingName);
}
