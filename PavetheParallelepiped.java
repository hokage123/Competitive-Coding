import java.util.*;
import java.io.*;
class PavetheParallelepiped
{
	public static void main(String[] y)
	{
		int T;
		int a,b,c,i,j,k,l;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			HashSet<String> hs=new HashSet<>();
			int[] ar1=factors(a);
			int[] ar2=factors(b);
			int[] ar3=factors(c);
			for(j=0;j<ar1.length;j++)
				for(k=0;k<ar2.length;k++)
					for(l=0;l<ar3.length;l++)
					{
						int[] d=new int[3];
						d[0]=ar1[j];
						d[1]=ar2[k];
						d[2]=ar3[l];
						Arrays.sort(d);
						hs.add((d[0]+" "+d[1]+" "+d[2]));
					}
			System.out.println(hs.size());		
		}
	}
	static int[] factors(int a)
	{
		int j=0,i;
		for(i=1;i<=(int)(Math.sqrt(a));i++)
		{
			if((i*i)==a)
			{
				j++;
			}
			else
			{
				if(a%i==0)
				{
					j+=2;
				}
			}		
		}
		int b[]=new int[j];
		j=0;
		for(i=1;i<=(int)(Math.sqrt(a));i++)
		{
			if((i*i)==a)
			{
				b[j]=i;
				j++;
			}
			else
			{
				if(a%i==0)
				{
					b[j]=i;
					b[j+1]=(a/i);
					j+=2;
				}
			}
		}
		return b;
	}
}