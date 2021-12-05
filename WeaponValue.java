import java.util.*;
import java.io.*;
class WeaponValue
{
	public static void main(String[] y)
	{
		int T,i,j,k,count;
		int A[],N;
		String s;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			A=new int[10];
			count=0;
			for(j=0;j<N;j++)
			{
				s=sc.next();
				char ch[]=s.toCharArray();
				for(k=0;k<10;k++)
				{
					if(ch[k]=='1')
						A[k]++;
					
				}
			}
			for(j=0;j<10;j++)
				if((A[j]%2)==1)
					count++;
			System.out.println(count);	
		}
	}
	
}