import java.io.*;

/**
*
*   Cat class asks the user for the name of a file
*   then reads the contents of that file
*
*/

public class Cat {
    
    public static void main(String[] args) {
        Cat ct = new Cat();
        
        ct.showContents();
    }
    
    /**
    *
    *   showContents() method prints the contents of a File
    *
    *   uses a BufferedReader to readLine() from the file provided by the user
    *
    *   @throws FileNotFoundException if the file does not exist or is a directory file
    *   @throws IOException if an IOException is caught
    *
    */
    
    private void showContents () {
        File file = createFile();
        BufferedReader in = null;
        
        try {
            in = new BufferedReader(new FileReader(file));
            
            String line;
            
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file + " Does not exist.");
        }   catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeReader(in);
        }
    }
    
    /**
    *
    *   closeReader() method attempts to close a Reader Object
    *   tests if the parameter reader is not null
    *   calls the .close() method on the reader
    *   catches an IOException if the reader is null.
    *
    *   @param the Reader Object to be closed
    *
    */
    private void closeReader(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
                ex.printStackTrace();
        }
    }
    
    /**
    *
    *   createFile() method returns a File
    *   the file name is provided by the getName() method
    *
    *   @return the File Object created with the user's input.
    *
    */
    private File createFile() {
        return new File(getName());
    }
    
    /**
    *
    *   getName() method asks the user for the name of the File they want to read
    *
    *   @return the String of the user's input read from the console
    *
    */
    private String getName() {
        System.out.print("Enter a name for the File you want to read > ");
        String name = System.console().readLine();
        return name;
    }
}