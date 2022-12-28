package web.baemin.store.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class OrdersMenu {

    private Long order_id;
    private Map<Long, Long> menu_map;

}
