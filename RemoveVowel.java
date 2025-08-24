//Remove all vowels from String
import java.util.*;
class Solution {
                      String removeAllVowel(String s)
                      {
                           String vowel="aeiouAEIOU";
                           int len=s.length();
                           String res="";
                           for(int i=0;i<len;i++)
                           {
                                  if(vowel.indexOf(s.charAt(i))==-1)
                                  {
                                                  res=res+s.charAt(i);
                                  }
                           }
                           return res;
                      }
}
public class RemoveVowel {
                         public static void main(String[]abc)
                         {
                             String str;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter String");
                             str=sc.next();
                             Solution ob=new Solution();
                             String res=ob.removeAllVowel(str);
                             System.out.println(str+" After Removing all Vowel = "+res);
                             sc.close();

                         }
                         
}
