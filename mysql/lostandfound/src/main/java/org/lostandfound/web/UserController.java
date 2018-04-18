package org.lostandfound.web;

import org.lostandfound.entity.User;
import org.lostandfound.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //    @RequestMapping(value = "/}")
//    public String login1( ){
//        return "index";
//    }

    @RequestMapping(value = "page/{url}")
    public String login1(@PathVariable("url")String url ){
      return url;
    }

    @RequestMapping(value = "user/{url}")
    public String select(@PathVariable("url")String url ){
        return "user/"+url;
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(User user) {
        String str = userService.register(user);
        if(str.equals("success")){
            //注册成功返回登录界面
            return "login";
        }else{
            //注册失败还在注册界面
            return "register";
        }
    }

   @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String username, String password, Model model){
                User user = userService.login(username, password);
                if(user!=null){
                    model.addAttribute("user",user);
                    return "user/select";
                }else{
                    return "error";
                }
   }
}

