package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    //@Qualifier("setterGreetingService") // can be used also in the method like the constructor service
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
