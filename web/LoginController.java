package webdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.jasperreports.JasperReportsHtmlView;
import webdemo.Services.MyUser;
import webdemo.Services.UserService;

/**
 * Created by exastax-03 on 7/11/2017.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login-success",method = RequestMethod.POST)
    public ModelAndView loginSuccess() {
        return new ModelAndView("/adresbasarili");
    }

    @RequestMapping(value = "/login-fail",method = RequestMethod.GET)
    public ModelAndView loginFail() {
        return new ModelAndView("/fail");
    }
}
