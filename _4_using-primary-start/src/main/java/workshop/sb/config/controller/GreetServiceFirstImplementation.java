package workshop.sb.config.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;

@Service
@Primary
public class GreetServiceFirstImplementation implements GreetService {

    @Override
    public String getMsg() {
        return GreetService.MSG + " for the first time";
    }
}
