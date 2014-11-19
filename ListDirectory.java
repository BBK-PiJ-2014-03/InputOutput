import java.util.Arrays;
import java.io.*;

/**
*
*   ListDirectory class prints the files in the current directory
*   using the class' getList() method
*
*/

public class ListDirectory {
    
    public static void main(String[] args) {
        ListDirectory ld = new ListDirectory();
        
        String[] nameArray = ld.getList();
        
        for (String s : nameArray) {
            System.out.println(s);
        }
    }
    
    /**
    *
    *   Creates a new File using System.getProperty("user.dir") as input
    *   which gets the current directory
    *
    *   @Return a String[] of the names of the files
    *
    */
    public String[] getList() {
        File file = new File(System.getProperty("user.dir"));
        
        return file.list();
    }
}