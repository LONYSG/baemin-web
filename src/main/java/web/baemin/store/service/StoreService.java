package web.baemin.store.service;

import web.baemin.store.dto.*;

import java.util.List;

public interface StoreService {
    List<Store> storeList(String food_category_cd);

    Store storeRead(String store_id);

    List<Menu> menuList(String store_id);

    List<Coupon> couponList();

    void ordersInsert(Orders orders);

//    void ordersMenuInsert(OrdersMenu ordersMenu);
}
