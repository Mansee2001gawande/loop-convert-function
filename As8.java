//8) WAP to print Fibonacci series.
import java.util.Scanner;
public class As8 {
    public void method(int no){
        int a=0,b=1,c=0;
        System.out.print(a);
        System.out.print(" "+b);

    while (no!=0){            
            c=a+b;
    
            System.out.print(" "+c);
            a=b;
            b=c;
            no--;
    }
            }
        
             public static void main(String []args){
             Scanner sc=new Scanner(System.in);
             System.out.print("enter the no :-");
             int no=sc.nextInt();

                As8 obj=new As8();
                obj.method(no);
             }
        }
    

