import Models.UserEmail.java;
import Models.AboutMe.java;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;




public class userProfileCreate {

    private int id;
    private static int nextId = 1;


    @NotBlank(message = "Field, 'Username', is required.")
    @Size(min=3, max=15)
    private String username;

    private String firstname;

    private String password;


    public userProfileCreate() {
        id = nextId;
        nextId++;
    }



   public userProfileCreate(String username, String email, String firstname, String aboutme, String password){
        this.username = username;
        this.firstname = firstname;
        this.password = password;


    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       userProfileCreate entity = (userProfileCreate) o;
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


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
