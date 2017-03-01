//timeformat

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args)throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        String str = scan.nextLine();
       
        int a=str.length();
        char s= str.charAt(8);
        String s1=str.substring(0,2);
        String s2=str.substring(2,8);
     
        int abc = Integer.parseInt(s1);
        if(s=='A' || s=='a')
            {
            if(abc>=12)
                abc=abc-12;
                
        }

        if(s=='P' || s=='p')
            {
            
            if(abc<12)
                abc+=12;
            
             
        }
        if(s1.length()==1)
            s1= "0" + s1;
        s1 = Integer.toString(abc);
        
        if(s1.length()==1)
            s1= "0" + s1;
        System.out.println(s1+s2);
        
        
        
        
    }
}
