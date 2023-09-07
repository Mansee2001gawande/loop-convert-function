//22) 1	8	27	64	125	…..
import java.util.Scanner;
public class As22 {
    public void m1(int no){
        for(int i=1;i<=no;i++){
            int p=i*i*i;
            System.out.print(" "+p);
        }
    }
}
class Test {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no");
        int no=sc.nextInt();

        As22 obj =new As22();
        obj.m1(no);
    }
}
