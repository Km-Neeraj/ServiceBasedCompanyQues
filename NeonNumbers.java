import java.util.*;
class Solution 
{
       boolean isNeon(int num)
       {
           int sum=0;
           int temp=num;
           num=num*num;
           while(num!=0)
           {
                 int rem=num%10;
                 sum=sum+rem;
                 num=num/10;

           }
           if(sum==temp)
           {
                         return true;
           }
           return false;
       }
}
public class NeonNumbers {
                         public static void main(String[]abc)
                         {
                             int num;
                             System.out.println("Enter Number to check Neon or not");
                             Scanner sc=new Scanner(System.in);
                             num=sc.nextInt();
                             Solution ob=new Solution();
                             boolean n=ob.isNeon(num);
                             if(n==true)
                             {
                                System.out.println(num+" is a Neon Number");
                             }
                             else 
                             {
                                                  System.out.println(num +" is not a Neon Number");
                             }
                             sc.close();
                         }
                         
}
/*    
Enter Number to check Neon or not
9
9 is a Neon Number */
