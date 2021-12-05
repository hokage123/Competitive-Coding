import java.util.*;
import java.io.*;
class ChangingVolume
{
	public static void main(String[] f)
	{
		int T,a,b,i,mod=0,sum=0;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			sum=0;
			a=sc.nextInt();
			b=sc.nextInt();
			if(a>=b)
				mod=(a-b);
			else
				mod=(b-a);
			sum+=(mod/5);
			mod%=5;
			sum+=(mod/2);
			mod%=2;
			sum+=mod;
			System.out.println(sum);
		}
	}
}