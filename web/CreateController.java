package webdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import webdemo.Services.MyUser;
import webdemo.Services.UserService;

/**
 * Created by exastax-03 on 7/11/2017.
 */
@Controller
public class CreateController {
    @Autowired
    UserService userService;

    @RequestMapping(path = "/registration", method = RequestMethod.POST)
        public ModelAndView createAddress(@ModelAttribute("userForm") MyUser user) {
        String kadi=user.getUsername();
        String sifre=user.getPassword();
        userService.createuser(kadi, user);
        return new ModelAndView("/basarili");
    }

}
