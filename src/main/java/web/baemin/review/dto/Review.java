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
    private String store_name;
    private String menu_name;
    private int rating;
    private String content;
    private String store_picture_url;
    private String created_date;
    private String modified_date;
    private String status;

}
