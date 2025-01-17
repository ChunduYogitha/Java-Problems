1)Write a program to check whether the given number is Adam or Not
  
--------------------------------------------------------------------------------------------------------------------------------------------------
1)Write a program to check whether the given number is Adam or Not
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // orginal value is  in variable n
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
        }
        else {
            adam(n);
        }
    }
    static void adam(int n){
        int rev = 0;
        // storing the original value in a variable m
        int m = n;
        while(n>0){
            // reversing the original value
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        // squaring the original value
        int orginal = m*m;
        // squaring the reversing value
        int reverse = rev*rev;
        int revs = 0;
        while(reverse>0){
            int rem = reverse%10;
            revs = revs*10+rem;
            reverse=reverse/10;
        }
         if(revs==orginal){
                System.out.println("Adam Number");
            }
            else {
                System.out.println("Not an Adam Number");
            }
    }
}
output
Input 1 : 12
Output 1 : Adam Number

Input 2 : 14
Output : Not an Adam Number

--------------------------------------------------------------------------------------------------------------------------------------------------
