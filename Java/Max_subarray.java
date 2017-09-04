package practise;

import java.util.Scanner;

public class Max_sum {
public static void main(String args[])
{
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter length of array");
	int l = scan.nextInt();
	int a[] = new int[l];
 	System.out.println("Enter an array of numbers");
 	for(int i = 0;i<l;i++)
 		a[i]=scan.nextInt();
 	
 	int global_max = a[0];
 	int max_subarray = a[0];
 	for(int j=1; j<l; j++)
 	{
 		max_subarray  = Math.max(a[j], max_subarray+a[j]);
 		if(max_subarray > global_max)
 			global_max = max_subarray;
 		
 	}
	
 	System.out.println(global_max);
	}
}
