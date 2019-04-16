
package finalproject;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileInteraction{
    public void writeFile(){
        try{
            File f = new File("doc.txt");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            Scanner in = new Scanner(raf);
        }catch(IOException e){
            
        }
    }
    public void loadFile(){
        try{
            File f = new File("doc.txt");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            Scanner in = new Scanner(raf);
            in.useDelimiter(": ");
            in.useDelimiter(", Created by ");
            in.useDelimiter(" | ");
            in.useDelimiter(" Season(s) | ");
            in.useDelimiter(".0 Rating");
            String type = String.valueOf(raf.readString());
            in.close();
        }catch(IOException e){
            
        }
    }
}
