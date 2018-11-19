package gxk.java.homework.controller;

import gxk.java.homework.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 郭效坤
 * @Date 2018/11/18 15:17
 * @Description
 */
@Controller
@RequestMapping("/homework")
public class LoginController {

    @PostMapping("/login/test")
    public String loginTest(@RequestBody User user){
        System.out.println(user.toString());
        return "management";
    }
}
