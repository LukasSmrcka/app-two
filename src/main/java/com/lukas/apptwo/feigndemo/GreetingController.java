package com.lukas.apptwo.feigndemo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    String getGreeting() {
        return "Hello!!!";
    }

    @RequestMapping(method = RequestMethod.POST,
            value = "/greeting",
            consumes = "application/json")
    void postGreetingInBody (@RequestBody String greeting) {
        System.out.println("###########################################################");
        System.out.println("###################### "+ greeting);
        System.out.println("###########################################################");
    }
}
