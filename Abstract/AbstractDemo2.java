abstract class Animal {
  public abstract void sound();
}

class Dog extends Animal{
  public void sound(){
    System.out.println("woof");
  }
}

class Cat extends Animal{
  public void sound(){
    System.out.println("meow");
  }
}

//  MAIN CLASS
class AbstractDemo2{
  public static void main(String[]args){
    Dog d1 = new Dog();
    Cat c1 = new Cat();
    d1.sound();
    c1.sound();


// a super class reference can refer to all of its subclass objects
    Animal ref= new Dog();
    ref.sound();//woof

    ref = new Cat();
    ref.sound();//meow

  }


// *polimorphism
// --------------redundant
public static void soundLikeDog(Dog d){
  d.sound();
}


public static void soundLikeCat(Cat c){
  c.sound();
}
// ----------------

public static void soundLikeAnimal(Animal a){
  a.sound();
}
}
