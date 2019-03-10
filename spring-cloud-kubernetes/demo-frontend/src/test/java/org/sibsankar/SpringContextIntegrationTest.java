package org.sibsankar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sibsankar.spring.cloud.kubernetes.frontend.KubernetesFrontendApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = KubernetesFrontendApplication.class)
public class SpringContextIntegrationTest {

	@Test
	public void contextLoads() {
	}

}
