package com.smart.mapper;

import com.smart.domain.Thing;

import java.util.List;

/**
 * @author hacker
 * @date 2020/12/26 15:52
 * @describe
 */
public interface ThingMapper {


    int insert(Thing thing);

    List<Thing> listThing();
}
