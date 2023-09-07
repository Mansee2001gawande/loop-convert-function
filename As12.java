import java.util. Scanner;
public class As12 {
void method (int no){
    for(int i=1;i<=no*2;i++){
        if(i%2!=0)
        System.out.print(" "+i);
    }
}
public static void main(String [] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("ENTER A NO:-");
    int no=sc.nextInt();

    As12 obj=new As12();
    obj.method(no);
}
}
