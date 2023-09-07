public class T2 {
 public void m1(){
      System.out.println("blank print");  
    }

   public void m1(int... x){
      System.out.println("var arg print");  
    }
    public static void main(String [] args){
        T2 object=new T2();
        object.m1();
    }

    
}
