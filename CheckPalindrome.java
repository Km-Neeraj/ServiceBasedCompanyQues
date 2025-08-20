import java.util.*;
public class CheckPalindrome {
                          static boolean isPalindrome(int num)
                          {
                             int rem=0,rev=0,temp=num;
                             while(temp!=0)
                             {
                                                  rem=temp%10;
                                                  rev=rev*10+rem;
                                                  temp=temp/10;

                             }
                             if(num==rev)
                             return true;
                             else return false;
                          }
                          public static void main(String[]abc)
                          {
                              int n;
                              Scanner sc=new Scanner(System.in);
                              System.out.println("Enter Number to check Palindrome or not");
                              n=sc.nextInt();
                              if(isPalindrome(n))
                              {
                                                  System.out.println(n+" is a Palindrome Number");
                              }
                              else{
                                         System.out.println(n+" is not a Palindrome Number");         
                              }
                              sc.close();
                          }
}
