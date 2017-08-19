package com.sciento.wumu.scientocloud.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {

    @RequestMapping(value = {"/","/index"})
    public String index() {
        return "index";
    }


    @RequestMapping("/403")
    public String forbidden() {
        return "403";
    }

}
