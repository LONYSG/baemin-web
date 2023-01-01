package web.baemin.review.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import web.baemin.login.dto.User;
import web.baemin.review.dto.Review;
import web.baemin.review.service.ReviewService;

import java.util.List;


@Slf4j
@Controller
@RequestMapping("/review/")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/list")
    public void index(Model model,@SessionAttribute(name = "loginUserSession", required = false) User loginUserSession) {
        List<Review> reviewList = reviewService.reviewList(Long.parseLong(loginUserSession.getLogin_id()));

        model.addAttribute("reviewList", reviewList);
    }

    @GetMapping("/register")
    public void register(Model model,Review review){

        model.addAttribute("review", review);

    }

    @PostMapping("/register")
    public String register(RedirectAttributes redirectAttributes, Review review, MultipartFile file){
        //review.setReview_id(8006l);
        //review.setUser_id(2l);
        //review.setStore_id(9002l);
        //review.setMenu_id(4002l);
        //review.setRating(4);
        //review.setPicture_url("https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg");
        //review.setStatus("일반");
        System.out.println("review ==== " + review);

        reviewService.reviewInsert(review);

        redirectAttributes.addFlashAttribute("msg", null);

        return "redirect:/review/list";
    }

}
