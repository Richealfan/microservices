package org.richsoftware.microservices.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {
    public static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTest.class);
    @Autowired
    RestTemplate restTemplate;

    @Test
    public void test() {
        String result1 = restTemplate.getForObject("http://hello-service/hello", String.class);
        LOGGER.info(result1);
        String result2 = restTemplate.getForObject("http://hello-service/hello", String.class);
        LOGGER.info(result2);
    }
}
