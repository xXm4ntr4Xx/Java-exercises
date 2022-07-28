import java.util.HashMap;// UNIQUE -ONORDER

class HashMapDemo1{
  public static void main(String[]s) {
    HashMap<String,Integer> scoreCard =new HashMap<>();
    Employee e1 = new Employee();//?
    
    scoreCard.put("steve",200);
    scoreCard.put("austin",250);
    scoreCard.put("peter",90);
    scoreCard.put("a",120);
    scoreCard.put("b",130);
    scoreCard.put("c",152);
    
    HashMap<Integer,Employee> newHash =new HashMap<>();
    newHash.put(1,e1);

    
    System.out.println(newHash);
    System.out.println(scoreCard);



    // // System.out.println(scoreCard);

    // for(Object sc: scoreCard.keySet()){
    //   System.out.println(sc+" "+ scoreCard.get(sc)+"  all elemnt");
    // }
    // //update the score of a player from 152to151
    // scoreCard.put("c", 151);

    // //update an employee name wich is stored in HashMap
    // //1)
    

    // // System.out.println(scoreCard);
    //  scoreCard.replace("a",139);
    
    //  System.out.println(scoreCard+"  new hashMap");

  }
}

