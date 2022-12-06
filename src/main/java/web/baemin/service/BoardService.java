package web.baemin.service;

import web.baemin.dto.Board;

import java.util.List;

public interface BoardService {


    List<Board> boardList();

    Board boardRead(String id);

    void boardInsert(Board board);

    void boardUpdate(Board board);

}
