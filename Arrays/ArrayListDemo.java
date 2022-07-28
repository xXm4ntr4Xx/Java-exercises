import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
  public static void main(String[]args) {
    ArrayList <Integer>list = new ArrayList<Integer>();
    System.out.println("size before elements:  "+list.size());//0

    //lets add 3 items/objects

    list.add(100);
    list.add(200);
    list.add(300);
    System.out.println("size  after adding 3 elements:  "+list.size());//3

  // display all items of ArrayList
  System.out.println(list);
  //display all items using enhanced for loop
  for(Integer value : list){ //****this is bad code because we neend to have an ArrayList with specific type 
    System.out.println("forloop:   "+value );
  }
/*ITERATOR*/
  Iterator <Integer>it = list.iterator();
  while(it.hasNext()){//return true if there is a next item
    int value = it.next();// returns the next available value,use typecasting to return integer value
    System.out.println("iterator:   "+value);
  }
}
}