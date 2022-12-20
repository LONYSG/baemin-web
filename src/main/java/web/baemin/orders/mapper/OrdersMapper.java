package web.baemin.orders.mapper;

import org.apache.ibatis.annotations.Mapper;
import web.baemin.orders.dto.Orders;

import java.util.List;

@Mapper
public interface OrdersMapper {

    List<Orders> ordersList(Long login_id);

}
