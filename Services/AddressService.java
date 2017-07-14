package webdemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.stereotype.Service;
import webdemo.repository.AddressRepository;

/**
 * Created by exastax-03 on 7/14/2017.
 */
@Service
public class AddressService {
    @Autowired
    AddressRepository repository;

    public MyAddress createAddress(String addressId, MyAddress address) {
        address.setId(addressId);
        repository.save(address);
        return address;
    }
}
