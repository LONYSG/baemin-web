package web.baemin.review.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.baemin.ordershistory.dto.OrdersHistory;
import web.baemin.ordershistory.mapper.OrdersHistoryMapper;
import web.baemin.review.dto.Review;
import web.baemin.review.dto.ReviewPicture;
import web.baemin.review.mapper.ReviewMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReviewServiceImpl implements ReviewService{

    private final ReviewMapper reviewMapper;
    private final OrdersHistoryMapper ordersHistoryMapper;

    @Override
    public List<Review> reviewList(Long login_id) {
        List<Review> reviewPictureList = reviewMapper.reviewList(login_id);
        for(int i = 0; i < reviewPictureList.size(); i++)
        {
            Review current = reviewPictureList.get(i);
            current.setReviewPictureList(reviewMapper.reviewPictureList(current.getReview_id()));
            current.setOrdersMenuHistoryList(ordersHistoryMapper.ordersMenuHistoryList(current.getOrder_id()));
        }
        System.out.println(reviewPictureList);
        return reviewPictureList;
    }


    @Transactional
    @Override
    public void reviewInsert(Review review) {
        reviewMapper.reviewInsert(review);
        if(review.getReviewPictureList().get(0).getFilename() != "") {
            review.getReviewPictureList().forEach(reviewPicture -> {
                reviewPicture.setReview_id(review.getReview_id());
                reviewMapper.reviewPictureInsert(reviewPicture);
            });
        }
    }

    @Override
    public void reviewDelete(Review review) {
        reviewMapper.reviewDelete(review);
    }

    @Override
    public List<ReviewPicture> reviewPictureList(Long review_id) {
        return reviewMapper.reviewPictureList(review_id);
    }

}
