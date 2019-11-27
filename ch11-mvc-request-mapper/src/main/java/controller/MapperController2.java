package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/dept")
public class MapperController2 {

    @GetMapping(value = {"/get","/get2"})
    public String index() {
        return "index3";
    }

    @PostMapping(value = "/post")
    public String index2() {
        return "index4";
    }

    @DeleteMapping(value = "/delete")
    public String index3() {
        return "index5";
    }

    @PutMapping(value = "/put")
    public String index4() {
        return "index6";
    }

    @PatchMapping(value = "/patch")
    public String index5() {
        return "index7";
    }

}
