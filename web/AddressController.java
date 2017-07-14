package webdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import webdemo.Services.AddressService;
import webdemo.Services.MyAddress;

/**
 * Created by exastax-03 on 7/14/2017.
 */
@Controller
public class AddressController {
    @Autowired
    AddressService addressService;

    @RequestMapping(path = "/adres", method = RequestMethod.POST)
    public ModelAndView createAddress(@ModelAttribute("addressForm") MyAddress myAddress) {
        String id="66";
        String address=myAddress.getAddress();
        String city=myAddress.getCity();
        String state=myAddress.getState();
        String zipcode=myAddress.getZipcode();
        addressService.createAddress(id,myAddress);
        return new ModelAndView("/adresbasarili");
    }
}
