//9) WAP to print N even numbers.
import java.util.Scanner;
public class As9 {
    public void method(int no){
        for(int i=0;i<=no;i++){
            if(i%2==0){
                System.out.print(" "+i);
            }
        }
    }
    public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter a no:-");
        int no=sc.nextInt();

        As9 obj=new As9();
        obj.method(no);
    }
}