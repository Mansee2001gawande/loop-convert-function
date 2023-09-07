//27) *	#	*	#	*	#	*	#	*	…….
import java.util.Scanner;
public class As27 {
    public void method(){
    Scanner sc=new Scanner (System.in);
    System.out.print("enter the no:-");
    int no=sc.nextInt();
    for(int i=1;i<=no;i++){
        if (i%2==0){
            System.out.print(" "+"#");
        }
        else
            System.out.print(" "+"*");
        }
    }
}
class Test{
    public static void main(String []args){
        As27 obj=new As27();
        obj.method();
    }
}