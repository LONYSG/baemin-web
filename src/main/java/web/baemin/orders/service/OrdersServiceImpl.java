package web.baemin.orders.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import web.baemin.orders.dto.Orders;
import web.baemin.orders.mapper.OrdersMapper;
import web.baemin.store.dto.Coupon;
import web.baemin.store.dto.Menu;
import web.baemin.store.dto.Store;
import web.baemin.store.mapper.StoreMapper;
import web.baemin.store.service.StoreService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrdersServiceImpl implements OrdersService {


    private final OrdersMapper ordersMapper;

    @Override
    public List<Orders> ordersList(Long login_id) {
        return ordersMapper.ordersList(login_id);
    }

}
