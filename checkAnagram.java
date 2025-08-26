import java.util.*;
class Solution {
                         boolean isAnagram(String s1,String s2)
                         {
                               if(s1.length()!=s2.length())
                               return false;
                               char[] s1Array=s1.toCharArray();
                               char[] s2Array=s2.toCharArray();
                               
                               Arrays.sort(s1Array);
                               Arrays.sort(s2Array);

                               return Arrays.equals(s1Array,s2Array);
                               
                         }

}
public class checkAnagram {
                         public static void main(String[]abc)
                         {
                             String s1,s2;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter two String to check Anagram or not");
                             s1=sc.next();
                             s2=sc.next();
                             Solution ob=new Solution();

                             if(ob.isAnagram(s1,s2))
                             {
                                 System.out.println(s1+" and "+s2+" is an Anagram");
                             }
                             else 
                             {
                                                  System.out.println(s1+" and "+s2+" is not an Anagram");
                             }
                             sc.close();
                         }
                         
}
