package org.launchcode.Coffee.App.Review.Repo.Controllers;


import org.launchcode.Coffee.App.Review.Repo.Data.ReviewRepository;
import org.launchcode.Coffee.App.Review.Repo.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;

@Controller
@RequestMapping("reviews")
public class FormController {

    @Autowired
    private ReviewRepository reviewrepository;

   //Display reviews saved in the database
    @GetMapping
    public String displayAllReviews(){
        reviewrepository.findAll();
        return "reviews";
    }

    //display Review form
    @GetMapping("create")
    public String displayReviewForm(@RequestParam DatePicker datepicker, @RequestParam String nameOfBusiness, @RequestParam BeverageName beverageName, @RequestParam Atmosphere atmosphere, @RequestParam OverallRating overallRating, @RequestParam String summary){
        NewReview newReview = new NewReview(datepicker, nameOfBusiness, beverageName, atmosphere, overallRating, summary );

        return "reviews/create";

    }

    //Process review form/redirect back to form if "errors"
    @PostMapping("create")
    public String processDisplayReviewForm(@Valid NewReview newReview, Errors errors){
        if (errors.hasErrors()){
            return "reviews/create";
        }

        reviewrepository.save(newReview);
        return "redirect";
    }

    //Mapping for delete Review within ReviewRepo
    @GetMapping("delete review")
    public String displayDeleteReview(){
        reviewrepository.findAll();
        return "reviews/delete";
    }

    //Mapping for processing request to delete Review saved within ReviewRepo
    @PostMapping("delete review")
    public String processDeleteReview(int id){
                reviewrepository.deleteById(id);

        return "redirect";

    }

}
