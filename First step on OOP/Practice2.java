class Customer{
  byte id;
  String name;
  byte age;
}


class Practice2{
  public static void main(String [] args){
    
    Customer c1 = new Customer();
    Customer c2 = new Customer();
    Customer c3 = new Customer();
    Customer c4 = new Customer();



    c1.id=1;
    c1.name="nik";
    c1.age = 25;

    c2.id=2;
    c2.name="sam";
    c2.age = 20;

    c3.id=3;
    c3.name="luk";
    c3.age = 29;


    c4.id=4;
    c4.name="via";
    c4.age = 27;



    Customer[] customers ={c1,c2,c3,c4};


    for (Customer customer : customers){
      System.out.println(customer.name);
      System.out.println(customer.age);
    }
  }
}