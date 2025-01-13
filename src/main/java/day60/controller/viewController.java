package day60.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewController {

    @GetMapping("")
    public String main(){

        return "/day60/main.html";
    }

    @GetMapping("/signUp")
    public String signUp(){
        return "/day60/signUp.html";
    }
    @GetMapping("/list")
    public String list(){
        return "/day60/list.html";
    }
}
