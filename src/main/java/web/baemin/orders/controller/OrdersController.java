package web.baemin.orders.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.baemin.login.dto.User;
import web.baemin.main.service.MainService;
import web.baemin.orders.dto.Orders;
import web.baemin.orders.service.OrdersService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/orders/")
@RequiredArgsConstructor
public class OrdersController {

    private final OrdersService ordersService;
    private final MainService mainService;

    @GetMapping("/list")
    public void list(Model model, @SessionAttribute(name = "loginUserSession", required = false) User loginUserSession) {
        List<Orders> ordersList = ordersService.ordersList(Long.parseLong(loginUserSession.getLogin_id()));

        model.addAttribute("ordersList", ordersList);
    }

}
