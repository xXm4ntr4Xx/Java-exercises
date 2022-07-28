//create a class that describe book
class BookInfo{
  String name;
  String author;
  double price;
}

//create the main class 
class Book{
  public static void main(String[]args){

    //create book object
    BookInfo b1 = new BookInfo();
    BookInfo b2 = new BookInfo();
    BookInfo b3 = new BookInfo();
    BookInfo b4 = new BookInfo();

    b1.name="Lord Of Xin";
    b1.author="Tom Spencer";
    b1.price=25.36;

    b2.name="Idea";
    b2.author="Greg Muller";
    b2.price=42.50;

    b3.name="The History of Poseidon";
    b3.author="Rik McMillar";
    b3.price= 15.75;

    b4.name="The Sabotage";
    b4.author="Claire Jaik";
    b4.price=35;


    BookInfo[] books ={b1,b2,b3,b4};


    for(BookInfo book : books){
      System.out.println("The book is called "+ book.name +".\n"+"Is written by " + book.author + " and it cost "+ book.price + ".");
      System.out.println("----------");

    }
  }
}