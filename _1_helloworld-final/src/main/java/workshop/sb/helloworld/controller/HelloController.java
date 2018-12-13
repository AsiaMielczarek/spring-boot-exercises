package workshop.sb.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody // zwraca przesyłany obiekt (tekst)
public class HelloController {

    @GetMapping("/hello")
    public Response greetName(@RequestParam(value = "name", required = false) String name) {
        String greeting = "Hello, ";
        String defaultName = "World!";
        String msg = name != null ? greeting + name : greeting + defaultName;
        return new Response(msg);
    }
}

//Response domyślnie przesyła JSON'em
class Response {

    private static final String TITLE = "My message";
    private String msg;

    public Response(String msg){
        this.msg = msg;
    }

    public String getTitle(){
        return TITLE;
    }

    public String getMsg(){
        return msg;
    }
}
