// Byte Stream classes and their hierarchy
// =======================================
//           Abstract
//           /       \
// InputStream      OutputStream
//       /                  \
// The below classes are called as "Concrete classes"  
//   FileInputStream       FileOutputStream
//   DataInputStream       DataOutputStream
//   ObjectInputStream     ObjectOutputStream
// ===========================================
// example:
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// -What is a stream?
// A flow of data(sequence of bytes)

// -What is an Input stream
// data coming/receiving from an input device
// It is mainly use for READ data

// -What is an Output stream
// data going/sending from the Programme
// it is mainly used for WRITE data


  public class OutputStreamDemo{
    public static void main(String[]s)throws IOException{
      FileOutputStream os = null;
      try{
        //create a file in write mode
        os = new FileOutputStream("file.txt",true);//with the true we can  append text multiple times(append mode)
        //write some content in the file.txt
        os.write("welcome to file handling\n".getBytes());//write and convert the string in bytes
        //***catch is a special block is not a method
      }catch(FileNotFoundException e){
        System.out.println(e);
      }catch(IOException e){
        System.out.println(e);
      }finally{
        os.close();
      }

    }
  }

