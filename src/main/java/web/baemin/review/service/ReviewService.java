package web.baemin.review.service;

import web.baemin.review.dto.Review;

import java.util.List;

public interface ReviewService {

    List<Review> reviewList(Long login_id);

    void reviewInsert(Review review);

    void reviewDelete(Review review);

}