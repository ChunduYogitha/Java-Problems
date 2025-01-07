1) Check Prime Number
2) Check prime numbers upto 10
3) Chekc prime numbers between numbers
4)Check Twisted prime or not
5)Check Twisted prime or Not Using Call method
6)print every 4th prime number
7) Nearest Prime number
8)Print a prime number without using count
9)Alternative prime numbers Between given Range


------------------------------------------------------------------------------------------------------------------------------------------------------
1)Check Prime Number
            
            import java.io.*;
            import java.util.*;
            public class Main{
                public static void main(String[] args){
                    int a = 11;
                    int count =0;
                        for(int i=2; i<a; i++){
                            if(a%i==0){
                                count = 1;
                                break;
                            }
                        }
                        if(count==0){
                            System.out.println("Prime number");
                        }
                        else{
                            System.out.println("Not prime number ");
                        }
                }
            }
OUTPUT :
            Prime Number

------------------------------------------------------------------------------------------------------------------------------------------------------
2) Chekc prime numbers upto 10
  
          import java.io.*;
          import java.util.*;
          public class Main{
              public static void main(String[] args){
                  for(int i=2; i<=10; i++){
                      int count = 0;
                      for(int j=2; j<i; j++){
                          if(i%j==0){
                              count = 1;
                              break;
                          }
                      }
                      if(count==0){
                          System.out.println(i);
                      }
                  }
              }
          }

OUTPUT:
              2
              3
              5
              7

------------------------------------------------------------------------------------------------------------------------------------------------------
  3) Chekc prime numbers between A and B
  
        import java.io.*;
        import java.util.*;
        public class Main{
            public static void main(String[] args){
                for(int i=10; i<=20; i++){
                    int count = 0;
                    for(int j=2; j<i; j++){
                        if(i%j==0){
                            count = 1;
                            break;
                        }
                    }
                    if(count==0){
                        System.out.println(i);
                    }
                }
            }
        }

OUTPUT :
              11
              13
              17
              19            
------------------------------------------------------------------------------------------------------------------------------------------------------
4)Check Twisted prime or not

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            n=-n;
        }
        int m = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        boolean a = true;
        for(int i=2; i<m; i++){
            if(m%i==0){
                 a = false;
            }
        }
        boolean b = true;
        for(int j=2; j<rev; j++){
            if(rev%j==0){
                 b = false;
            }
        }
        if(a && b){
            System.out.println("Twisted prime number");
        }
        else{
            System.out.println("Not a Twisted Prime Number");
        }
    }
}

output
            -97
            79
            Twisted prime number
            
------------------------------------------------------------------------------------------------------------------------------------------------------
5)Check Twisted prime or Not Using Call method
            
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n<0){
            n=-n;
        }
        int m=n;
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println("The reverse number :" +rev);
        boolean a = true;
        if(prime(m,a) && prime(rev,a)){
            System.out.println("Twisted prime number");
        }
        else {
             System.out.println("Not a Twisted prime number");
        }
    }
        static boolean prime(int c, boolean a){
            for(int i=2; i<c; i++){
                if(c%i==0){
                    a=false;
                }
            }
            return a;
        }
}

output
            Enter the number : 13
            The reverse number :31
            Twisted prime number

------------------------------------------------------------------------------------------------------------------------------------------------------
6)print every 4th prime number
class Main{
    public static void main(String[] args){
        int count =3;
        for(int i=2; i<=100; i++){ //  2
            boolean a = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    a = false;
                    
                }
            }
            
            if(a==true){
                count++;
                if(count%4 == 0){
                System.out.println(i);
            }
            }
        }
    }
}

output
            2
            11
            23
            41
            59
            73
            97
------------------------------------------------------------------------------------------------------------------------------------------------------
7) Nearest Prime number
            
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("InValid Input");
        }
        else{
            int a = NearestUpperPrime(n);
            int b = NearestLowerPrime(n);
            int c = a-n;
            int d = n-b;
            if(c==d){A
                System.out.println(b);
                System.out.println(a);
            }
            else if(c>d){
                System.out.println(b);
            }
            else {
                System.out.println(a);
            }
                
        }
    }
    static int NearestUpperPrime(int n){
        int i = n+1;
        while(true){
            if(isPrime(i)){
                return i;
            }
            i++;
        }
    }
    static int NearestLowerPrime(int n){
        int i= n-1;
        while(i>1){
            if(isPrime(i)){
                return i;
            }
            i--;
        }
        return 2;
    }
    static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2;i<n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
output
             input 1 : 83
             output 1 : 79

            input 2 : 182
            output 2 : 181

            input 3 : 228
            output 3 : 227
                        229
------------------------------------------------------------------------------------------------------------------------------------------------------
8)Print a prime number without using count

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
        }
        else{
        boolean a = true;
        for(int i=2; i<n; i++){
            if(n%i==0){
               a = false; 
            }
        }
        if(a){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
        }
    }
}

output
            83
            Prime Number

            -6
            Not a Prime MNumber
------------------------------------------------------------------------------------------------------------------------------------------------------
9)Alternative prime numbers Between given Range
            
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0 || n2<=0){
            System.out.println("Invalid Inputs");
        }
        else {
            Prime(n1, n2);
        }
    }
    static void Prime(int n1, int n2){
        boolean b = true;
        int count = 1;
        for(int i=n1; i<=n2; i++){
            boolean a = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    a = false; // 1
                }
            }
            if(a){
                count ++;
                if(count%2==0){
                    if(b){
                    System.out.print(i);
                    
                    b = false; 
                    }
                    else {
                    System.out.print(", "+i);
                }
                }
                
            }
        }
    }
}
output
            input 1 : 25
                        100
            output 1 : 29, 37, 43, 53, 61, 71, 79, 89


            input 2 : -6
                        -200
            output 2 : Invalid Inputs
      
------------------------------------------------------------------------------------------------------------------------------------------------------      
