package web.baemin.review.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import web.baemin.review.dto.Review;
import web.baemin.review.mapper.ReviewMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReviewServiceImpl implements ReviewService{

    private final ReviewMapper reviewMapper;

    @Override
    public List<Review> reviewList(Long login_id) {
        List<Review> reviewList = reviewMapper.reviewList(login_id);
        log.info("reviewList : {}", reviewList.toString());

        return reviewList;
    }

    @Override
    public Review reviewRead(String review_id) {

        Review review = reviewMapper.reviewRead(review_id);

        return review;
    }

    @Override
    public void reviewInsert(Review review) {
        reviewMapper.reviewInsert(review);

    }

    @Override
    public void reviewUpdate(Review review) {
        reviewMapper.reviewUpdate(review);

    }

    @Override
    public void reviewDelete(Review review) {
        reviewMapper.reviewDelete(review);
    }
}
