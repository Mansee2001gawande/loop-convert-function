//17) 1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
public class As17 {
    void method(int no){
        int sum=1;
        for(int i=0;i<=no;i++){
        sum=sum+i;
        System.out.print(" "+sum);
    }
}   
public static void main(String []args) {
     Scanner sc=new Scanner (System.in);
    System.out.print("enter the no :-");
    int no=sc.nextInt();

    As17 obj=new  As17();
    obj.method(no);

    }
}
