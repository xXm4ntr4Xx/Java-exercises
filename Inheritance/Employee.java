public class Employee{
  protected int employeeId;
  protected String employeeName;

  //write a constructor wich sets values into all above fields

  public Employee(int employeeId,String employeeName){
    this.employeeId = employeeId;
    this.employeeName = employeeName;
  }

  // setter methods

  public void setEmployeeId(int employeeId){
     this.employeeId=employeeId;
  }

  public void setEmployeeName(String employeeName){
    this.employeeName=employeeName;
 }

 public String getEmployeeDetails(){
  return "Id:   "+this.employeeId +"  Name:  "+this.employeeName;
 }
}




