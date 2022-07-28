import java.util.TreeSet;

public class TreeSetDemo{
public static void main(String[]args){
  // Declare the variable using the interface of the object for flexibility.
// Non-primative data types only.
TreeSet<String> movies = new TreeSet<>();
// TreeSet will be sorted by element.
// Work with any comparable object.
movies.add("The Shining");
movies.add("Dawn of the Dead");
movies.add("Zombieland");
movies.add("A men");

System.out.println(movies);
}
}