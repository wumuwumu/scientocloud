package com.sciento.wumu.scientocloud.Controller.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserGetController {
    @RequestMapping(value = "/register" ,method = RequestMethod.GET)
    String getRegister(){
        return "pages/user/register";
    }


    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    String getlogin(){
        return "pages/user/login";
    }
}
