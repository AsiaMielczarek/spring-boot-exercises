package workshop.sb.calculator.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/add/{a}/{b}")
    public double adding(@PathVariable double a, @PathVariable double b){
        return a + b;
    }

    @GetMapping("/sub/{a}/{b}")
    public double subtract(@PathVariable double a, @PathVariable double b){
        return a - b;
    }

    @GetMapping("/multi")
    public double multiply(@RequestParam double a, @RequestParam double b){
        return a * b;
    }

    @GetMapping("/div")
    public double divide(@RequestParam(value = "a", required = true) double a, @RequestParam(value = "b", required = true) double b){
        return b != 0.0 ? a / b : 0;
    }

}
