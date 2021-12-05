import java.util.*;
import java.io.*;
class ThatIsMyScore
{
	public static void main(String[] d)
	{
		int t,a[],i,j,sum=0,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			sum=0;
			a=new int[12];
			n=sc.nextInt();
			for(j=0;j<n;j++)
			{
				int b=sc.nextInt();
				int c=sc.nextInt();
				if(a[b]<c)
					a[b]=c;
			}
			for(j=0;j<=8;j++)
				sum+=a[j];
			System.out.println(sum);
		}		
	}
}