package webdemo.Services;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by exastax-03 on 7/11/2017.
 */
public class MyRole implements GrantedAuthority {
    private String role;

    public MyRole() {
    }

    public MyRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
