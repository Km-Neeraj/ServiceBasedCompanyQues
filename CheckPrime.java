import java.util.*;
class Solution 
{
                         boolean isPrime(int num)
                         {

                                                  if(num<=1)
                                                  return false;
                         
                              for(int i=2;i<Math.sqrt(num);i++)
                              {
                                                  if(num%i==0)
                                                  {
                                                                           return false;
                                                  }
                              }
                              return true;
                         }
}
public class CheckPrime {

                         public static void main(String[]abc)
                         {
                             int num;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter number to check whether it is prime or not");
                             num=sc.nextInt();
                             Solution ob=new Solution();
                             boolean p=ob.isPrime(num);
                             if(p)
                             {
                                                  System.out.println(num+" is Prime");
                             }
                             else{
                                                  System.out.println(num+" is not Prime");
                             }

                             sc.close();
                         }
                         
}
