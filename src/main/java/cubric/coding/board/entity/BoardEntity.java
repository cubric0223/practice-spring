package cubric.coding.board.entity;
// DB의 테이블 역할을 하는 클래스
// 서비스와 레파지토리 사이에서만 사용하자! 라는 목적으로 일단 사용

import cubric.coding.board.DTO.BoardDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "board_table") // 테이블 이름을 따로 주고 싶을 떄
public class BoardEntity extends BaseEntity{ // 상속
    // 상속받는 이유는 회원가입, 댓글을 언제 했는지 공유하기 때문에 재활용이 가능하고 가독성이 높아지기 때문
    @Id // pk 컬럼 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment in mysql
    private Long id;

    @Column(length = 20, nullable = false)
    private String boardWriter;

    @Column
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHits;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setBoardTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContents(boardDTO.getBoardContents());
        boardEntity.setBoardHits(0);
        return boardEntity;
    }
}
