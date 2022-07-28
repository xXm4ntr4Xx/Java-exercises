import java.util.ArrayList;

public class ArrayListDemo {

  public static void main(String[]args){
    //void-> not return a value
    //main->entry/exit point(with no-main the compiler will run normally with no output but the jvm will throw an error bacuase cannot find a main method )
    Employee e1 = new Employee();//?
    Employee e2 = new Employee(1,"tim");
    Employee e3 = new Employee(2,"steve");
    //empty angle brackets are called ad "Type Inference Diamond(the empty less/greater sign)"
    //Type-inferance diamond always written on the righ-han side
    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);
    //enhanced for loop
    for(Employee emp:employees){
      System.out.println(emp);
    }
    System.out.println(employees);


    //fetch and object from a collection/arraylist
    System.out.println(employees.get(0));
    //remove an object from arraylist
    System.out.println(employees.remove(0));
    // add again a new object at a specified index
    employees.add(0,e1);
    //set a new name for the e1 object
    e1.setEmployeeName("New employee");
    System.out.println(employees);
  }
}
