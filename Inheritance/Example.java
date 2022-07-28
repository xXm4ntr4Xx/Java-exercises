 class Manager extends Employee{
  private String teamName;

  public Manager(int employeeId,String employeeName,String teamName){
    super(employeeId,employeeName);     //####call the parameters on Employee superclass
    this.teamName=teamName;
  }


  //setter method

  public void setTeamName(String teamName){
    this.teamName=teamName;
  }

  public void setEmployeeId(int employeedId){
    super.setEmployeeId(employeedId);
  }

  public void setEmployeeName(String employeedName){
    super.setEmployeeName(employeedName);
  }


//getter method


public String getEmployeeDetails(){
  System.out.println(super.employeeId + " "+super.employeeName+ " "+this.teamName);
    return super.employeeId + " "+super.employeeName+ " "+this.teamName;
}

}


public class Example{
  public static void main(String[]args){
    Manager mg = new Manager(1,"Tom","Ferrari");
    mg.getEmployeeDetails();
  }
}