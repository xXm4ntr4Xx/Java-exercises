interface MathOperation{
  public abstract int add(int a,int b);
  public abstract int sub(int a,int b);
  public abstract int div(int a,int b);
  public abstract int mult(int a,int b);
}

// 
    class SciCalc implements MathOperation{
      public  int add(int a,int b){
        return a+b;
      };
      public  int sub(int a,int b){
        return a-b;
      };
      public  int div(int a,int b){
        return a/b;
      };
      public  int mult(int a,int b){
        return a*b;
      };
    }
// 
    class SmartCalc implements MathOperation{
      public  int add(int a,int b){
        return a+b;
      };
      public  int sub(int a,int b){
        return a-b;
      };
      public  int div(int a,int b){
        return a/b;
      };
      public  int mult(int a,int b){
        return a*b;
      };
    }


    // 

    interface CloudService{
      public abstract void createServer();
      public abstract void createS3Bucket();
    }
    // 
    
    class Azure implements CloudService{
      @Override
      public void createServer(){
        
      }
      @Override
      public void createS3Bucket(){
    
      
    }
  }