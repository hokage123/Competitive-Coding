import java.util.*;
import java.io.*;
class  Vitamins
{
	public static void main(String[] y)
	{
		int n,i,c;
		int a[]=new int[7];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			c=sc.nextInt();
			char ch[]=sc.next().toCharArray();
			Arrays.sort(ch);
			String s=new String(ch);
			if(s.equals("A"))
			{
				if(a[0]==0)
					a[0]=c;
				else
					a[0]=Integer.min(c,a[0]);
			}
			else if(s.equals("B"))
			{
				if(a[1]==0)
					a[1]=c;
				else
					a[1]=Integer.min(c,a[1]);
			}
			else if(s.equals("C"))
			{
				if(a[2]==0)
					a[2]=c;
				else
					a[2]=Integer.min(c,a[2]);
			}
			else if(s.equals("AB"))
			{
				if(a[3]==0)
					a[3]=c;
				else
					a[3]=Integer.min(c,a[3]);
			}
			else if(s.equals("BC"))
			{
				if(a[4]==0)
					a[4]=c;
				else
					a[4]=Integer.min(c,a[4]);
			}
			else if(s.equals("AC"))
			{
				if(a[5]==0)
					a[5]=c;
				else
					a[5]=Integer.min(c,a[5]);
			}
			else
			{
				if(a[6]==0)
					a[6]=c;
				else
					a[6]=Integer.min(c,a[6]);
			}
		}
		ArrayList<Integer> ar=new ArrayList<>();
		if(a[0]>0 && a[1]>0 && a[2]>0)
		ar.add((a[0]+a[1]+a[2]));
		if(a[3]>0 && a[4]>0)
		ar.add((a[3]+a[4]));
		if(a[4]>0 && a[5]>0)
		ar.add((a[4]+a[5]));
		if(a[3]>0 && a[5]>0)
		ar.add((a[3]+a[5]));
		if(a[6]>0)
		ar.add(a[6]);
		if(a[2]>0 && a[3]>0)
		ar.add(a[2]+a[3]);
		if(a[0]>0 && a[4]>0)
		ar.add(a[0]+a[4]);
		if(a[1]>0 && a[5]>0)
		ar.add(a[1]+a[5]);
	if(!ar.isEmpty())
		System.out.println(Collections.min(ar));
		else
		System.out.println("-1");	
	}
}