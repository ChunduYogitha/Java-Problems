1)Print the Given number Palindrome or Not

  
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1)Print the Given number Palindrome or Not
  
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        if(n<=0){
            System.out.println("InvAlid Input");
        }
        else {
            while(n>0){
                int rem = n%10;
                rev = rev*10+rem;
                n=n/10;
            }
            if(rev==m){
                System.out.println("Palindrome");
            }
        else { 
            System.out.println("Not a Palindrome");
        }
        }
       
    }
}
output
input 1 : 1698
output 1 : Not Palindrome

input 2 : 2112
output 2 : Palindrome

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
