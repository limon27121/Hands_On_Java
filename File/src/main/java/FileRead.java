import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./File/src/main/resources/Test.txt");
        int characters;
        while ((characters = fr.read()) != -1) {
            System.out.print((char) characters);
        }
        fr.close();

    }
}
