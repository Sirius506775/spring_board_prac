// 타입을 지정하기 위한 dto 객체


package org.zerock.pleasespring.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDTO {

    private Integer bno;
    private String title;
    private String content;
    private String writer;

    private LocalDateTime regDate;
    private LocalDateTime updateDate;
}
