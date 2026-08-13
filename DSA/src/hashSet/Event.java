package hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Event {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		boolean val= true;
		HashSet<String> email = new HashSet<>();
		while(val)
		{
			System.out.println("Press 1 to add");
			System.out.println("Press 2  to remove");
			System.out.println("Press 3 to see the total count");
			System.out.println("Press 0 to return");
			int a=sc.nextInt();
			if(a==1)
			{
				System.out.println("Enter your mail");
				String mail = sc.next();
				if(!email.contains(mail))
				{
					email.add(mail);
				}
				else
					System.out.println("This mail is already registered");
			}
			else if(a==2)
			{
				System.out.println("Enter your mail");
				String mail = sc.next();
				if(email.contains(mail))
				{
					email.remove(mail);
				}
				else
					System.out.println("This mail is not registered");
			}
			else if(a==3)
			{
				System.out.println("Total participants count: "+email.size());
			}
			else if(a==0) return;
			else
			{
				System.out.println("Enter a valid number");
			}
		}
	}
}
