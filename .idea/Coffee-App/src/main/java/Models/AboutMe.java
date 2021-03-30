package Models;


import javax.validation.constraints.Size;

//Add annotation
public class AboutMe extends UserID {

    @Size(max=500)
    private String aboutme;

    @Size(max=200)
    private String coffeeTaste;

    @Size(max=200)
    private String foodTaste;



    public AboutMe(){}



    public String getAboutme(){
        return aboutme;
    }
    public void setAboutme(String aboutme){
        this.aboutme = aboutme;
    }

    public String getCoffeeTaste(){
        return coffeeTaste;
    }

    public void setCoffeeTaste(String coffeeTaste){
        this.coffeeTaste= coffeeTaste;
    }

    public String getFoodTaste(){
        return foodTaste;
    }

    public  void  setFoodTaste(String foodTaste){
        this.foodTaste= foodTaste;
    }


}
