import java.io.*;
import java.util.*;
public class GettinganA
{
	public static void main(String[] p)
	{
		int n,a=0,i,k,count=0,m=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int b[]=new int[n]; 
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
			a+=b[i];
		}
		double d,e,f,g;
		d=n;
		e=a;
		f=(e/d);
		g=((4.5-f)*d);
		if(f>=4.5)
			k=0;
		else
		{
		if(g==(int)g)
		{
			k=(int)g;
		}
		else
		{
			k=(int)(g+1);
		}
		Arrays.sort(b);
		for(i=0;i<n;i++)
		{
			m+=(5-b[i]);
			if(((e+m)/d)>=4.5)
			{
				count=i;
				break;
			}
			
		}
		}
		if(k==0)
		System.out.println(0);
		else
		System.out.println((count+1));	
	}
}