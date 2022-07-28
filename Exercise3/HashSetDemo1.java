import java.util.HashSet;// UNIQUE -ONORDER


class HashSetDemo1{
  public static void main(String[]s) {
    HashSet<String> names =new HashSet<>();

    names.add("steve");
    names.add("austin");
    names.add("peter");
    names.add("a");
    names.add("b");
    names.add("c");
    names.add("z");


    System.out.println(names);
  }
}
