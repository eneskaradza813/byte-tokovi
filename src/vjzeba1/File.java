package vjzeba1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {

    public static void main(String[] args) {
        
        String myText = "Hello world";
        try(FileInputStream fs = new FileInputStream("myFile.txt");){
            int content = fs.read();
            while(content != -1){
                
                content = fs.read();
            }
        }
        catch(IOException exc){
            System.out.println(exc);
        }
        
    }
    
}
