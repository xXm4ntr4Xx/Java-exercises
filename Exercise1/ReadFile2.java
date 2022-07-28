import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class CreateFile{
  public static void main(String[]s){
    FileInputStream is; //FileInputStream-> read(sequential) input byte from a file
    BufferedReader br=null;//BufferReader read text from a characters-input stream
    try{
      //create a file in write mode
      is = new FileInputStream("newfile.txt");
      //bridge class wich can help a character
      InputStreamReader isr = new InputStreamReader(is);
      br = new BufferedReader(isr);

      String line;

      while((line =br.readLine()) !=null){//-1 indicates EOF()end of file
        System.out.print(line);
      }
      //write some content in the file.txt
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}