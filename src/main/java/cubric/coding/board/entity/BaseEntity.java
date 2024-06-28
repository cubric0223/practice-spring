package cubric.coding.board.entity;

// 시간에 대한 Entity는 따로 만드는 것도 나쁘지 않다

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @CreationTimestamp // 생성되었을 때 시간을 만들어주는
    @Column(updatable = false) // 수정 시에는 관여 못하게
    private LocalDateTime createdTime;

    @UpdateTimestamp // 업데이트가 되었을 때 시간을 수정해주는
    @Column(insertable = false) // 입력시 관여 못하게
    private LocalDateTime updatedTime;
}
