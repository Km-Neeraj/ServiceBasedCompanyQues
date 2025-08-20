import java.util.*;
class Solution 
{
                         int reverse(int num)
                         {
                              int rem=0,rev=0;
                              while(num!=0)
                              {
                                 rem=num%10;
                                 rev=rev*10+rem;
                                 num=num/10;
                              }
                              return rev;


                         }
}
public class ReverseNumber {


                         public static void main(String[]abc)
                         {
                           int num;
                           Scanner sc=new Scanner(System.in);
                           System.out.println("Enter Number to find its Reverse");
                           num=sc.nextInt();
                           Solution ob=new Solution();
                           int rev=ob.reverse(num);
                           System.out.println("Reverse of "+num+" = "+rev);
                           sc.close();
                         }
                         
}
