import coffee-social-app.Models.newUserApplication.java;
import coffee-social-app.Models.userProfileCreate;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;


public class AboutMe extends userProfileCreate {

    @Size(max=500)
    private String aboutme;

    @Size(max=200)
    private String coffeeTaste;

    @Size(max=200)
    private String foodTaste;



   public AboutMe(){}

}

public String getAboutme(){
    return aboutme;
}
public String setAboutme(String aboutme){
    this.aboutme = aboutme;
}

public String getCoffeeTaste(){
    return coffeeTaste;
}

public String setCoffeeTaste(String coffeeTaste){
    this.coffeeTaste= coffeeTaste;
}

public String getFoodTaste(){
    return foodTaste;
}

public String setFoodTaste(String foodTaste){
    this.foodTaste= foodTaste;
}
