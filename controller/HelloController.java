package org.zerock.pleasespring.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HelloController {

    @GetMapping("/hello") //과거의 servlet처럼 URLMapping을 안주고, get,post 방식 다 어노테이션으로 처리한다.
    public void hello(){ //파라미터의 제약도, 리턴타입에 대한 제약도 없기 때문에 public으로 메소드 선언
        log.info("Hello.........");
    }

}
