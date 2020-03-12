package mts_rest.date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Collections;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DateServiceApplication {
    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(DateServiceApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8084"));
        app.run(args);
    }
}