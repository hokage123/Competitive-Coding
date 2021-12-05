import java.util.*;
import java.io.*;
class Differencesofthepermutations
{
	public static void main(String[] s)
	{
		int t,n,i;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[11];
		int b[]=new int[11];
		for(i=1;i<=10;i++)
		{
			if(i==1)
				a[i]=1;
			else
				a[i]=(i*a[i-1]);
		}
		for(i=1;i<=10;i++)
		{
			b[i]=((i*(i-1))/2);
		}
		 t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			n=sc.nextInt();
			System.out.println(a[n]*b[n]);
		}
	}
}