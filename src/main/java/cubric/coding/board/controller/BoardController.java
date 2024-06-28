package cubric.coding.board.controller;

import cubric.coding.board.DTO.BoardDTO;
import cubric.coding.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService; // 생성자 주입 방식으로 의존성 주입

    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/save")
    //public String save(@RequestParam("boardWriter") String boardWriter)
    // 이렇게 받을 수도 있긴하다.
    public String save(@ModelAttribute BoardDTO boardDTO) { // 이름이 같다면 setter를 호출
        System.out.println("boardDTO = " + boardDTO); // soutp
        boardService.save(boardDTO);
        return "index";
    }
}
