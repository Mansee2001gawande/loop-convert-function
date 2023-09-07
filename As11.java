//11) WAP to print N odd numbers.
import java.util.Scanner;
public class As11 {
    public void method(int no){
      for(int i=0;i<=no;i++){
        if(i%2!=0)
        System.out.print(" "+i);
      }
     }
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
      System.out.print("enter the no");
      int no=sc.nextInt();

       As11 obj=new As11();
       obj.method(no);
    }
 }
    

