import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
Serialization->
Process of writing/converting an object into a byte stream 
Process of storing class object into a byte stream
*/
// Serializable a built in interface
class Employee implements Serializable{//
  private int employeeId;
  private String employeeName;
  private transient String pwd;
//Transient-> is used to mark the member variable not to be serialized when it is persisted to streams of bytes.
  public Employee(int employeeId,String employeeName,String pwd){
    this.employeeId= employeeId;
    this.employeeName=employeeName;
    this.pwd=pwd;
  }
  @Override
  public String toString(){
    return ""+this.employeeId+" "+ this.employeeName;
  }
}

class Serialization{
  public static void main(String[]s){
    //create FileOutputStream object
    FileOutputStream os =null;
    // create on ObjectOutputStream by connecting the FileOutputStream
    ObjectOutputStream oos=null;
    try{
     os = new FileOutputStream("emp_object");
     oos = new ObjectOutputStream(os);
//create an object from employee class
    Employee e1 = new Employee(1,"tom","1234");
//write employee object to byte stream using writeObject()
  oos.writeObject(e1);
  System.out.println("object has been serialized");
    }catch(FileNotFoundException fnf){
      System.out.println(fnf);
    }catch(IOException ioe){
      System.out.println(ioe);
    } 
  }
}