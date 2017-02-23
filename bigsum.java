//A Very Big Sum
//You are given an array of integers of size N. You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

//Input Format

//The first line of the input consists of an integer N . The next line contains  space-separated integers contained in the array.

//Output Format

//Print a single value equal to the sum of the elements in the array.
import java.io.*;
import java.util.*;
//import Math.lang.*;
import static java.lang.Math.pow;

public class bigsum {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int l[] = new int[N];
        long sum = 0L;
        for(int i=0;i<N;i++)
            {
            l[i]=scan.nextInt();
           // sum+=l[i];
        }
        if(N>=0 && N<=10)
            {
            for(int j=0; j<N; j++)
                {
                if(l[j]<=Math.pow(10,10) && l[j]>=0)
                    sum+=l[j];
                else
                    break;
            }}
        System.out.println(sum);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}