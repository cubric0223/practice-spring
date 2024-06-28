package cubric.coding.board.repository;

import cubric.coding.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// 기본적으로 Entity class 만 받아준다
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
