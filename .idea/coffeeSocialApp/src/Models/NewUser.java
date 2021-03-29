import Models.UserEmail.java;
import Models.AboutMe.java;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;




public class NewUser extends UserID {




    @NotBlank(message = "Field, 'Username', is required.")
    @Size(min=3, max=15, message = "Username must be between 3 and 15 characters.")
    private String username;

    @Valid
    @NotBlank(message = "Field, 'Email', is required.")
    @Email(message="Must be a valid email.")
    private String email;

    @size(max=15, message = "Name cannot be longer than 15 characters.")
    private String firstname;

    private String password;


    public NewUser() {

    }



   public NewUser(String username, String email, String firstname, String password){
        this.username = username;
        this.email= email;
        this.firstname = firstname;
        this.password = password;


    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       NewUser entity = (NewUser) o;
       return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return this.id;
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

  public void getFirstname(){
      return firstname;
  }

  public void setFirstname(){
      return firstname;
  }

  public String getPassword() {
        return password;
    }



    @Override
    public String toString(){
      return username + email;
    }

}
