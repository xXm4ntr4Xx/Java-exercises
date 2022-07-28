abstract class ElectronicDevice{
  public abstract void turnOn();
  public  void turnOff(){};//is non abstract so we dont need to implement this method on all the sub class
}

class MobilePhone extends ElectronicDevice{
  @Override
  public void turnOn(){}
}

class Tv extends ElectronicDevice{
  @Override
  public void turnOn(){}
}

class Laptop extends ElectronicDevice{
  @Override
  public void turnOn(){}
}