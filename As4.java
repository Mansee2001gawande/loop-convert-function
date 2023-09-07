import java.util.Scanner;
public class As4 {
    public void method(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no which you want print the table");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    public static void main(String []args){
        As4 ob=new As4();
        ob.method();
    }
    
}
