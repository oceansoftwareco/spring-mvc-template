package pro.ivanov;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class ApplicationBean {	
	@PostConstruct
	private void initApplication() {
		System.out.print("Init app...");
	}
}
