package webdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import webdemo.Services.MyUser;

/**
 * Created by exastax-03 on 7/11/2017.
 */
@Repository
public interface UserRepository extends MongoRepository<MyUser, String> {

    MyUser findByUsername(String username);
}
