import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.testng.annotations.Test;

import java.util.Map;

public class SimpleTest {

    @Test
 public void simpleTestFunction(){
        System.out.println("Hello World");
        Map<String, Object> environments = JsonManager.getJsonObjectFromFile("src/main/resources/environment.json");
        environments.entrySet().forEach(env->{
            System.out.println(env.getKey());
        });

 }
}
