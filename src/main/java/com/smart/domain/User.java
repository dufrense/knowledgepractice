package com.smart.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author hacker
 * @date 2020/12/26 15:49
 * @describe
 */
@Data
@AllArgsConstructor
public class User {

    private String account;

    private String password;
}
