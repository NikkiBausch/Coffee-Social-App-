import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;


@MappedSuperclass
public abstract UserID {

    @Id
    @GeneratedValue
    private int id;

    public int getId(){
      return id;
  }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserID)) return false;
        UserID UserID = (UserID) o;
        return id == UserID.id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }





}
