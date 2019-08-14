package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    /*
    * Here we have two options:
    *
    * - Use @Qualifier to define the concrete class:
    * @Qualifier("greetingServiceImpl")
    * @Autowired
    * public GreetingService greetingServiceImpl;
    *
    * - Rename the property name:
    * public GreetingService greetingServiceImpl;
    *
    */
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingServiceImpl;
    }
}
