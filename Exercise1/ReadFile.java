import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
InputStream , represents an ordered stream of bytes. In other words, you can read data from a Java InputStream as an ordered sequence of bytes.*/ 
class ReadFile{
  public static void main(String[]s){
    FileInputStream is=null;//FileInputStream-> read(sequential) input byte from a file
    try{
      //Read a file
       is = new FileInputStream("newfile.txt");

      int i=0;
      while((i=is.read()) !=-1){//-1 indicates EOF
        System.out.print((char)i);//typecasting->convert a variable of one data type to another
      }
      //write some content in the file.txt
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}

