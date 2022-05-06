
package org.zerock.pleasespring.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {

    private Integer bno;
    private String title;
    private String content;
    private String writer;

    private LocalDateTime regDate;
    private LocalDateTime updateDate;
    // 시분초가 나오면 LocalDateTime, 연월일만 나오는건 LocalDate
}
