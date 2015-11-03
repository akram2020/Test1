
/**
 * Write a description of class writeBinary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;

class WriteToFileBinary
 {
  public static void main(String args[])
   {
    WriteToFileBinary wtfb = new WriteToFileBinary();
    wtfb.writeToFileBinary();
   }
   public void writeToFileBinary()
    {
     String[] str = { "Name:Muhammad Akram bin Ahmad" , "Matrix No:2014873252" , "Gender:Male" , "Age:24" , "E-mails:akram_ahmad2020@yahoo.com" , "Mobile No:017-5209042" };
    
     
     FileOutputStream fos = null;
     BufferedOutputStream bos = null;
     DataOutputStream dos = null;
     try 
      {
       fos = new FileOutputStream("C:/Users/Acer/Documents/ITT786/akram.bin");
       bos = new BufferedOutputStream(fos);
       dos = new DataOutputStream(bos);
       for (int i = 0; i < str.length; i ++)
        {
         dos.writeUTF(str[i]);
        }
    dos.close();
      }
      catch(Exception e)
       {
        System.out.println(e);
       }          
     }
  }