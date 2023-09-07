//10) WAP to print Even numbers upto N.
import java.util.Scanner;
public class As10 {
    public void method(){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the no");
        int no=sc.nextInt ();
        for(int i=1;i<=no*2;i++){
            if(i%2==0)
            System.out.print(" "+i);
        }
    }
        public static void main(String [] args){
            As10 obj=new As10();
            obj.method();

        }
        }
    

