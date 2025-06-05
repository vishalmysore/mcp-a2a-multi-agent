package example.library.server;

import com.t4a.annotations.Action;
import com.t4a.annotations.Agent;
import com.t4a.detect.ActionCallback;
import com.t4a.processor.AIProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Agent(groupName = "libraryOperations", groupDescription = "Manage library operations like holding books and getting books")
@Slf4j
public class LibraryService {

    /**
     * Each action has access to AIProcessor and ActionCallback which are autowired by tools4ai
     */
    private ActionCallback callback;

    /**
     * Each action has access to AIProcessor and ActionCallback which are autowired by tools4ai
     */
    private AIProcessor processor;

    public LibraryService() {
        log.info("Created Library Service");
    }

    @Action(description = "Hold a book for a user")
    public String holdBook(String bookName, String userName) {
        log.info("Holding book '{}' for user '{}'", bookName, userName);
        return String.format("Book '%s' has been held for user '%s'", bookName, userName);
    }

    @Action(description = "Get a book's availability status")
    public String getBookStatus(String bookName) {
        log.info("Checking availability for book '{}'", bookName);
        // Simulate book availability check
        if ("Effective Java".equalsIgnoreCase(bookName)) {
            return "Available";
        } else if ("Clean Code".equalsIgnoreCase(bookName)) {
            return "Checked out";
        } else {
            return "Not in catalog";
        }
    }

    @Action(description = "Get a list of books in the library")
    public String getBookList() {
        log.info("Fetching list of books");
        return "Available books: Effective Java, Clean Code, Design Patterns";
    }

    @Action(description = "Return a book to the library")
    public String returnBook(String bookName, String userName) {
        log.info("Returning book '{}' from user '{}'", bookName, userName);
        return String.format("Book '%s' has been returned by user '%s'", bookName, userName);
    }
}
