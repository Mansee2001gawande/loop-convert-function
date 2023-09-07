//31) 9	99	999	9999	  99999 …….
import java.util.Scanner;
public class As31 {
    void method(int no){
        for(int i=1;i<=no;i++){
            for(int j=1;j<=i;j++){
                System.out.print("9");
            }System.out.print(" ");
         }
    }
}
class Test{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the no");
        int no=sc.nextInt();

        As31 obj=new As31();
        obj.method(no);
    }
}
