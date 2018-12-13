package workshop.sb.config.controller;

import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;

@Service
public class GreetServiceSecondImplementation implements GreetService {

    @Override
    public String getMsg() {
        return GreetService.MSG + " for the second time";
    }
}
