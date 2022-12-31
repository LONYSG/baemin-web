//package web.baemin.store.controller;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.SessionAttribute;
//import web.baemin.login.dto.User;
//import web.baemin.ordershistory.dto.OrdersHistory;
//import web.baemin.ordershistory.service.OrdersHistoryService;
//import web.baemin.store.dto.Coupon;
//import web.baemin.store.dto.StoreReview;
//import web.baemin.store.service.StoreService;
//
//import java.util.List;
//
//@Slf4j
//@RestController
//@RequestMapping("/coupon/")
//@RequiredArgsConstructor
//public class StoreReviewController {
//
//    private final StoreService storeService;
//
//    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<StoreReview>> list() {
//        List<StoreReview> storeReviewList = storeService.storeReviewList(Long.parseLong(loginUserSession.getLogin_id()));
//
//        return new ResponseEntity<>( couponList, HttpStatus.OK);
//    }
//
//
//}
