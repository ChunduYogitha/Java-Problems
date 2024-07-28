1) Check Prime Number
2) Check prime numbers upto 10
3) Chekc prime numbers between numbers
--------------------------------------------------------------
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

---------------------------------------------------------------------------------------------
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

----------------------------------------------------------------------------------------
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
