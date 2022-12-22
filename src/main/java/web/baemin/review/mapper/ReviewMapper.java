package web.baemin.review.mapper;

import org.apache.ibatis.annotations.Mapper;
import web.baemin.review.dto.Review;

import java.util.List;

@Mapper
public interface ReviewMapper {

    List<Review> reviewList(Long login_id);

    Review reviewRead(String review_id);

    void reviewInsert(Review review);

    void reviewUpdate(Review review);

    void reviewDelete(Review review);
}
