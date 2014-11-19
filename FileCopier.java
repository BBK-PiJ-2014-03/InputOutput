import java.io.*;

public class FileCopier {
    
    
    private void copier() {
        String[] fileNames = getNames();
        
        File file1 = new File(fileNames[0]);
        File file2 = new File(fileNames[1]);
        
        BufferedReader in;
        PrintWriter out;
        
        try {
            String str;
            in = new BufferedReader(new FileReader(file1));
            out = new PrintWriter(file2);
            String line;
            if (file1.exists()) {
                if (file2.exists()) {
                    System.out.println("Would you like to override the contents of " + file2);
                    str = System.console().readLine();
                }
                if (str.equalsIgnoreCase("yes") || !file2.exists()) {
                    while ((line = in.readLine()) != null) {
                        out.write(line);
                    }
                }
            }
             
    /**
    *
    *   getNames() method asks the user for two file names
    *   stores the user's names in a String[]
    *
    *   @return returns the String[] containing the user's input
    *
    */
    
    private String[] getNames() {
        String[] nameArray = new String[2];

        System.out.print("Enter a name for the File you want to copy > ");
        nameArray[0] = System.console().readLine();

        System.out.print("Enter a name for the File you want to copy to > ");
        nameArray[1] = System.console().readLine();

        return nameArray;
    }
}