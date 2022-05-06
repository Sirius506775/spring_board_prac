package org.zerock.pleasespring.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.pleasespring.dto.BoardDTO;

@Log4j2
@Controller
@RequestMapping("/board/*")
public class BoardController {



    //list로 redirect하는 메소드
    @GetMapping("/") //매핑
    public String basic(){ // board로 들어오면 list로 redirct하는 메소드

        return "redirect:/board/list"; //redirect: 으로 시작하면 무조건 redirect이다.
    }

    //list.jsp를 get방식으로 requerst 메소드
    @GetMapping("/list")
    public void list(){ //void의 경우 무조건 경로의 jsp가 된다.

        log.info("list....호출 중");
    }

    // 등록할 때 쓰는 POST 메소드
    @PostMapping("/register")
    public String registerPOST(BoardDTO boardDTO, RedirectAttributes rttr){ //파라미터의 자동 수집으로 boardDTO를 넣어준다. request.getparameter를 하지 않아도, 알아서 수집한다.

         log.info("-----post방식으로 동작 중인지 확인 중입니다.---");
         log.info(boardDTO); //boardDTO 수집이 제대로 되었는지 확인한다.

        rttr.addFlashAttribute("result",123);
        // FlashAttribute는 세션에 결과를 담고, 한 번만 데이터를 쓰고 영원히 사라진다.
        // 일회용으로 데이터를 전달하기 위해 사용

        rttr.addAttribute("num", "321");

        return "redirect:/board/list";
    }


}
