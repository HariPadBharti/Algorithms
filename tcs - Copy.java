import java.util.regex.*;
import java.util.*;
public class tcs
{
		public static void main(String args[])
		{
			
			String e_id;
			
			
			
			tcs sd = new tcs();
			System.out.println("---------------------------------------------");
			
			System.out.println("---------------OUTPUTS----------------");
			sd.validateEmailAddress("Haripad@gmail.com");
			sd.validateEmailAddress("HaripaBGL@UMASSD.EDU");
			sd.validateEmailAddress("HariGL@UmassD.EDU");
			sd.validateEmailAddress("rjalBGL@GMAIL.com");
			sd.validateEmailAddress("Har*_^&@UMASSD.EDU");
			sd.validateEmailAddress("hbh36364@UMASSD.EDU");
			sd.validateEmailAddress("hbh36@yahoo.com");
			System.out.println("----------------INPUT-----------------------");
			System.out.println("Enter the email address:");
			Scanner br = new Scanner(System.in);
			e_id = br.next();
			sd.validateEmailAddress(e_id);

		}
		boolean validateEmailAddress(String email_add)
		{   
			int c = 0;
			Pattern pattern = Pattern.compile("\\b[a-zA-z]{1}+[a-zA-Z_0-9]{5,8}+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
			Matcher m = pattern.matcher( email_add );
			if(m.matches()==true)
			{
				System.out.println(email_add+" "+ "is the given email Address");
				tcs e=new tcs();
				String ep;
				ep=email_add;
				
				e.getLocalPart(ep);
			    e.isUmassdAccount(ep);
			    e.isGmailAccount(ep);
			}
			else
			{
				System.out.println(email_add+" "+ "is not a valid email address");
				System.out.println("---------------------------------------------");
				c+=1;
			}
			return true;
			
		}
		String getLocalPart(String e_addr)
		{
			String[] Local_Part = e_addr.split("@");
			String l= Local_Part[0]; 
			System.out.println("---------------------------------------------");
			
			System.out.println("Local Part of email address");
			System.out.println(l);
			
			return e_addr;
		}
		boolean isUmassdAccount(String e_Address)
		{
			String[] Local_Part = e_Address.split("@");
			String l = Local_Part[1];
			System.out.println();
			
			if(l.equalsIgnoreCase("umassd.edu"))
				{System.out.println("Given email address belongs to UMASS D ");
				System.out.println("---------------------------------------------");
				}
			else
				System.out.println("---------------------------------------------");	
			return true ;
		}
		boolean isGmailAccount(String em_Address)
		{
			String[] Local_Part = em_Address.split("@");
			String l = Local_Part[1];
			if(l.equalsIgnoreCase("gmail.com"))
				{
				System.out.println("Given email address belongs to GMAIL ");
				System.out.println("---------------------------------------------");
				}
			else
				System.out.println("---------------------------------------------");	
				return true;
		}
	}
