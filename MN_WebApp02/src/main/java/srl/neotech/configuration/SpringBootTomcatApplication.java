package srl.neotech.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import srl.neotech.model.Aereo;
import srl.neotech.model.SingletonAerei;

@SpringBootApplication(scanBasePackages = "srl.neotech")
public class SpringBootTomcatApplication  extends SpringBootServletInitializer{
	  
	public static void main(String[] args) {

        SpringApplication.run(SpringBootTomcatApplication.class, args);
 
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    	
    	
        return builder.sources(SpringBootTomcatApplication.class);
    }
}
