package restapicountriesexample.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Zenildo Nhabomba
 * @contact 844642763 || 864642777
 * @email nhabomba.zenildo@gmail.com
 */
@SpringBootApplication
public class RestApiCountriesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiCountriesExampleApplication.class, args);
	}
	
    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder
    		application) {
        return application.sources(RestApiCountriesExampleApplication.class);
    }

}


