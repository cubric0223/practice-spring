package cubric.coding.board.DTO;

import lombok.*;

import java.time.LocalDateTime;

// data transfer object 데이터 변환 객체
// 과거에는 VO, Bean
@Getter
@Setter
@ToString // 필드값 확인할 때
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String BoardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdateTime;
}
