package com.example;

import org.springframework.web.client.RestTemplate;

public class GreetingClient {
    private RestTemplate rest;

    public GreetingClient(RestTemplate rest) {
        this.rest = rest;
    }

    public String greet() {
        return rest.getForEntity("http://localhost:8080/greeting", Greeting.class).getBody().getMessage();
    }

    public String greet(String name) {
        String url = String.format("http://localhost:8080/personalized?name=%s", name);
        return rest.getForEntity(url, Greeting.class).getBody().getMessage();
    }
}
