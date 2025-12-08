import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonManipulationWithFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        JsonParser jsonparser=new JsonParser();
        JsonObject obj= (JsonObject) jsonparser.parse(new FileReader("./File/src/main/resources/emp.json"));
        //read from normal json format
        String emp_name= String.valueOf(obj.get("name"));
        System.out.println(emp_name);
        //read from nested json-format
        JsonObject add_obj=obj.getAsJsonObject("address");
        String city1= String.valueOf(add_obj.get("city"));
        System.out.println(city1);
    }
}
