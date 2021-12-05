import java.io.*;
import java.util.*;
class ReversingEncryption
{
	public static void main(String[] f)
	{
		int n,i,j,c,d;
		String s;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=sc.next();
		char ch[]=s.toCharArray();
		int cd[]=new int[n];
		char[] ch1=new char[n]; 
		int a[]=fact(n);
		Arrays.sort(a);
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(i=0;i<n;i++)
			hm.put(i,i);
		for(i=(a.length-1);i>=0;i--)
		{
			for(j=0;j<(a[i]/2);j++)
			{
				c=hm.get(j);
				d=hm.get((a[i]-(j+1)));
				hm.put(j,d);
				hm.put((a[i]-(j+1)),c);
			}
			
		}
		for(i=0;i<n;i++)
			ch1[hm.get(i)]=ch[i];
		String s1=new String(ch1);
		System.out.println(s1);
	}
	public static int[] fact(int n)
	{
		int i=1,count=0;
		for(i=1;i<=Math.sqrt(n);i++)
		{
			if((i*i)==n)
			{
				count++;
			}
			else if((n%i)==0)
			{
				count+=2;
			}
		}
		int a[]=new int[count];
		count=0;
		for(i=1;i<=Math.sqrt(n);i++)
		{
			if((i*i)==n)
			{
				a[count]=i;
				count++;
			}
			else if((n%i)==0)
			{
				a[count]=i;
				a[count+1]=(n/i);
				count+=2;
			}
		}
		return a;
	}
}