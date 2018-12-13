package workshop.sb.config.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreetService {

    public String getMsg(){
        return "Hello World!";
    }
}
