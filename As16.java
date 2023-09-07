//16) …... -6	-3	0	3	6	9	……. n terms	
import java.util.Scanner;
public class As16 {
    void method(){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a no");
        int no=sc.nextInt();
        for(int i=no;i>=0;i--){
        for(int j=1;j<=no;j=j+3,j++){
        
        
            System.out.print(" "+i);

         } }
        }
        public static void main ( String [] args){
            As16 obj =new As16();
            obj.method();

        }
    }
    

