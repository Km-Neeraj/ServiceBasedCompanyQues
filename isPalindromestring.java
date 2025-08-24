import java.util.*;
class Solution {

                         boolean isPalindrome(String s)
                         {
                             int len=s.length();

                             s=s.toLowerCase();
                             String res="";
                             for(int i=len-1;i>=0;i--)
                             {
                                res=res+s.charAt(i);
                             }
                             return s.equals(res);
                         }

}
public class isPalindromestring {
                         public static void main(String[]abc)
                         {
                             String s;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter String to check Palindrome or not");
                             s=sc.next();
                             Solution ob=new Solution();
                             boolean res=ob.isPalindrome(s);
                             if(res)
                             {
                                System.out.println('"' +s+ '"'+ " is Palindrome");
                             }
                             else{
                                                  System.out.println('"'+s+'"'+" is not palindrome");
                             }
                             sc.close();
                         }
                         
}
