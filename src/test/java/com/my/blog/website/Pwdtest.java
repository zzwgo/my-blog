package com.my.blog.website;

import com.my.blog.website.model.Vo.UserVo;
import com.my.blog.website.utils.TaleUtils;

import java.util.HashSet;


public class Pwdtest {
    public static void main(String args[]){
//        UserVo user = new UserVo();
//        user.setUsername("admin");
//        user.setPassword("111111");
//        String encodePwd = TaleUtils.MD5encode(user.getUsername() + user.getPassword());
//        System.out.println(encodePwd);
        HashSet<String> a=new HashSet<>();
        a.add("123");
        a.add("123");
        System.out.println(a);
    }
}
