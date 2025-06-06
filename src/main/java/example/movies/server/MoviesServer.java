package example.movies.server;


import example.library.server.LibraryServer;
import io.github.vishalmysore.tools4ai.EnableAgent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * run this program with the following properties or specify this ins applicaiton-movies.properties
 * -Dtools4ai.properties.path=tools4ai_movies.properties
 */
@SpringBootApplication
@EnableAgent
@PropertySource("classpath:application-movies.properties")
public class MoviesServer {

    public static void main(String[] args) {

        SpringApplication.run(MoviesServer.class, args);
    }
}


