import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * lesson2_01
 */
public class lesson2_01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        
        int i = 0;
        int num = 100;
        while (i < num){
            String text = "TEXT\n";
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes);
            i++;
            

        }
        fileOutputStream.close();
    }
    
}