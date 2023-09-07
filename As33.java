//33) WAP to print Alphabets in reversing order.
import java.util.Scanner;
public class As33{
void method(){
    Scanner sc=new Scanner (System.in);
    System.out.print("enter any character");
    char ch=sc.next().charAt(0);
    for(char i=ch;i>=97;i--){
        System.out.print(" "+(char)i);
        }
        for(char j=ch;j>=65;j--){
            System.out.print(" "+(char)j);
        }
    }
}
class Test{
    public static void main(String args[]){
        As33 obj=new As33();
        obj.method();
    }
}