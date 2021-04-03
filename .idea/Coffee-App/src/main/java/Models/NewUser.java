package Models;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Objects;
import javax.persistence.*;



@Entity
public class NewUser extends AbstractEntity {

    @ManyToOne
    private AbstractEntity username;

    @ManyToOne
    private UserEmail email;

    @ManyToOne
    private FirstName firstname;

    @ManyToOne
    private AboutMe aboutme;

    public NewUser(){

    }

    public NewUser(AbstractEntity aUsername, UserEmail anEmail, FirstName aFirstname, AboutMe anAboutme){
        this.username = aUsername;
        this.email = anEmail;
        this.firstname = aFirstname;
        this.aboutme = anAboutme;

    }

    public AbstractEntity getUsername(String username){
        return username;
    }

    public AbstractEntity setUsername(String username){
        this.username= username;
    }

    public UserEmail getEmail(){
        return email;
    }
    public void setEmail(UserEmail email){
        this.email = email;
    }

    public FirstName getFirstname(){
        return firstname;
    }

    public void setFirstname(FirstName firstname){
        this.firstname= firstname;
    }

    public AboutMe getAboutme(){
        return aboutme;
    }

    public void setAboutme(AboutMe aboutme){
        this.aboutme= aboutme;
    }
















}
