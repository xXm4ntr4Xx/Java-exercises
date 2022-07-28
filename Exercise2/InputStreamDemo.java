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
import java.io.FileInputStream;
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
  public class InputStreamDemo{
    public static void main(String[]s)throws IOException{
      FileInputStream is = null;
      byte[] array = new byte[100];

      try{
         is = new FileInputStream("file.txt");
         System.out.println("Available bytes in the file: " + is.available());
        is.read(array);
        System.out.println("Data read from the file: ");
        // Convert byte array into string
        String data = new String(array);
        System.out.println(data);
        //***catch is a special block is not a method
      }catch(FileNotFoundException e){
        System.out.println(e);
      }finally{
        is.close();
      }

    }
  }
// -What is a stream?
// A flow of data(sequence of bytes)

// -What is an Input stream
// data coming/receiving from an input device
// It is mainly use for READ data

// -What is an Output stream
// data going/sending from the Programme
// it is mainly used for WRITE data
