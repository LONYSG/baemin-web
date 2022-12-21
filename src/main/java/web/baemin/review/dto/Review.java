package web.baemin.review.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Review {

    private Long review_id;
    private Long user_id;
    private Long store_id;
    private Long menu_id;
    private int rating;
    private String content;
    private String picture_url;
    private String created_date;
    private String modified_date;
    private String status;

}
