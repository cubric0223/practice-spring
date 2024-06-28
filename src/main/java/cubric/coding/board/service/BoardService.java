package cubric.coding.board.service;

import cubric.coding.board.DTO.BoardDTO;
import cubric.coding.board.entity.BoardEntity;
import cubric.coding.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// DTO -> Entity (Entity class 에서)
// Entity -> DTO (DTO class 에서)

// Entity class 는 DB와 직접적인 연결하기 때문에 view 단에 노출시키지 말아라
// Entity class 는 service 까지만

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
