package web.baemin.review.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
    public void index(Model model){

        List<Review> reviewList = reviewService.reviewList();
        System.out.println("boardList = " + reviewList.toString());

        model.addAttribute("reviewList", reviewList);
    }

    @GetMapping("/register")
    public void register(){

    }

    @PostMapping("/register")
    public String register(RedirectAttributes redirectAttributes, Review review){
        System.out.println("review = " + review);

        reviewService.reviewInsert(review);

        redirectAttributes.addFlashAttribute("msg", null);

        return "redirect:/review/list";
    }

    @GetMapping("/read")
    public void read(Model model, @RequestParam String review_id){
        System.out.println("review_id = " + review_id);

        Review review = reviewService.reviewRead(review_id);

        model.addAttribute("review", review);

    }

    @PostMapping("/read")
    public String read(RedirectAttributes redirectAttributes, Review review){
        System.out.println("review = " + review);

        reviewService.reviewUpdate(review);

        redirectAttributes.addFlashAttribute("msg", null);

        return "redirect:/review/list";
    }
}
