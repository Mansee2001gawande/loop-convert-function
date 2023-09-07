//24) 0	4	16	36	64	….. 1 2 3 4 5 6 7 8
import java.util.Scanner;


public class As24 {
    public void  method (int no){
        int p=1;
        for(int i=0;i<=no;i++){
            if(i%2==0){
            p=i*i;
            System.out.print(p);
            }
        }
    }
}
class Test{
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
     System.out.print("enter the no:-");
    int no=sc.nextInt();

    As24 obj=new As24();
    obj.method(no);
}
}
