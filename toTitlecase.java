import java.util.*;
class Solution 
{
        String toTitleCase(String str)
        {
            str=str.toLowerCase();
            String[] word=str.split("\\s+");
            StringBuilder res=new StringBuilder();
            
            for(String w:word)
            {
                if(w.length()>0)
                {
                   res.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
                }
            }

            return res.toString().trim();
        }
}
public class toTitlecase {
                         public static void main(String[]abc)
                         {
                             String str;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter String to convert it into TitleCase");
                             str=sc.nextLine();
                              Solution ob=new Solution();
                             String res=ob.toTitleCase(str);

                             System.out.println(" TitleCase of "+str+" = "+res);
                             sc.close();
                         }
                         
}
