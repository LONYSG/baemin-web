package web.baemin.review.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReviewPicture {

    private Long review_id;
    private Long picture_url;
}
