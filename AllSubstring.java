import java.util.*;
class Solution 
{  
                          List<String> allSubString(String str)
                          {
                              ArrayList<String> res=new ArrayList<>();
                              for(int i=0;i<str.length();i++)
                              {
                                   for(int j=i;j<str.length();j++)
                                   {
                                        res.add(str.substring(i,j+1));
                                   }
                              }
                              return res;
                          }
    
}
public class AllSubstring {
                         public static void main(String[]abc)
                         {
                             String str;
                             System.out.println("Enter String to print its all substring");
                             Scanner sc=new Scanner(System.in);
                             str=sc.next();
                             Solution ob=new Solution();
                             List<String> res=ob.allSubString(str);
                             System.out.println("All Substring of "+str+" = ");
                             for(String s:res)
                             {
                                 System.out.print('"' + s + '"' + " ");
                             }
                             sc.close();
                         }
                         
}
