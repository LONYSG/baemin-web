package web.baemin.review.service;

import web.baemin.review.dto.Review;
import web.baemin.review.dto.ReviewPicture;

import java.util.List;

public interface ReviewService {

    List<Review> reviewList(Long login_id);

    void reviewInsert(Review review);

    void reviewDelete(Review review);

//    public void register(BoardVO board);

//    public BoardVO get(Long bno);

//    public boolean modify(BoardVO board);

//    public boolean remove(Long bno);

    // public List<BoardVO> getList();

//    public List<BoardVO> getList(Criteria cri);

    //추가
//    public int getTotal(Criteria cri);

    List<ReviewPicture> reviewPictureList(Long review_id);

}