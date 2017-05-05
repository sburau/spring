package com.burau.scott;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MiscApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void homeError() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/home/abc",
                String.class)).contains("Home exception");
    }

    @Test
    public void anotherError() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/another/def",
                String.class)).contains("Another exception");
    }


}
