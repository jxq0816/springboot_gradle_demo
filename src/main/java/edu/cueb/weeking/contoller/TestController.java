package edu.cueb.weeking.contoller;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        return "Hello World!";
    }
}