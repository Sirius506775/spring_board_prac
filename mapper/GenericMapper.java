package org.zerock.pleasespring.mapper;

import org.apache.ibatis.annotations.Param;
import org.zerock.pleasespring.domain.BoardVO;

import java.util.List;

public interface GenericMapper <E,K>{
    void insert(E board);

    List<BoardVO> selectList(@Param("skip") int skip, @Param("size") int size );

    void delete(K bno);


    BoardVO selectOne(K bno);


    void update(E board);

}
