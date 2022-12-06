package web.baemin.mapper;

import org.apache.ibatis.annotations.Mapper;
import web.baemin.dto.Board;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<Board> boardList();

    Board boardRead(String id);

    void boardInsert(Board board);

    void boardUpdate(Board board);

}
