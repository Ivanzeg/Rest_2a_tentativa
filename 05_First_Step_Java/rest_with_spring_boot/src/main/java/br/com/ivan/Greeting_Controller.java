package br.com.ivan;



import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting_Controller {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong(); //papel do cara eh mokar um ID

	@RequestMapping("/greeting")
	public Greeting greeting (@RequestParam(value = "name", defaultValue = "World")String name) {
		return new Greeting(counter.incrementAndGet(),String.format(template, name) ); 	 
	}
	
	
	
}
