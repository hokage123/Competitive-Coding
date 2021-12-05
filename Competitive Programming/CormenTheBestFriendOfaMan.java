import java.io.*;
import java.util.*;
class CormenTheBestFriendOfaMan
{
	public static void main(String[] s)
	{
		int i,n,k,gred[],sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		gred=new int[n];
		for(i=0;i<n;i++)
			gred[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(i>0)
				if((gred[i]+gred[i-1])<k)
				{
					sum+=(k-(gred[i]+gred[i-1]));
					gred[i]+=(k-(gred[i]+gred[i-1]));
				}
		}
		System.out.println(sum);
		for(i=0;i<n;i++)
			System.out.print(gred[i]+" ");
	}
}