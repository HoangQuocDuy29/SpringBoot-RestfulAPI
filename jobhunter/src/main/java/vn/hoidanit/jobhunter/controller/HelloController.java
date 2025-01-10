package vn.hoidanit.jobhunter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getHelloWorld() {
        System.out.println("duyy");
        return "Hello World (Hỏi dân IT )";
        
    }
}
