
/**
 * Name : Muhammad Akram Bin Ahmad
 * Matric: 2014873252
 * Course Code: ITT786
 * DESCRIPTION: Read ".bin" type data.
 */
import java.io.*;

public class readBinary
{
   public static void main(String args[])
    {
        
        // filename : just use if the file not exist/create.
        String filename = "akram.bin";
        
        try {
            // this line for reading the data in binary.
            byte[] buffer = new byte[1000];

            //change the location of binary file. this is my location in my laptop
            //after i'm write the binary data that relate with my first task.
            FileInputStream file = 
                new FileInputStream("C:/Users/Acer/Documents/ITT786/akram.bin");

            DataInputStream input = new DataInputStream(file);
        
            BufferedReader buf = new BufferedReader(new InputStreamReader(input));        
            
            
            int total = 0;
            int nRead = 0;
            while((nRead = file.read(buffer)) != -1) {
                // this line use to convert binary to String. So, we can display 
                // the binary data in the text form.
                
                FileInputStream fis = new FileInputStream("C:/Users/Acer/Documents/ITT786/akram.bin");
      
                              System.out.println(new String(buffer));
                total += nRead;
            }   

            
            file.close();        

           
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                filename + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + filename + "'");                  
           
        }
        
        
   }
}