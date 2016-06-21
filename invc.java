// Hari Pad Bharti
// Inversion Count

import java.util.Arrays;
public class invc
{
	public static void main(String args[])
	{
		int[] A = {2,1,4,3,6,5,8,7,10,9};
		int n = A.length;
		int[] A1=new int[n/2];
		int[] A2=new int[n/2];
		int count=0;
		int temp=0;
		
		for(int i=0;i<n/2;i++)
		{
			A1[i]=A[i];
		}
		for(int i=0;i<n/2;i++)
		{
			A2[i]=A[n/2 + i];
		}
		System.out.println("-------------Original Array of Elements-------------");
		for(int j=0;j<n/2;j++)
		System.out.println(A1[j]);
		for(int j=0;j<n/2;j++)
		System.out.println(A2[j]);
		

		for(int i=0; i<n/2-1 ; i++)
		{
			if(A1[i+1]<A1[i])
			{
				temp = A1[i];
				A1[i] = A1[i+1];
				A1[i+1] = temp;
				count++;
			}
		}



		for(int i=0; i<n/2-1 ; i++)
		{
			if(A2[i+1]<A2[i])
			{
				temp = A2[i];
				A2[i] = A2[i+1];
				A2[i+1] = temp;
				count++;
			}
		}

		for(int i=0; i<n/2 ; i++)
		{
			for(int j=0; j<n/2; j++)
			{
				if(A2[i]<A1[j])
				{
				temp = A1[j];
				A1[j] = A2[i];
				A2[i] = temp;
				count++;
				}

			}
		}

		System.out.println("----------------Sorted Array of Elements-------------");
		for(int j=0;j<n/2;j++)
		System.out.println(A1[j]);
	    for(int j=0;j<n/2;j++)
		System.out.println(A2[j]);
		
		System.out.println("Total number of inversions = " + count);

		
		//for(int j=0;j<n/2;j++)
		//System.out.println(A1[j]);
		

	}
}