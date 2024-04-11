
package com.example.ques4.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques4.Model.Address;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@RestController
public class AddressController {
      @RequestMapping("/welcome")
      public Address addsub(){
        Address obj=new Address();
        obj.setName("aruthra");
        obj.setDoorNo(123);
        obj.setStreetName("Main");
        obj.setPincode(600107);
        obj.setArea("koyambedu");
        obj.setDistrict("chennai");
        obj.setState("Tamil Nadu");
        obj.setCountry("India");
        return obj;
    
      }
}
