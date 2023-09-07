//6) WAP to find out the factors of a number.
import java.util.Scanner;
public class As6 {
   public void method(){
    Scanner sc=new Scanner(System.in);
        System.out.print("enter the no");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++){
            if(no%i==0)
         System.out.print(" "+i);
        }
    } 
    public static void main(String[]args){
        As6 ob=new As6();
        ob.method();
    }
}
