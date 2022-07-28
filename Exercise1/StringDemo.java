public class StringDemo {
  public static void main(String[]args){
    String s1 = "hello";
     s1.toUpperCase();//****will not change teh existing veriable
      //s1 =s1.toUpperCase();**** Will change the value
    String newString = s1.toUpperCase();//will create a new variable to store the s1 updated
    System.out.println(newString+" "+s1);


    /*
    Object created using String literal is strored in SPring Pool for future use
    If a string literal is reapeted multiple times then programming system searchs for any existing string literal (in String Pool) that matches the new one and uses same object


     * String s1="hello";
     * String s2="hello";
     * 
     * s1==s2 //true
     * 
     * String s3="hello";
     * String s4= new String("hello");
     * s3==s4//false
     */
  }
}
