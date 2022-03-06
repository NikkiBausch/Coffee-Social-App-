package Controllers;

import Data.NewUserRepository;
import Models.NewUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;



@RestController
@RequestMapping("NewUserSignUp")
public class CreateUserController {

    @Autowired
    private NewUserRepository newuserrepository;

    @Autowired
    private NewUser newUser;



//NewUser Controls

    //We need to display the sign up form for non-users who want to become New Users.

    //It would be less complex if we made the Sign up form the homepage (index) for now,
    // while I sort out Oauth.

    @GetMapping("index/NewUserSignUp")
    public String index(){
        return "index/NewUserSignUp";
    }

    @GetMapping("NewUserSignUp")
    public String displayUserSignUp(@RequestParam @Valid String email, @RequestParam String username, @RequestParam String firstName, @RequestParam String aboutMe){
        NewUser newUser = new NewUser(email, username, firstName, aboutMe);

        return "index/NewUserSignUp";

    }



    @PostMapping("NewUserSignUp")
    public String processUserSignUp(@Valid NewUser newUser, Errors errors){
        if (errors.hasErrors()){
            return "index/NewUserSignUp";
        }

        newuserrepository.save(newUser);
        return "redirect";
    }



//Edit Profile Login View Controls

    //We need to display the form to edit User Info for Profile Display.

    @RequestMapping("editProfileView")
    @GetMapping
    public NewUser displayEditUserInfo(){


        return newUser; }

    //We need to process the form to save changes to the MySQL database.
    @RequestMapping("editProfileView")
    @PostMapping
    public String changeUserInfo(@RequestParam String email, @RequestParam String username, @RequestParam String firstName, @RequestParam String aboutMe){
       NewUser newUser = new NewUser(email, username, firstName, aboutMe);
       return "ViewProfile";

    }

    @GetMapping("delete profile")
    public String displayDeleteProfile(){
        newuserrepository.findAll();
        return "reviews/delete";
    }

    @PostMapping("delete profile")
    public String processDeleteProfile(int id){
        newuserrepository.deleteById(id);

        return "redirect";

    }

    //We need to display a delete profile button.

    //We need to process the option to delete profile (by ID).




    //View Profile Controls

    //We need to .get the form user info and display under the form prompts.

    //I think that's it, really, unless we incorporate more advanced features.



}
