
/**
 * STEP 1
 */
class Student {

  int studentId;
  String studentName;
}


 class classDemo2 {
    public static void main(String[] args) {
      
      /**
 * STEP 2
 */
  Student s1 = new Student();
  Student s2 = new Student();
  Student s3 = new Student();


  /**
 * STEP 3s
 */

 s1.studentId =1;
 s1.studentName="Peter";

 s2.studentId =1;
 s2.studentName="Tom";

 s3.studentId =1;
 s3.studentName="Sam";
 
 System.out.println(s1.studentId);
 System.out.println(s1.studentName);
 System.out.println(s2.studentId);
 System.out.println(s2.studentName);
 System.out.println(s3.studentId);
 System.out.println(s3.studentName);
  }  
}

