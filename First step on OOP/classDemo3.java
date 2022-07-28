
/**
 * STEP 1
 */
class Student {

  int studentId;
  String studentName;
}


 class classDemo3 {
    public static void main(String[] args) {
      
      /**
 * STEP 2
 */
  Student s1 = new Student();
  Student s2 = new Student();
  Student s3 = new Student();


  /**
 * STEP 3
 */

 s1.studentId =1;
 s1.studentName="Peter";

 s2.studentId =1;
 s2.studentName="Tom";

 s3.studentId =1;
 s3.studentName="Sam";
 
 /**
 * STEP 4 to avoid repetition lets create an array and store all students object in it
 */
//  System.out.println(s1.studentId);
//  System.out.println(s1.studentName);
//  System.out.println(s2.studentId);
//  System.out.println(s2.studentName);
//  System.out.println(s3.studentId);
//  System.out.println(s3.studentName);

Student [] students = {s1,s2,s3};

      int index = 0;

      while(index<3){
        System.out.println(students[index].studentId);
        System.out.println(students[index].studentName);
        
        index++;
      }
  }  
}

