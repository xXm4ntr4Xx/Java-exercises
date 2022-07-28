import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//A java code to Create a new file and write some content

public class FileWriterDemo{
  public static void main(String[]s) {
    FileWriter fw = null;
    try{
        fw = new FileWriter("newfile.txt");
        fw.write("welcome to character stream classes");
        System.out.println("file created succesfully");
        fw.close();
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException io){
      System.out.println(io);
    }finally{
      try{
      fw.close();
      }catch(IOException e){
        System.out.println(e);
      }
    }
  }
}





//throws exception
// public File Writer(String fileName)throws File{}

// public void write(String data) throws IOException;
