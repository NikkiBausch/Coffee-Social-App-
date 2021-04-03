package Models;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.Valid;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AboutMe extends AbstractEntity {

@OneToMany
@JoinColumn(name="about_me")
private List <NewUser> Users = new ArrayList<>();


    @Size(max=500)
    private String aboutme;

    public AboutMe(){

    }

    public String getAboutme() {
        return aboutme;
    }

    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }

    public List<NewUser> getUsers(){
        return Users;
    }

    public void setUsers(List<NewUser> Users){
    this.Users = Users; }
}
