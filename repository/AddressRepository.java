package webdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import webdemo.Services.MyAddress;

/**
 * Created by exastax-03 on 7/14/2017.
 */
public interface AddressRepository extends MongoRepository<MyAddress, String> {

    MyAddress findByAddress(String address);
}
