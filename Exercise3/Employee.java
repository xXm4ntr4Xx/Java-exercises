public class Employee{
  private int employeeId;
  private String employeeName;
  //if a class has NO constructor the compiler will create a deafult constructor with no params
//empty default-constructor must be initialized. Without contructor object creation is impossible
  public Employee(){
    this.employeeId = 1;
    this.employeeName = "kishore";
  }
//second constructor
  public Employee(int employeeId,String employeeName){
    this.employeeId=employeeId;
    this.employeeName=employeeName;
  }
  //setter method
  public void setEmployeeId(int employeeId){
    this.employeeId=employeeId;
  }
  public void setEmployeeName(String employeeName){
    this.employeeName=employeeName;
  }
  //getter method
  public int getEmployeeId(){
    return this.employeeId;
  }

  public String getNEmployeeName(){
    return this.employeeName;
  }
  //Annotation
  @Override
  public String toString(){
    return this.employeeName + " " + this.employeeId;
  }

}