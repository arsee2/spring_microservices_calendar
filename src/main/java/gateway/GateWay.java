package gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class GateWay {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("calendar",r -> r.path("/calendar/date").filters(f -> f.setPath("/date"))
                        .uri("http://localhost:8084/"))

                .route("calendar",r -> r.path("/calendar/time").filters(f -> f.setPath("/time"))
                        .uri("http://localhost:8084/"))

                .route("theme",r -> r.path("/theme")
                        .uri("http://localhost:8083/"))

                .build();
    }
    public static void main(String[] args) {

        SpringApplication.run(GateWay.class, args);
    }
}