package web.baemin.store.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.baemin.store.dto.*;
import web.baemin.store.mapper.StoreMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StoreServiceImpl implements StoreService {


    private final StoreMapper storeMapper;

    @Override
    public List<Store> storeList(String food_category_cd) {
        return storeMapper.storeList(food_category_cd);
    }

    @Override
    public Store storeRead(String store_id) {
        return storeMapper.storeRead(store_id);
    }

    @Override
    public List<Menu> menuList(String store_id) {
        return storeMapper.menuList(store_id);
    }

    @Override
    public List<Coupon> couponList() {
        return storeMapper.couponList();
    }

    @Transactional
    @Override
    public void ordersInsert(Orders orders) {

        storeMapper.ordersInsert(orders);
        orders.getOrdersMenuList().forEach(ordersMenu -> {
           ordersMenu.setOrder_id(orders.getOrder_id());
           storeMapper.ordersMenuInsert(ordersMenu);
        });

    }

//    @Override
//    public void ordersMenuInsert(OrdersMenu ordersMenu) {
//        storeMapper.ordersMenuInsert(ordersMenu);
//    }

}
