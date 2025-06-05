package example.client;

import io.github.vishalmysore.common.AgentInfo;
import io.github.vishalmysore.mcp.client.MCPAgent;
import io.github.vishalmysore.mcp.domain.CallToolResult;
import lombok.extern.java.Log;
/**
 * run this program with the following properties:
 * -Dtools4ai.properties.path=tools4ai_movies.properties
 */
@Log
public class MCPClient {
    public static void main(String[] args) {

        MCPAgent mcpAgent = new MCPAgent();
        mcpAgent.connect("http://localhost:7861/");
        AgentInfo mcpCard = mcpAgent.getInfo();
        log.info("Connected to MCP server: " + mcpCard);


        CallToolResult result = (CallToolResult) mcpAgent.remoteMethodCall("what did gabbar say in movie sholay");
        log.info("Tool call result: " + result);
    }
}
