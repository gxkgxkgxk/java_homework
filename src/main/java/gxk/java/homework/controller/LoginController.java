package gxk.java.homework.controller;

import gxk.java.homework.POJO.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 郭效坤
 * @Date 2018/11/18 15:17
 * @Description
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping("/test")
    public String loginTest(@RequestBody User user){
        return "redirect:management.html";
    }
}
