import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// class Employee implements Serializable{
//   private int employeeId;
//   private String employeeName;

//   public Employee(int employeeId,String employeeName){
//     this.employeeId= employeeId;
//     this.employeeName=employeeName;
//   }
//   @Override
//   public String toString(){
//     return ""+this.employeeId+" "+ this.employeeName;
//   }
// }

/*
What is De-Serialization ->
Process of reading objects from a byte stream
*/
public class DeSerialization{
  public static void main(String[]s){
    //create FileInputStream object
    FileInputStream is =null;
    // create on ObjectInputStream by connection FileInputStream
    ObjectInputStream ois=null;
    try{
     is = new FileInputStream("emp_object");
     ois = new ObjectInputStream(is);
     try{
      //Read object from employee class
      Employee e1 = (Employee) ois.readObject();
      System.out.println(e1);
     }catch(ClassNotFoundException cnf){
      System.out.println(cnf);
     }
  System.out.println("object has been Deserialized");
    }catch(FileNotFoundException fnf){
      System.out.println(fnf);
    }catch(IOException ioe){
      System.out.println(ioe);
    } 
  }
}
