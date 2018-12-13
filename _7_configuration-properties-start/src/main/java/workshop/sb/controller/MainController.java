package workshop.sb.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@ConfigurationProperties(prefix = "test.property")
@Component
public class MainController {

    private String foo;

    private String bar;

    private String x;

    @GetMapping("/foo")
    public String getFoo(){
        return foo;
    }

    @GetMapping("/bar")
    public String getBar(){
        return bar;
    }

    @GetMapping("/x")
    public String getX(){
        return x;
    }
}
