
class Student{
  int id;
  String name;
}



class Practice{
  public static void main(String []args) {
    
    Student s1 =  new Student();
    Student s2 =  new Student();
    Student s3 =  new Student();
    Student s4 =  new Student();
    Student s5 =  new Student();


    s1.id = 1;
    s1.name="tom";

    s2.id = 2;
    s2.name="sam";

    s3.id = 3;
    s3.name="claire";

    s4.id = 4;
    s4.name="emily";

    s5.id = 5;
    s5.name="sara";

    Student[] students = {s1,s2,s3,s4,s5};

    for (Student std : students) {
      System.out.println(std.name);
    }
  }
}