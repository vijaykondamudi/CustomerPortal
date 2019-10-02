package com.customer.portal.repo;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
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

}
