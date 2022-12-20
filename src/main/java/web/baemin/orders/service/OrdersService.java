package web.baemin.orders.service;

import web.baemin.orders.dto.Orders;
import web.baemin.store.dto.Coupon;
import web.baemin.store.dto.Menu;
import web.baemin.store.dto.Store;

import java.util.List;

public interface OrdersService {
    List<Orders> ordersList(Long login_id);

}
