package helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import model.*;
import org.json.JSONObject;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    public APIGatewayProxyResponseEvent handleRequest(final APIGatewayProxyRequestEvent input, final Context context) {
        // get taskType, inputValue parameters from query string
        Map<String, String> inputParams = input.getQueryStringParameters();
        String taskType = inputParams.get("taskType");
        int inputValue = Integer.parseInt(inputParams.get("inputValue"));
        // create context and choose strategy according to the task type
        model.Context strategyContext = new model.Context();
        Action action = Action.valueOf(taskType);
        if (action == Action.factorial) {
            strategyContext.setStrategy(new FactorialStrategy());
        }
        if (action == Action.fibonacci) {
            strategyContext.setStrategy(new FibonacciStrategy());
        }
        if (action == Action.prime) {
            strategyContext.setStrategy(new PrimeNumberStrategy());
        }
        // use the strategy to perform the task
        String taskResult = strategyContext.execute(inputValue);
        // setup response
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");
        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent()
                .withHeaders(headers);
        JSONObject json = new JSONObject();
        json.put("result", taskResult);
        return response.withStatusCode(200).withBody(json.toString());
    }

}
