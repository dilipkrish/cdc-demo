package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public ResponseEntity<Greeting> greet() {
        return ResponseEntity.ok().body(new Greeting("Hello World!"));
    }

    @RequestMapping(value = "/personalized", method = RequestMethod.GET)
    public ResponseEntity<Greeting> personalized(@RequestParam String name) {
        return ResponseEntity.ok().body(new Greeting(String.format("Hello %s!", name)));
    }
}
