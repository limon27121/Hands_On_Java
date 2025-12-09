import com.google.gson.*;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonArrayManipulation {

    public static void WriteJsonArray() throws IOException {

        String FilePath="./File/src/main/resources/employess.json";
        //for file read
        JsonParser jsonparser=new JsonParser();
        JsonArray obj= (jsonparser.parse(new FileReader(FilePath))).getAsJsonArray();

        //Create Json obj
        JsonObject newEmployee = new JsonObject();
        newEmployee.addProperty("name", "Kabbo");
        newEmployee.addProperty("age", 24);
        newEmployee.addProperty("country", "Bangladesh");

        //added the object to json array
        obj.add(newEmployee);

        //write the json array to file
        FileWriter fw=new FileWriter(FilePath);
        fw.write(obj.toString());
        fw.flush();
        fw.close();

    }


    public static void ReadJsonArray() throws FileNotFoundException {
        String FilePath="./File/src/main/resources/employess.json";
        //for file read
        JsonParser jsonparser=new JsonParser();
        JsonArray obj= (jsonparser.parse(new FileReader(FilePath))).getAsJsonArray();
        //convert to json_object
        JsonObject emp_obj= obj.get(0).getAsJsonObject();
        String name= String.valueOf(emp_obj.get("name"));
        System.out.println(name);

    }


    public static void SearchJsonArray(String name) throws FileNotFoundException {
        String FilePath="./File/src/main/resources/employess.json";
        //for file read
        JsonParser jsonparser=new JsonParser();
        JsonArray emp_array= (jsonparser.parse(new FileReader(FilePath))).getAsJsonArray();
        for (Object obj:emp_array){
            JsonObject json= (JsonObject) obj;
            String names=json.get("name").getAsString();
           if (names.equals(name)){
               System.out.println("found");
               System.out.println(json);
               return;
           }
        }

    }

    public static void UpdateJsonArray(String name) throws IOException {
        String FilePath="./File/src/main/resources/employess.json";
        //for file read
        JsonParser jsonparser=new JsonParser();
        JsonArray emp_array= (jsonparser.parse(new FileReader(FilePath))).getAsJsonArray();
        for (Object obj:emp_array){
            JsonObject json= (JsonObject) obj;
            String names=json.get("name").getAsString();
            if (names.equals(name)){
                System.out.println("found");
                json.addProperty("age", 27);
                System.out.println(json);
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                FileWriter fw = new FileWriter(FilePath);
                fw.write(gson.toJson(emp_array));   // <-- Writes updated array
                fw.close();
                System.out.println("Updated Successfully ✔");
                return;
            }
        }

    }

    public static void DeleteJsonArray(String name) throws IOException {
        String FilePath="./File/src/main/resources/employess.json";

        // Read file
        JsonParser jsonparser = new JsonParser();
        JsonArray emp_array = (jsonparser.parse(new FileReader(FilePath))).getAsJsonArray();

        for (int i = 0; i < emp_array.size(); i++) {
            JsonObject json = emp_array.get(i).getAsJsonObject();
            String names = json.get("name").getAsString();

            if (names.equals(name)) {
                System.out.println("found and deleted -> " + json);

                emp_array.remove(i);   // <-- DELETE OBJECT HERE ✔

                // Write back to file (Pretty JSON same as your update code)
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                FileWriter fw = new FileWriter(FilePath);
                fw.write(gson.toJson(emp_array));
                fw.close();

                System.out.println("Deleted Successfully ✔");
                return;
            }
        }

        System.out.println("Name Not Found ❌");
    }





    public static void main(String[] args) throws IOException {
//        WriteJsonArray();
//          ReadJsonArray();
//        SearchJsonArray("MASUD");
        UpdateJsonArray("Masud");
//        DeleteJsonArray("Masud");


    }

}
