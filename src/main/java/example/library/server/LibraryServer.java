package example.library.server;


import io.github.vishalmysore.tools4ai.EnableAgent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
// run this pgm with -Dtools4ai.properties.path=tools4ai_library.properties
@SpringBootApplication
@EnableAgent
@PropertySource("classpath:application-library.properties")
public class LibraryServer {

    public static void main(String[] args) {
        SpringApplication.run(LibraryServer.class, args);
    }

}
