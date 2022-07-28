
// An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions. 
//(1)(String[]args) is a parameter that take command line argument
// 
public class ExceptionDemo {
  public static void main(String[]s){
    try{
      System.out.println(10/0);
    }catch(ArithmeticException ae){//ae is reference variable of ArithmeticException type
      System.out.println("ArithmeticException is caught due to divide by ZERO");
    }
    System.out.println("Continue ......");
  }
}
