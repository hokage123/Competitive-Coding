import java.util.*;
import java.io.*;
class PlusMultiply
{
	public static void main(String[] d)
	{
		int t,n,a[],b,i,j,sum;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			n=sc.nextInt();
			a=new int[3];
			for(j=0;j<n;j++)
			{
				b=sc.nextInt();
				if(b==0 || b==2)
					a[b]++;
			}
			sum=(((a[0]*(a[0]-1))/2)+((a[2]*(a[2]-1))/2));
			System.out.println(sum);
		}
	}
}