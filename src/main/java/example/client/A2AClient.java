package example.client;

import io.github.vishalmysore.a2a.client.A2AAgent;
import lombok.extern.java.Log;

@Log
public class A2AClient {

    public static void main(String[] args) {
        A2AAgent a2aagent = new A2AAgent();
        a2aagent.connect("http://localhost:7862/");
        Object task = a2aagent.remoteMethodCall("get me list of books");
        log.info("Task result: " + task);
    }
}
