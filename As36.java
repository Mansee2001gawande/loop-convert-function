//36) WAP to reverse a number
import java.util.Scanner;
public class As36 {
    public void method(){
        int rev=0;
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the no");
        int no=sc.nextInt();
        while(no!=0){
            int rem=no%10;
                rev=rev*10+rem;
                no=no/10;
        }
        System.out.print(rev);
    }
}
class Test{
    public static void main(String[]args){
        As36 obj =new As36();
        obj.method();
    }
}
