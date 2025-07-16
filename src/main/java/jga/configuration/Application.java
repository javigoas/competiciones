package jga.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"jga.*"})
@OpenAPIDefinition( info = @Info(
        title = "Api para competiciones",
        version = "1.0",
        description = "api gestion torneos y ligas"
))
public class Application {

    public static void main(String [] args) {
        SpringApplication.run(Application.class, args);
    }

}
