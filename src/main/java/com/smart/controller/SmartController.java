package com.smart.controller;

import cn.hutool.core.io.FileUtil;
import com.smart.domain.User;
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


    @GetMapping("/list.json")
    public List<String> getListForKeywords() {
        return Arrays.asList("333", "423434", "32423-----34354533", "4444");
    }

    @GetMapping("/save")
    public String login(String thingName, String thingPosition) {
        log.info("account={}, password={}", thingName, thingPosition);
        userMapper.insert(new User(thingName, thingPosition));
        return "success";
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
        return "e23.tech/images/" + file.getOriginalFilename();
    }

}
