package Models;


import javax.persistence.Entity;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class NewUser {

    @Id
    @GeneratedValue
    private int id;

    @JoinColumn(name="Username")
    @NotBlank(message = "Field, 'Username', is required.")
    @Size(min=3, max=15, message = "Username must be between 3 and 15 characters.")
    private String username;

    @JoinColumn(name="User_email")
    @Valid
    @NotBlank(message = "Field, 'Email', is required.")
    @Email(message="Must be a valid email.")
    private String email;

    @JoinColumn(name="First_name")
    @Size(max=15, message = "Name cannot be longer than 15 characters.")
    private String firstName;

    @JoinColumn(name="about_me")
    @Size(max=500)
    private String aboutMe;


    public NewUser(String username, String email, String firstName, String aboutMe) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.aboutMe = aboutMe;
    }

    public NewUser() {

    }



    public int getId(){
        return id;
    }

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewUser newUser  = (NewUser) o;
        return id == newUser.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}



















