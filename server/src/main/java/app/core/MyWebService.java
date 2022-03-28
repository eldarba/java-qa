package app.core;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyWebService {
	
	// http://10.103.50.14:8080/greet
	// http://localhost:8080/greet
	@GetMapping("/greet")
	public String greet() {
		return "Hello from server: " + new Date();
	}
	
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

}
