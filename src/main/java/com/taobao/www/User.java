package com.taobao.www;

import lombok.Data;

@Data
public class User {
    private String userName;
    private String password;
    private Role role;
}
