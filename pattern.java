/* Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
###### */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        for(int i=0;i<a;i++){
        for(int j=a-i-1;j>0;j--)
        System.out.print(" ");
        for(int k=0; k<=i; k++)
        System.out.print("#");
         
        System.out.println();
        }
    }
}