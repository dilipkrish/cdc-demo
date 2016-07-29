package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureStubRunner
public class GreetingsTest {
    @Test
    public void greetingPrintsHelloWorld() {
        GreetingClient client = new GreetingClient(new RestTemplate());
        assertThat(client.greet(), equalTo("Hello World!"));
    }

    @Test
    public void greetingPrintsPersonalizedMessage() {
        GreetingClient client = new GreetingClient(new RestTemplate());
        assertThat(client.greet("Dilip"), equalTo("Hello Dilip!"));
    }
}
