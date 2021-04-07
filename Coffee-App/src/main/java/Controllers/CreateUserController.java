package Controllers;

import Models.NewUser;
import Models.newUserApplication.java;
import Models.userProfileCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Objects;

@RestController
@RequestMapping("NewUserSignUp")
public class CreateUserController {



//NewUser Controls


    @GetMapping
    public String displayUserSignUp (){
        NewUser.getAllUsers();
        //create mapping for getAllUsers()
        //manually add users to MySQL (for testing)
        //just returning all users
        return newUser;
    }



    @PostMapping
    public NewUser processUserSignUp(@RequestParam String email, @RequestParam String username, @RequestParam String firstName, @RequestParam String aboutMe
                                    ){
        NewUser newUser = new NewUser(email, username, firstName, aboutMe);
        return newUser;

    }



//Edit Profile Login View Controls



    //View Profile Controls

}
