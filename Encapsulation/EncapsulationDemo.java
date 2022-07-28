
class Student{
  private int studentId;
  private String studentName;


//Setter method;
public void setStudentId(int studentId){
  this.studentId = studentId;
}

public void setStudentName(String studentName){
  this.studentName = studentName;
}


// Getter method

public int getStudentId(){
  return this.studentId;
}

public String getStudentName(){
  return this.studentName;
}
}

class EncapsulationDemo{
  public static void main(String []args) {
    
    Student s1 =  new Student();
    Student s2 =  new Student();
    Student s3 =  new Student();
    Student s4 =  new Student();
    Student s5 =  new Student();


    s1.setStudentId(1);
    s1.setStudentName("tom");

    s2.setStudentId(2);;
    s2.setStudentName("sam");

    s3.setStudentId(3);;
    s3.setStudentName("claire");

    s4.setStudentId(4);;
    s4.setStudentName("emily");

    s5.setStudentId(5);;
    s5.setStudentName("sara");

    Student[] students = {s1,s2,s3,s4,s5};

    for (Student std : students) {
      System.out.println("   ");
      System.out.println(std.getStudentId());
      System.out.println(std.getStudentName());
      System.out.println("   ");
      
    }
  }
}