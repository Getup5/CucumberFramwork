package context;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class TestContext {

    public Response previousResponse;
    public String lastRequestUrl;
    public String lastRequestBody;
    public String lastResponseBody;
    public Integer lastResponseStatusCode;

    private final Map<String, String> dataStore =
            new HashMap<>();


    public void setDataStore(
            String key,
            String value) {

        dataStore.put(key, value);
    }


    public Map<String, String> getDataStore() {
        return dataStore;
    }
}