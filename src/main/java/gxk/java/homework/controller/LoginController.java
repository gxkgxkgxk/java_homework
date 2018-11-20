package gxk.java.homework.controller;

import gxk.java.homework.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 郭效坤
 * @Date 2018/11/18 15:17
 * @Description
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @PostMapping("/test/crazy")
    public User loginTest(@RequestBody User user){
        System.out.println(user.toString());
        return user;
    }
}
