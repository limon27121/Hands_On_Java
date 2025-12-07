import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("./File/src/main/resources/Test.txt",true);
        fw.write("\nhello world");
        fw.close();

    }
}
