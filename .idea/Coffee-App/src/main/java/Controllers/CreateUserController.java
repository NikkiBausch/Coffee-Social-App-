package Controllers;

import Models.newUserApplication.java;
import Models.userProfileCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Objects;

@Controller
@RequestMapping("NewUserSignUp")
public class CreateUserController<createProfile> {






    @GetMapping
    public String displayUserSignUp (Model Model){
        model.addAttribute(new userProfileCreate());
        model.addAttribute("Username", Username);
        model.addAttribute("Email", Email);
        model.addAttribute("Firstname", Firstname);
        model.addAttribute("AboutMe", AboutMe);
        model.addAttribute("Password", Password);


    }



    @PostMapping
    public String processUserSignUp(@RequestParam String Email, @RequestParam String Username, @RequestParam String Firstname, @RequestParam String Aboutme,
                                    @RequestParam String Password){
        User newUser = new User(email, username, firstname, aboutme, password);
        model.addAttribute("User", newUser);

    }

        return "editProfileView";

}

}
