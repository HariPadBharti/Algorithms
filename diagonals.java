//Diagonal Difference 
//Given a square matrix of size N X N , calculate the absolute difference between the sums of its diagonals.

//Input Format

//The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

//Output Format

//Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
import java.io.*;
import java.util.*;

public class diagonals {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt(); //size of array
        int arr[][] = new int[a][a];
        int diag1 = 0;
        int diag2 = 0;
        int sum=0;
        for(int i=0;i<a;i++)
            for(int j=0;j<a;j++)
            {
            arr[i][j]= scan.nextInt();
            //Math.abs(sum);
            if(i==j)
            diag1+=arr[i][j];
            }
        for(int i=0;i<a;i++)
            {
            diag2+=arr[a-i-1][i];
        }
        sum=Math.abs(Math.abs(diag1) - Math.abs(diag2));

        System.out.println(sum);
    }
}