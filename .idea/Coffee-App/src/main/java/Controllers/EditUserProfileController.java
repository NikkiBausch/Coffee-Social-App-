package Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Objects;

@Controller
@RequestMapping("editProfileView")
public class editUserProfileController<editProfile>{

    @GetMapping
    public String displayEditUserInfo (Model Model){
        model.addAttribute("Username", username);
        model.addAttribute("Email", email);
        model.addAttribute("Firstname", firstname);
        model.addAttribute("Aboutme", aboutme);
        model.addAttribute("CoffeeTaste", coffeeTaste);
        model.addAttribute("FoodTaste", foodTaste);
        model.addAttribute("changePassword", password);



    }

    @PostMapping
    public String changeUserInfo(@RequestParam String email, @RequestParam String username, @RequestParam String firstname, @RequestParam String aboutme,
                                 @RequestParam String Password, @RequestParam String coffeeTaste, @RequestParam String foodTaste){
        User User = User(email, username, firstname, aboutme, coffeeTaste, foodTaste, Password);
        model.addAttribute("User", User);

    }

        return "ViewProfile";

}

}


        }

//Delete Button Functionality
//Upload a photo?
