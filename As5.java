//5) WAP to find out the factorial of a number.
import java.util.Scanner;
public class As5 {
    public void method(){
        int mult=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no:-");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++){
            mult=mult*i;
        }
         System.out.print(mult);
    }
    public static void main(String []args){
        As5 ob=new As5();
        ob.method();
    }
    
}
