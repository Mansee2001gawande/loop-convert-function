//26) 0	8	64	216	…………
 import java.util.Scanner;
public class As26 {
    public void  method (int no){
        int p;
        for(int i=0;i<=no;i++){
            if(i%2==0){
            p=i*i*i;
            System.out.print(" "+p);
            }
        }
    }
}
class Test{
    public static void main(String []args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the no:-");
        int no=Sc.nextInt();

        As26 obj=new As26();
        obj.method(no);
}
}

    

