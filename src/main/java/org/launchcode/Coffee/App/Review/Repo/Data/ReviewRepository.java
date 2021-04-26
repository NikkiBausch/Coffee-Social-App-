package org.launchcode.Coffee.App.Review.Repo.Data;

import org.springframework.data.repository.CrudRepository;
import org.launchcode.Coffee.App.Review.Repo.Models.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<NewReview, Integer> {

}
