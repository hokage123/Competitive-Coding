import java.io.*;
import java.util.*;
class InfinityGauntlet
{
	public static void main(String[] m)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		HashMap<String,String> hm=new HashMap<>();
		hm.put("purple","Power");
		hm.put("green","Time");
		hm.put("blue","Space");
		hm.put("orange","Soul");
		hm.put("red","Reality");
		hm.put("yellow","Mind");
		String a[]=new String[6];
		a[0]="Power";
		a[1]="Time";
		a[2]="Space";
		a[3]="Soul";
		a[4]="Reality";
		a[5]="Mind";
		for(i=0;i<n;i++)
		{
			String s=sc.next();
			if(s.equals("purple"))
			{
				a[0]="None";
			}
			if(s.equals("green"))
			{
				a[1]="None";
			}
			if(s.equals("blue"))
			{
				a[2]="None";
			}
			if(s.equals("orange"))
			{
				a[3]="None";
			}
			if(s.equals("red"))
			{
				a[4]="None";
			}
			if(s.equals("yellow"))
			{
				a[5]="None";
			}
		}
		System.out.println((6-n));
		for(i=0;i<6;i++)
			if(!a[i].equals("None"))
				System.out.println(a[i]);
	}
}