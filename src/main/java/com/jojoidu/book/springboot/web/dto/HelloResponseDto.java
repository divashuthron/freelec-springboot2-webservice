package com.jojoidu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;

    @GetMapping("/hello/dto")
    //외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
    //name으로 넘어 온 파라미터를 name 변수에 저장, amount로 넘어 온 파라미터를 amount 변수에 저장
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}