public class ArrayDemo{
  public static void main(String[]args){
    int[] scores ={1,2,3,4};

    String[] name = new String[4];
      name[0] = "alex";
      name[1] = "jon";
      name[2] = "james";
      name[3] = "temi";
      // name[4] = "";//error index out of bound

      System.out.println(scores);
      System.out.println(name[1]);

      
  }
}