import Core.AppConfig;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class JsonManager {
    private static final String JSON_PATH_ENVIRONMENT = "src/main/resources/environment.json";
    private static final String USERS = "Users";
    private static final String URL = "Url";
    private static final String TEST_RAIL = "TestRail";
    private static final AppConfig APP_CONFIG = AppConfig.getInstance();
private static final Logger logger = Logger.getLogger(JsonManager.class.getName());
    /**
     * Gets the values from a json file.
     *
     * @param jsonFilePath the path where the json path is located.
     * @return a parsed version of json file.
     */
    public static Map<String, Object> getJsonObjectFromFile(final String jsonFilePath) {
        Type jsonType = new TypeToken<Map<String, Object>>() {
        }.getType();
        Map<String, Object> jsonObject = new HashMap<>();
        try {
            return new Gson().fromJson(new FileReader(jsonFilePath), jsonType);
        } catch (FileNotFoundException e) {
        }
        return jsonObject;
    }
}
