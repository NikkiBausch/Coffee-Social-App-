package Models;

import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.Valid;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class AbstractEntity {

        @Id
        @GeneratedValue
        private int id;

        @OneToMany
        @JoinColumn(name="Username")
        @NotBlank(message = "Field, 'Username', is required.")
        @Size(min=3, max=15, message = "Username must be between 3 and 15 characters.")
        private String username;




        @Override
        public String toString(){
                return username;
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

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                AbstractEntity that = (AbstractEntity) o;
                return id == that.id;

        }

        @Override
        public int hashCode() {
                return Objects.hash(id);
        }




        }
