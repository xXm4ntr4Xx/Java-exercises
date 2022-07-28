abstract class Person{
  public abstract void createSpec();
  public abstract void developCode();
  public abstract void testCode();
  public abstract void releaseCode();
  public abstract void maintainCode();
}

//HIERARCHY INHERITANCE
abstract class BA extends Person{
  @Override
  public  void createSpec(){};
}

abstract class Dev extends BA{
  @Override
  public  void developCode(){};
}

abstract class Tester extends Dev{
  @Override
  public  void testCode(){};
}

abstract class DevOps extends Tester{
  @Override
  public  void releaseCode(){};
}
//last method must not be absract so we can connect to the main class and create a new object
class ProdSupp extends DevOps{
  @Override
  public void maintainCode(){};
}

//MAIN CLASS
class AbstractDemo3{
public static void main(String[] args){
  ProdSupp p1 = new ProdSupp();
  System.out.println(p1);
}
}
