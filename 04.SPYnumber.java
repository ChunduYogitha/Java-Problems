1)Baisc spy number
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1)Baisc spy number
  
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int mul=1;
        if(n<0){
            n=-n;
        }
        if(n==0){
            System.out.println("Zero");
        }
        else if(n<=10){
            System.out.println("Invalid Input");
        }
        else {
          while(n>0){
              int rem = n%10;
              sum = sum+rem;
              mul = mul*rem;
              n=n/10;
          }
          if(sum==mul){
              System.out.println("Spy Number");
          }
          else {
              System.out.println("Not a Spy Number");
          }
        }
    }
}
output
input 1 : 123
output 1 : Spy Number

input 2 : 24
output 2 : Not a Spy number

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
