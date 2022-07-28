import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
-What is an Output stream
data going from the Programme
it is mainly used for WRITE data
*/

public class CreateFileDemo{
  public static void main(String[]s){
    FileOutputStream os=null;//initialize the variable
    try{
      //create a file in write mode
       os= new FileOutputStream("file.txt",true);//with the true we enter in append text multiple time(append mode)
      //write some content in the file.txt
      os.write("welcome to file handling".getBytes());//write and convert the string in bytes
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}

