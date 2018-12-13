package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelloController {

    // TODO 4 zdefiniuj pola hello, msg, foo, wstrzyknij do nich wartości używając @Value

    @Value("${HelloController.hello}")
    private String hello;

    @Value("${HelloController.msg}")
    private String msg;

    @Value("${HelloController.foo}")
    private String foo;

    // TODO 5 utwórz metodę obsługującą GET, "/hello"

    @GetMapping("/hello")
    public String getHello(){
        return hello;
    }

    // TODO 7 utwórz metodę obsługującą GET, "/msg"

    @GetMapping("/msg")
    public String getMsg(){
        return msg;
    }

    // TODO 9 utwórz metodę obsługującą GET, "/foo"

    @GetMapping("/foo")
    public String getFoo(){
        return foo;
    }

}


