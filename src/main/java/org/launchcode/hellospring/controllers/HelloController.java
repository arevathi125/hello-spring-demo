package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    // Handle requests at path http://localhost:8080/hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    // Handle requests at path http://localhost:8080/goodbye
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";
    }

    // Handle requests at path http://localhost:8080/hello?name=Revathi
//    @GetMapping("hello")
//    @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, "+name+"!";
//    }

    // Handle requests at path http://localhost:8080/hello?name=Revathi
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, "+name+"!";
    }

    // Handle requests at path http://localhost:8080/hello/Revathi
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, "+name+"!";
    }

    // Handle requests at path http://localhost:8080/hello/form
    @GetMapping("form")
       public String helloForm(){
        return "<html>"+
                "<body>"+
                "<form action='/hello' method='post'>"+
                "<input type='text' name='name'>"+
                "<input type='submit' value='Greet Me!'>"+
                "</form>"+
                "</body>"+
                "</html>";

    }
}