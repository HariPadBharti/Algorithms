/* Scheduling Problem */
import java.util.Arrays;
public class sched
{
	public void as()
	{
		int[] running = {10,11,12,13,14};
		int[] biking = {15,16,17,18,19};
		int[] swimming = {5,6,7,8,9};
		int[] combined = new int[5];
		int[] order = new int[5];
		int swimtotal=0;
		String[] player = {"John" , "Smith" , "Fran" , "Dave" , "Steve"};

		for(int i=0;i<5;i++)
		{
			combined[i] = running[i] + biking[i];
			//swimtotal + = swimming[i];

		}
		int temp=0, temp1 = 0, temp2 = 0;
		String str;
		for(int j=0;j<4;j++)
		{
			if(swimming[j+1]<swimming[j])
			{
				temp = swimming[j+1];
				swimming[j+1] = swimming[j];
				swimming[j] = temp;
				temp1 = running[j+1];
				running[j+1] = running[j];
				running[j] = temp1;
				temp2 = biking[j+1];
				biking[j+1] = biking[j];
				biking[j] = temp2;
				str = player[j+1];
				player[j+1] = player[j];
				player[j] = str;
				//combined[j] = running[j
			}
		}
		System.out.println("Time needed by each person for Triathalon sorted by swimming time");
		System.out.println("player \t running \t biking \t swimming");

		for(int j=4; j>=0; j--)
		{
		System.out.print(player[j] +"  \t  " + running[j] + "    \t    " + biking[j] + "    \t    " + swimming[j] + "\t");
		
		System.out.println();

		}
				System.out.println("----------------------------------------------------------------------- ");

		System.out.println("Sending Person requiring max time to swim first, we may minimize overall time");
		System.out.println("");
		System.out.println("Now Order of People with Total time elapsed on Triathalon according to swimming preference");
		System.out.println("----------------------------------------------------------------------- ");
		int fl=0;
		
		System.out.println("player \t Total time in Triathalon");
		for(int j=4;j>=0;j--)
		{
			fl+=swimming[j];
			order[j] = fl + running[j] + biking[j];
			System.out.print(player[j] +"  \t  " +  order[j]);
			System.out.println();
			
		}
		System.out.println("-----------Hence Order of Players :------------");
		for (int i=4;i>=0 ;i-- ) {
			System.out.println(player[i]);
			
		}
				System.out.println("----------------------------------------------------------------------- ");

		System.out.println("THEREFORE, John (needed min time to swim) sent at last while Steve( needed max time to swim) sent first to swim  IN ORDER TO GET MINIMUM COMPLETION TIME");
				System.out.println("----------------------------------------------------------------------- ");

	}
	public static void main(String arg[])
	{
		sched a = new sched();
		a.as();
	}
}
