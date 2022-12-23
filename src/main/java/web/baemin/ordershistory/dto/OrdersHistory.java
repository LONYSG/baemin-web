package web.baemin.ordershistory.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrdersHistory {

    private Long order_id;

    private Long user_id;
    private Long login_id;
    private String store_id;
    private String store_name;
    private String total_price;
    private String store_picture_url;
    private Long menu_id;
    private String menu_name;
    private Long price;
    private String order_address;
    private String created_date;
    private String modified_date;
    private String status;

}
