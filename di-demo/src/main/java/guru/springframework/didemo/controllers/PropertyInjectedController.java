package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    * Without @Qualifier, the bean that have the
    * @Primary annotation, is the main concrete class
    * from Spring Context is create a instance and
    * inject then.
    */
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
