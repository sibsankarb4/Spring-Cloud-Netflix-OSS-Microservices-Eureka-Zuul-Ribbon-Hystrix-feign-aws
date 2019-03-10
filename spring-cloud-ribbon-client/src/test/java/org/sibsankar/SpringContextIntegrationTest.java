package org.sibsankar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sibsankar.spring.cloud.ribbon.client.ServerLocationApp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServerLocationApp.class)
public class SpringContextIntegrationTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
