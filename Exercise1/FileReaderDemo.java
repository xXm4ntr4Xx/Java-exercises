import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//A java code to Read some content from an existing file

public class FileReaderDemo{
  public static void main(String[]s) {
    FileReader fr = null; //FileReader read streams of characters from the file
    BufferedReader br = null;//BufferReader read text from a characters-input stream
    
    try{
        fr = new FileReader("newfile.txt");
        br =new BufferedReader(fr);
        String line;

	      try {
          //readLine->read a single line of text from the console
          while((line = br.readLine()) != null) {
            System.out.println(line);
}
        } catch (IOException e) {
          //printStackTrace is a tool used to handle exceptions and errors
          e.printStackTrace();
        }
    }catch(FileNotFoundException e){
      System.out.println(e);
    }finally{
      try{
      fr.close();
      br.close();
      }catch(IOException e){
        System.out.println(e);
      }
    }
  }
}

//use FileInputStream if you want to read byte