package web.baemin.store.service;

import web.baemin.store.dto.Store;

import java.util.List;

public interface StoreService {
    List<Store> storeList(String food_category_cd);


}
