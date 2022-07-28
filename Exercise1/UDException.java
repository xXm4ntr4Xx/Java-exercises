 //custom exception 
 class EmailException extends  Exception{
    private String message;
    public EmailException(String message){
      this.message=message;
    }
    @Override
    public String toString(){
      return this.message;
    }    
}

class UDException{
  public static void main(String[]args){
    String email = args[0];
    try{
      if(email.indexOf("0")==-1){
      //create normal exception object
      EmailException ee = new EmailException("This email is not valid");
      throw ee;
    }
    }catch(EmailException e){
      System.out.println(e);
    }catch(ArrayIndexOutOfBoundsException aioobe){
      System.out.println(aioobe);
    }
  }
}