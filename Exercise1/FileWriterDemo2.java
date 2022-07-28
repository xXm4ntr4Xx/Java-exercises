import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

//A java code to Create a new file and write some content

public class FileWriterDemo2{
  //throws exception to leave part of source code to others
  // in throw exception we can write multiple exceptions separate by the comma
  public static void main(String[]s)throws IOException,FileSystemNotFoundException{
    FileWriter  fw = new FileWriter("newfile.txt");
    fw.write("welcome to character stream classes");
    System.out.println("file created succesfully");
    fw.close();
}
}



//throws exception
// public File Writer(String fileName)throws File{}

// public void write(String data) throws IOException;
