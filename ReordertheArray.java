import java.io.*;
import java.util.*;
class ReordertheArray
{
	public static void main(String[] f)
	{
		int n,i,c,sum=0,sum1,j,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TreeMap<Integer,Integer> tm=new TreeMap<>();
		for(i=0;i<n;i++)
		{
			c=sc.nextInt();
			if(tm.containsKey(c))
				tm.put(c,(tm.get(c)+1));
			else
				tm.put(c,1);
		}
		int a[]=new int[tm.size()];
		i=0;
		for(Map.Entry<Integer,Integer> e:tm.entrySet())
		{
			a[i]=e.getValue();
			i++;
		}
		int b[]=Arrays.copyOf(a,a.length);
		for(i=0;i<(a.length-1);i++)
		{
			sum1=0;
			for(j=(i+1);j<a.length;j++)
			{
				sum1+=b[j];
				b[j]=0;
				if(sum1>=a[i])
				{
					b[j]=(sum1-a[i]);
					sum+=a[i];
					break;
				}
				else if(j==(a.length-1) && sum1<a[i])
				{
					count=1;
				}	
			}
			if(count==1)
			{
				sum+=sum1;
				break;
			}
		}
		System.out.println(sum);
	}
}