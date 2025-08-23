import java.util.*;
class Solution 
{
      boolean isAutomorphic(int num)
      {
         int temp=num;
         int count=0;
         int rem=0,rev=0;
         while(num!=0)
         {
                         num=num/10;
                         count++;
         }
         num=temp;
         num=num*num;
         int mod = (int)Math.pow(10, count);

        
        if(num% mod == temp)
        {
                         return true;
        }
        
                         return false;
        
         
}
}
public class Automorphic {
                         public static void main(String[]abc)
                         {
                             int num;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter Number to check Automorphic or not");
                             num=sc.nextInt();
                             Solution ob=new Solution();
                             boolean res=ob.isAutomorphic(num);
                             if(res==true)
                             {
                                 System.out.println(num+" is Automorphic num");
                             }
                             else{
                                                  System.out.println(num+" is not an Automorphic Number");
                             }
                                sc.close();
                         }
                         
}
