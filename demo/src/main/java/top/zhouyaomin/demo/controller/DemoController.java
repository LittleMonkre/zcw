package top.zhouyaomin.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public String demo(){
        return "hello-word";
    }


    @GetMapping("/good")
    public String good (){
        return "say:good";
    }
}
