import java.util.*;
public class FibonacciUpToN {

                           static void fibonacci(int n)
                           {
                                                  int first=0,second=1,third;
                                                  System.out.println("Fibonacci Series upto "+n);
                                                  System.out.print(first+" "+second);
                                                  for(int i=2;i<=n;i++)
                                                  {
                                                     third=first+second;
                                                     System.out.print(" "+third);
                                                     first=second;
                                                     second=third;
                                                  }
                           }
                         public static void main(String[]abc)
                         {
                                                  int n;
                                                  Scanner sc=new Scanner(System.in);
                                                  System.out.println("Enter the number of terms of Fibonacci Series");
                                                  n=sc.nextInt();
                                                  fibonacci(n);
                                                  sc.close();
                         }
                         
}
