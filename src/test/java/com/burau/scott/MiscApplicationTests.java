package com.burau.scott;

import com.burau.scott.model.AnotherResponse;
import com.burau.scott.model.HomeResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MiscApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void homeError() throws Exception {

        HomeResponse expectedResponse = new HomeResponse("HomeControllerAdvice");

        HomeResponse response = this.restTemplate.getForObject("http://localhost:" + port + "/home",
                HomeResponse.class);

        assertEquals(expectedResponse,response);
    }

    @Test
    public void anotherError() throws Exception {

        AnotherResponse expectedResponse = new AnotherResponse("AnotherControllerAdvice");

        AnotherResponse response = this.restTemplate.getForObject("http://localhost:" + port + "/another",
                AnotherResponse.class);

        assertEquals(expectedResponse,response);
    }


}
