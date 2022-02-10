package com.jojoidu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//JSON을 반환하는 컨트롤러로 만들기
@RestController
public class HelloController {
    //Get 요청을 받을 수 있는 API로 만들기 (hello로 요청을 받으면 아래의 값을 반환함)
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}