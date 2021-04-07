package Controllers;



//import statements (check on Chris's)
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("ViewProfile")
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

