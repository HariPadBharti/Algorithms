//This is a simple challenge to get things started. Given a sorted array () and a number (), can you print the index location of  in the array?

//The next section describes the input format. You can often skip it, if you are using included methods.
import java.io.*;
import java.util.*;

public class search {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt(); //value to be searched 
        int n = scan.nextInt();
        int arr[] = new int[n];
        int output = 0;
        for(int i=0;i<n;i++)
            {
            arr[i]=scan.nextInt();
           }
        
        if(v>=-1000 && v<=1000 && n>=1 && n<=1000)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[j]==v)
                    output=j;
            }
                
          }
        System.out.println(output);
        
            
        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}