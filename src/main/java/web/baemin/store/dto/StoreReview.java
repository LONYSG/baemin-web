package web.baemin.store.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import web.baemin.ordershistory.dto.OrdersMenuHistory;
import web.baemin.review.dto.ReviewPicture;

import java.util.List;

@Getter
@Setter
@ToString
public class StoreReview {

    private Long review_id;

    private Long store_id;

    private Long order_id;
    private String rating;
    private String content;
    private List<OrdersMenuHistory> ordersMenuHistoryList;
    private List<ReviewPicture> reviewPictureList;
    private String created_date;

}
