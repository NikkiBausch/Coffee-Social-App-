import coffee-social-app.Models.newUserApplication.java;
import coffee-social-app.Models.userProfileCreate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Requestmapping("ViewProfile")
public class ProfileViewController{


    @GetMapping("username")
    public String displayUserName() {
        return getUserName; 
    }

    @GetMapping ("firstname")
    public String displayFirstName(){
        return getFirstName; 
    }

    @GetMapping("aboutme")
    public String displayAboutMe(){
        return getAboutme;
    }

    @GetMapping("coffeeTaste")
        public String displayCoffeeTastes(){
            return getCoffeeTastes; 
        }

    @GetMapping("foodTaste")
        public String displayFoodTastes(){
            return getFoodTastes;
        }
    

}
