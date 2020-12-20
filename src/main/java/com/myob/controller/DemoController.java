package com.myob.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.myob.custom.Message;

@RestController
public class DemoController {
	
	@GetMapping("/")
    public String rootMessage() {
		return "Hello World!";
    }

	@GetMapping("/random")
    public Message sayHello(@RequestParam(required = true) String message) {
		Message messageObj = new Message();
		messageObj.setMessage(message.isEmpty() ? rootMessage() : message);
		return messageObj;
    }
	
	@GetMapping("/health")
    public void verifyHealth(HttpServletResponse response) throws IOException {
		response.sendRedirect("actuator/health");
    }
	
}
