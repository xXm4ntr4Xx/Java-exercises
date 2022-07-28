
class Student{
  private int studentId;
  private String studentName;


public Student(int studentId,String studentName){
  this.studentId=studentId;
  this.studentName=studentName;
}


// Getter method

public int getStudentId(){
  return this.studentId;
}

public String getStudentName(){
  return this.studentName;
}
}

class ConstructorDemo{
  public static void main(String []args) {
    
    Student s1 =  new Student(1,"paul");
    Student s2 =  new Student(2,"terry");
    Student s3 =  new Student(3,"claire");
    Student s4 =  new Student(4,"scott");
    Student s5 =  new Student(5,"tiffany");



    Student[] students = {s1,s2,s3,s4,s5};

    for (Student std : students) {
      System.out.println("   ");
      System.out.println(std.getStudentId());
      System.out.println(std.getStudentName());
      System.out.println("   ");
      
    }
  }
}