package Models;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Entity
public class UserEmail extends AbstractEntity {

    @OneToMany
    @JoinColumn(name="User_email")
    private List<NewUser> Users = new ArrayList<>();


    @Valid
    @NotBlank(message = "Field, 'Email', is required.")
    @Email(message="Must be a valid email.")
    private String email;

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public List<NewUser> getUsers(){
        return Users;
    }

    public void setUsers(List<NewUser> Users){
        this.Users = Users; }
}




