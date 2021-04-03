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
public class FirstName extends AbstractEntity {

    @OneToMany
    @JoinColumn(name="First_name")
    private List<NewUser> Users = new ArrayList<>();


    @Size(max=15, message = "Name cannot be longer than 15 characters.")
    private String firstname;

    public FirstName(){

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<NewUser> getUsers(){
        return Users;
    }

    public void setUsers(List<NewUser> Users){
        this.Users = Users; }
}
