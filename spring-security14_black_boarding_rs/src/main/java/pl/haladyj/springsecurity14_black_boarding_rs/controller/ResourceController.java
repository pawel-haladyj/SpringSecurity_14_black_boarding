package pl.haladyj.springsecurity14_black_boarding_rs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/resource")
    public String resource(){
        return "Hello Resource";
    }
}
