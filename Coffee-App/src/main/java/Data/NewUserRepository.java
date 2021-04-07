package Data;

import Models.NewUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewUserRepository extends CrudRepository<NewUser, Integer> {
}
