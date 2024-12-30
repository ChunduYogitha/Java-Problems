1) Check Prime Number
2) Check prime numbers upto 10
3) Chekc prime numbers between numbers
4)Check Twisted prime or not
5)Check Twisted prime or Not Using Call method
            

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
