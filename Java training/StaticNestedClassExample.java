class StaticNestedClassExample{  
  static int data=30;  
  static class Inner{  
   void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  StaticNestedClassExample.Inner obj=new StaticNestedClassExample.Inner();  
  obj.msg(); 
  //StaticNestedClassExample.Inner.msg();  For this to run you have to make the method msg() static
  }  
}  