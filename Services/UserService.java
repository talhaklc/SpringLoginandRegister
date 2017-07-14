package webdemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import webdemo.repository.UserRepository;

/**
 * Created by exastax-03 on 7/7/2017.
 */
@Service
public class UserService implements UserDetailsService{
    @Autowired
    private UserRepository repository;


    public MyUser createuser(String username, MyUser user){
        user.setUsername(username);
        repository.save(user);
        return user;
    }
    public MyUser getuser(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return getuser(s);
    }
}
