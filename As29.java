//29) 1	11	111	1111	  11111	……
import java.util.Scanner;
public class As29 {
    void method(){
    Scanner sc=new Scanner (System.in);
    System.out.print("enter the no:-");
    int no=sc.nextInt();
    for(int i=1;i<=no;i++){
        for(int j=1;j<=i;j++){  
           System.out.print("1");
        }   
        System.out.print(" ");
        }
    }              
}
class Test{
    public static void main(String[]args){
        As29 obj=new As29();
        obj.method();
    }
}
