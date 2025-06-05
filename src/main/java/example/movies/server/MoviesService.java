package example.movies.server;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;
import com.t4a.detect.ActionCallback;
import com.t4a.processor.AIProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Agent(groupName = "movieOperations", groupDescription = "Manage Bollywood movie operations like getting movie lists and famous dialogues")
@Slf4j
public class MoviesService {

    private ActionCallback callback;
    private AIProcessor processor;

    public MoviesService() {
        log.info("Created Movies Service");
    }

    @Action(description = "Get a list of popular Bollywood movies")
    public String getBollywoodMovies() {
        log.info("Fetching Bollywood movies list");
        return "Popular Bollywood Movies: DDLJ, Sholay, Mother India, Mughal-e-Azam, PK";
    }

    @Action(description = "Get movies starring Shah Rukh Khan")
    public String getSRKMovies() {
        log.info("Fetching SRK movies");
        return "SRK Movies: DDLJ, Chennai Express, Pathaan, Chak De India, My Name Is Khan";
    }

    @Action(description = "Get movies starring Amitabh Bachchan")
    public String getAmitabhMovies() {
        log.info("Fetching Amitabh Bachchan movies");
        return "Amitabh Movies: Sholay, Deewar, Zanjeer, Don, Agneepath";
    }

    @Action(description = "Check if a given dialog is from a movie")
    public String checkDialog(String dialog) {
        log.info("Checking dialog: '{}'", dialog);
        if (dialog.contains("Mogambo")) {
            return "This is from Mr. India";
        } else if (dialog.contains("Kitne aadmi the")) {
            return "This is from Sholay";
        } else {
            return "Dialog not recognized";
        }
    }

    @Action(description = "Get famous dialogues by Gabbar Singh")
    public String gabbarSpeaks() {
        log.info("Getting Gabbar's dialogues");
        return "Famous Gabbar dialogues: 'Kitne aadmi the?', 'Jo dar gaya samjho mar gaya', 'Holi kab hai? Kab hai Holi?'";
    }
}