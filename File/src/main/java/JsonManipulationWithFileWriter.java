import com.google.gson.JsonObject;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonManipulationWithFileWriter {
    public static void main(String[] args) throws IOException {
        JSONObject json = new JSONObject();
        json.put("name", "Moontaser");
        json.put("age", 22);
        json.put("country", "Bangladesh");

        JSONObject address = new JSONObject();      // use JSONObject instead of JsonObject
        address.put("city", "Dhaka");
        address.put("zip", 1207);
        json.put("address", address);
        FileWriter fw=new FileWriter("./File/src/main/resources/emp.json");
        fw.write(json.toString());
        fw.flush();
        fw.close();

    }
}
