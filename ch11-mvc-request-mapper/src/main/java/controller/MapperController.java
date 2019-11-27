package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapperController {

    @RequestMapping(value = {"/index","/index2"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/**/*index",params = {"a=1"})
    public String index2() {
        return "index2";
    }

}
