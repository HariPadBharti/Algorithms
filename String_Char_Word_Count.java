/* Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , print the number of words in  on a new line.

Input Format

A single line containing string .

Constraints
1 <= |s| <= 1000000

Output Format

Print the number of words in string .

Sample Input

saveChangesInTheEditor
Sample Output

5
Explanation

String  contains five words:

save
Changes
In
The
Editor


Code : */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String_Char_Word_Count {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
   
        int count = 1;
        int a=s.length();
        if(a>=1 && a<=100000)
        for(int i=1; i<a; i++)
            {
            char a_char = s.charAt(i);
            
            if((int)a_char>=65 && (int)a_char<=90)
            count++;
            
            
            
        }
        System.out.println(count);
        
    }
}

