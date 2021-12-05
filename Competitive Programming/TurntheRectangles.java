import java.util.*;
import java.io.*;
class TurntheRectangles
{
	public static void main(String[] s)
	{
		int n,i;
		int w[],h[];
		ArrayList<Integer> ar=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		w=new int[n];
		h=new int[n];
		for(i=0;i<n;i++)
		{
			w[i]=sc.nextInt();
			h[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
				if(w[i]>h[i])
				ar.add(w[i]);
				else
				ar.add(h[i]);	
			}
			else
			{
				int max=ar.get(i-1);
				if(w[i]<=max && h[i]<=max)
				{
				if(w[i]>h[i])
				ar.add(w[i]);
				else
				ar.add(h[i]);	
				}
				else if(w[i]<=max)
				ar.add(w[i]);
				else if(h[i]<=max)
				ar.add(h[i]);
				else
				break;	
			}
		}
		if(ar.size()==n)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}