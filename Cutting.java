import java.io.*;
import java.util.*;
class Cutting
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int a[],odd=0,even=0,n,b=0,i,count=0;
		n=sc.nextInt();
		b=sc.nextInt();
		a=new int[n];
		ArrayList<Integer> ar=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    if(a[i]%2==0)
				even++;
			else
				odd++;
			if(i!=(n-1))
			{
				if(even==odd)
				{
					if(a[i+1]>a[i])
					ar.add((a[i+1]-a[i]));
					else
					ar.add((a[i]-a[i+1]));	
				}
			}
		}
		Collections.sort(ar);
		for(int j:ar)
		{
			if(j<=b)
			{
				b-=j;
				count++;
			}
			else
				break;
		}
		System.out.println(count);	
	}
}