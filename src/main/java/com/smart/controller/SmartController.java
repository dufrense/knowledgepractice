package com.smart.controller;

import cn.hutool.core.io.FileUtil;
import com.smart.domain.Thing;
import com.smart.mapper.ThingMapper;
import com.smart.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author hacker
 * @date 2020/12/26 15:20
 * @describe
 */
@CrossOrigin
@RestController
@Slf4j
@RequestMapping("thing")
public class SmartController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ThingMapper thingMapper;


    @GetMapping("/list.json")
    public List<String> getListForKeywords() {
        return Arrays.asList("333", "423434", "32423-----34354533", "4444");
    }


    @GetMapping("/list")
    public Object list(String thingNameKey) {
        return userMapper.listByThingNameKey(thingNameKey);
    }

    @PutMapping("/del/{thingName}")
    public Object del(@PathVariable String thingName) {
        return userMapper.delByThingName(thingName);
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        // copy the file the certain location
        String pathDir = "/home/rxw/images";
        try {
            FileUtil.writeBytes(file.getBytes(), pathDir + "/" + file.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "http://www.e23.tech/images/" + file.getOriginalFilename();
    }



    @PostMapping("/save")
    public String save(@RequestBody Thing thing){
        thingMapper.insert(thing);
        return "success";
    }

    @GetMapping("/listThing")
    public Object listThing(){
        return thingMapper.listThing();
    }
}
