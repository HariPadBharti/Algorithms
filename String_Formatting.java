/* Hacker Coding 
Q1: 
Input Format

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

Output Format

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly 15 characters. 
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
Explanation

Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  16th character, and each integer that was less than  digits now has leading zeroes.
*/ 

//Code: 
import java.util.Scanner;

public class String_Formatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int a= s1.length();
                int x=sc.nextInt();
                System.out.print(s1);
                if(a<=10)
                for(int j=a; j<15;j++)
                System.out.print(" ");
                if(x>=100 && x<=999)
                System.out.print(x);
                if(x<100 && x>=10)
                System.out.print("0"+x);
                if(x<10 && x>=0)
                System.out.print("00"+x);
                    
                //Complete this line
                System.out.println();
            }
            System.out.println("================================");

    }
}
