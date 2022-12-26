package web.baemin.store.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OrdersMenu {

    private Long order_id;
    private List<Long> menu_id;
    private Long menu_count;

}
