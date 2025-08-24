//remove Duplicate Character
import java.util.*;
class Solution{
                         String removeDuplicateChar(String s)
                         {
                            TreeSet<Character> set=new TreeSet<>();
                             int len=s.length();
                             s=s.toLowerCase();
                             for(int i=0;i<len;i++)
                             {
                                   set.add(s.charAt(i));                
                             }
                             String res="";
                             for(char c: set) 
                             {
                                 res=res+c;
                             }
                             return res;
                         }

}
public class RemoveDuplicateChar {
                         public static void main(String[]abc)
                         {
                            String str;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter String");
                            str=sc.next();
                            Solution ob=new Solution();
                            String res=ob.removeDuplicateChar(str);
                            System.out.println(str+" After removing all Duplicate chararacter = "+res);
                            sc.close();
                         }
                         
}
