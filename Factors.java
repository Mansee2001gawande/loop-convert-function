import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
    System.out.print("enter the no");
    int f=1, no=sc.nextInt();

   /*  for(int i=1;i<=no;i++){
        f=f*i;
    System.out.println(" "+i);
        }
    } 
} */
    while(no>0){
        f=f*no;
         no--;
}
    System.out.println(" "+f);
 }
}
