/*---------------------------------------------------------------------------------------------------*/
/*
Hari Pad Bhari 


--------------------------------------------Instructions-------------------------------------------- 
 
Problem 2.0   : Propose and Reject algorithm implemented with the efficient implementations techniques
Problem 2.1 : Implemeted in each function(a1, a2 and a3) to find most appropriate stable match.
Problem 2.2 : Considering Men's Preference order from Victor to Zeus, the code performed in function Stable_Marriage.
Problem 2.3 : Reverse men Preference order is implemented in a3 function.
Problem 2.4 : Considering Women's preference order, code is implemented in function a2

*/



import java.util.Arrays;
public class Stable_Marriage {
/*------------------Implementation of Propose and Reject Algorithm in each function---------------*/

public static void a1() 
{
String[][] Men = {{"Victor", "0"},{"Wyatt", "0"},{"Xavier", "0"},{"Yancey", "0"},{"Zeus", "0"}};
String[][] Women = {{"Amy", "0"},{"Bertha", "0"},{"Clare", "0"},{"Diane", "0"},{"Erika", "0"}};
	    	
// Men's preference order
String[][] menPref = {
	    			{"Bertha", "Amy", "Diane", "Erika", "Clare"}, 
	    			{"Diane", "Bertha", "Amy", "Clare", "Erika"}, 
	    			{"Bertha", "Erika", "Clare", "Diane", "Amy"}, 
	    			{"Amy", "Diane", "Clare", "Bertha", "Erika"},
	    			{"Bertha", "Diane", "Amy", "Erika", "Clare"}
	    	};    	
// Women's Preference order 	
String[][] womenPref = {
	        		{"Zeus", "Victor", "Wyatt", "Yancey", "Xavier"}, 
	                {"Xavier", "Wyatt", "Yancey", "Victor", "Zeus"}, 
	                {"Wyatt", "Xavier", "Yancey", "Zeus", "Victor"},
	                {"Victor", "Zeus", "Yancey", "Xavier", "Wyatt"}, 
	                {"Yancey", "Wyatt", "Zeus", "Xavier", "Victor"}
	        };
	        
	        boolean allnotmatched = true;
	        int i = 0, j = 0, k = 0;
	        
	        while(allnotmatched)
	        {
	        	for(i=0;i<5;i++)
	        	{
	        		if((Men[i][1]).equals("0"))
	        		{
	        			for(j=0;j<5;j++)
	        			{
	        				int womenIndex = 0;
	        				for(k = 0; k < 5; k++)
	        				{
	        					if(Women[k][0].equals(menPref[i][j]))
	        					{
	        						womenIndex = k;
	        						break;
	        					}
	        				}
	        				if(Women[womenIndex][1].equals("0"))
	        				{
	        					Men[i][1] = Women[womenIndex][0];
	        					Women[womenIndex][1] = Men[i][0]; 
	        					
	        				
	        					i=-1;
	        					break;
	        				}
	        				else 
	        				{
	        					int currentmen = 0, matchedmen = 0;
		        				
		        				for(k = 0; k < 5; k++)
		        				{
		        					if(womenPref[womenIndex][k].equals(Men[i][0]))
		        					{
		        						currentmen = k;
		        						break;
		        					}
		        				}
		        				for(k = 0; k < 5; k++)
		        				{
		        					if(womenPref[womenIndex][k].equals(Women[womenIndex][1]))
		        					{
		        						matchedmen = k;
		        						break;
		        					}
		        				}
		        				if(currentmen < matchedmen)
		        				{
			        				for(k = 0; k < 5; k++)
			        				{
			        					if(Men[k][0].equals(Women[womenIndex][1]))
			        					{
				        					Men[k][1] = "0";
			        						break;
			        					}
			        				}
		        					Men[i][1] = Women[womenIndex][0];
		        					Women[womenIndex][1] = Men[i][0]; 
		        					
		        					i=-1;
		        					break;
		        				}
		        				
	        				}
	        			}
	        		}
	        		else
	        		{
	        			if(i==4)
	        				allnotmatched = false;				
	        		}
	        	}
	       }
	        System.out.println("------------Implementing Propose and Reject Algorithm--------------------------");
			System.out.println("-----------------------------------We Found------------------------------------");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println();

			
	        System.out.print("Men   : ");
	        for(i=0;i<5;i++)
	        	System.out.print(Men[i][0] +" ");
	        System.out.println();
	        System.out.print("Women : ");
	        for(i=0;i<5;i++)
	        	System.out.print(Women[i][0] +" ");
	        System.out.println();
	        System.out.println("---------------------------Men's Preference Order-------------------------");
	        System.out.println();
	        System.out.println("Match Assigned Pairs: ");
	        for(i=0;i<5;i++)
	        	System.out.println(Men[i][0] +" - " + Men[i][1]);	  	  

	    
	    }	
	    public static void a2() 
	    {
String[][] Men = {{"Victor", "0"},{"Wyatt", "0"},{"Xavier", "0"},{"Yancey", "0"},{"Zeus", "0"}};
String[][] Women = {{"Amy", "0"},{"Bertha", "0"},{"Clare", "0"},{"Diane", "0"},{"Erika", "0"}};
	    	
String[][] menPref = {
	    			{"Bertha", "Amy", "Diane", "Erika", "Clare"}, 
	    			{"Diane", "Bertha", "Amy", "Clare", "Erika"}, 
	    			{"Bertha", "Erika", "Clare", "Diane", "Amy"}, 
	    			{"Amy", "Diane", "Clare", "Bertha", "Erika"},
	    			{"Bertha", "Diane", "Amy", "Erika", "Clare"}
	    	};    	
	    	 	
String[][] womenPref = {
	        		{"Zeus", "Victor", "Wyatt", "Yancey", "Xavier"}, 
	                {"Xavier", "Wyatt", "Yancey", "Victor", "Zeus"}, 
	                {"Wyatt", "Xavier", "Yancey", "Zeus", "Victor"},
	                {"Victor", "Zeus", "Yancey", "Xavier", "Wyatt"}, 
	                {"Yancey", "Wyatt", "Zeus", "Xavier", "Victor"}
	        };
	        
	        boolean allnotmatched = true;
	        int i = 0, j = 0, k = 0;
	        
	        while(allnotmatched)
	        {
	        	for(i=0;i<5;i++)
	        	{
	        		if((Women[i][1]).equals("0"))
	        		{
	        			for(j=0;j<5;j++)
	        			{
	        				int menIndex = 0;
	        				for(k = 0; k < 5; k++)
	        				{
	        					if(Men[k][0].equals(womenPref[i][j]))
	        					{
	        						menIndex = k;
	        						break;
	        					}
	        				}
	        				if(Men[menIndex][1].equals("0"))
	        				{
	        					Women[i][1] = Men[menIndex][0];
	        					Men[menIndex][1] = Women[i][0]; 
	        					
	        				
	        					i=-1;
	        					break;
	        				}
	        				else 
	        				{
	        					int currentmen = 0, matchedmen = 0;
		        				
		        				for(k = 0; k < 5; k++)
		        				{
		        					if(menPref[menIndex][k].equals(Women[i][0]))
		        					{
		        						currentmen = k;
		        						break;
		        					}
		        				}
		        				for(k = 0; k < 5; k++)
		        				{
		        					if(menPref[menIndex][k].equals(Men[menIndex][1]))
		        					{
		        						matchedmen = k;
		        						break;
		        					}
		        				}
		        				if(currentmen < matchedmen)
		        				{
			        				for(k = 0; k < 5; k++)
			        				{
			        					if(Women[k][0].equals(Men[menIndex][1]))
			        					{
				        					Women[k][1] = "0";
			        						break;
			        					}
			        				}
		        					Women[i][1] = Men[menIndex][0];
		        					Men[menIndex][1] = Women[i][0]; 
		        					
		        					i=-1;
		        					break;
		        				}
		        				
	        				}
	        			}
	        		}
	        		else
	        		{
	        			if(i==4)
	        				allnotmatched = false;				
	        		}
	        	}
	       }
			System.out.println("-------------------------Women's Preference Order-------------------------");
	        
	        System.out.println();
	        System.out.println("Match Assigned Pairs: ");
	        for(i=0;i<5;i++)
	        	System.out.println(Men[i][0] +" - " + Men[i][1]);	

	    }	 
	    public static void a3() 
	    {
String[][] Men = {{"Victor", "0"},{"Wyatt", "0"},{"Xavier", "0"},{"Yancey", "0"},{"Zeus", "0"}};
String[][] Women = {{"Amy", "0"},{"Bertha", "0"},{"Clare", "0"},{"Diane", "0"},{"Erika", "0"}};
	    	
String[][] menPref = {
	    			{"Bertha", "Amy", "Diane", "Erika", "Clare"}, 
	    			{"Diane", "Bertha", "Amy", "Clare", "Erika"}, 
	    			{"Bertha", "Erika", "Clare", "Diane", "Amy"}, 
	    			{"Amy", "Diane", "Clare", "Bertha", "Erika"},
	    			{"Bertha", "Diane", "Amy", "Erika", "Clare"}
	    	};    	
	    		
String[][] womenPref = {
	        		{"Zeus", "Victor", "Wyatt", "Yancey", "Xavier"}, 
	                {"Xavier", "Wyatt", "Yancey", "Victor", "Zeus"}, 
	                {"Wyatt", "Xavier", "Yancey", "Zeus", "Victor"},
	                {"Victor", "Zeus", "Yancey", "Xavier", "Wyatt"}, 
	                {"Yancey", "Wyatt", "Zeus", "Xavier", "Victor"}
	        };
	        
	        boolean allnotmatched = true;
	        int i = 0, j = 0, k = 0;
	        
	        while(allnotmatched)
	        {

/* ------------------Taking order of Men proposal from Zeus to Victor -------------------------------------*/


	        	for(i=4;i>=0;i--)
	        	{
	        		if((Men[i][1]).equals("0"))
	        		{
	        			for(j=0;j<5;j++)
	        			{
	        				int womenIndex = 0;
	        				for(k = 0; k < 5; k++)
	        				{
	        					if(Women[k][0].equals(menPref[i][j]))
	        					{
	        						womenIndex = k;
	        						break;
	        					}
	        				}
	        				if(Women[womenIndex][1].equals("0"))
	        				{
	        					Men[i][1] = Women[womenIndex][0];
	        					Women[womenIndex][1] = Men[i][0]; 
	        					
	        				
	        					i-=1;
	        					break;
	        				}
	        				else 
	        				{
	        					int currentmen = 0, matchedmen = 0;
		        				
		        				for(k = 0; k < 5; k++)
		        				{
		        					if(womenPref[womenIndex][k].equals(Men[i][0]))
		        					{
		        						currentmen = k;
		        						break;
		        					}
		        				}
		        				for(k = 0; k < 5; k++)
		        				{
		        					if(womenPref[womenIndex][k].equals(Women[womenIndex][1]))
		        					{
		        						matchedmen = k;
		        						break;
		        					}
		        				}
		        				if(currentmen < matchedmen)
		        				{
			        				for(k = 0; k < 5; k++)
			        				{
			        					if(Men[k][0].equals(Women[womenIndex][1]))
			        					{
				        					Men[k][1] = "0";
			        						break;
			        					}
			        				}
		        					Men[i][1] = Women[womenIndex][0];
		        					Women[womenIndex][1] = Men[i][0]; 
		        					
		        					i-=1;
		        					break;
		        				}
		        				
	        				}
	        			}
	        		}
	        		else
	        		{
	        			if(i==4)
	        				allnotmatched = false;				
	        		}
	        	}
	       }
			System.out.println("--------------------Reverse Men's Preference Order-------------------------");
	        
	        System.out.println();
	        System.out.println("Match Assigned Pairs: ");
	        for(i=0;i<5;i++)
	        	System.out.println(Men[i][0] +" - " + Men[i][1]);	  	  
	        
	    
	    }	
	    public static void main(String arg[])
	    {
	    /* -----------------Calling all the functions in main function---------------*/
	    	a1();
	    	a2();
	    	a3();

	    }

}
