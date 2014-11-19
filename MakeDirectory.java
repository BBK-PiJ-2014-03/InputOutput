import java.io.*;


/**
*
*   MakeDirectory class creates a new directory
*   with a name supplied by the user
*
*/


public class MakeDirectory {
    
    public static void main(String[] args) {
        MakeDirectory md = new MakeDirectory();
        
        md.createFile().mkdir();
    }
    
    /**
    *
    *   returns a new file
    *   with the string returned by the getName() method
    *
    *   @Return a new File with the users file name
    *
    */
    
    private File createFile() {
        File file = new File(getName());
        return file;
    }
    
    
    private String getName() {
        System.out.print("Enter a name for the directory you want to create > ");
        String name = System.console().readLine();
        return name;
    }
    
}