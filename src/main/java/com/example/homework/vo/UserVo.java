package com.example.homework.vo;

import lombok.Data;

@Data
public class UserVo {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String website;
    private String company;
}
// User 테이블의 데이터 타입을 선언해준다