package com.customer.portal.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.customer.portal.model.Signup;

/*@Service
@Repository
public interface SignupRepo extends MongoRepository<Signup, String>{
	Signup findBy_id(ObjectId _id);
}*/

@Service
@Repository
public interface SignupRepo extends PagingAndSortingRepository<Signup, String> {

    List<Signup> findByEmail(String email);
    List<Signup> findAll();
    List<Signup> findByfirstName(String firstName);
    List<Signup> findByusername(String username);

}
