package workshop.sb.config.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import workshop.sb.config.service.GreetService;

@RestController
public class GreetController {

//    @Autowired
    private GreetService greetService;

//    @Autowired // nie jest potrzebny jeśli jest tylko jeden konstruktor
//    public GreetController(GreetService greetService){
//        this.greetService = greetService;
//    }


//    @Autowired
    public void setGreetService(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping("/greet")
    public String greet(){
        return greetService.getMsg();
    }

}


