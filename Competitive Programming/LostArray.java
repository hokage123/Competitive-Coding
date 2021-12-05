import java.util.*;
import java.io.*;
class LostArray
{
	public static void main(String[] g)
	{
		int n,a[],x[],i,j,k;
		int timeper=0,s=0,c=0,sum=0;
		ArrayList<Integer> ar=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		x=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(i==0)
				x[i]=a[i];
			else
				x[i]=(a[i]-a[i-1]);
		}
			i=0;
			j=1;
			while(j<n)
			{
				if(x[j]==x[0])
				{
					for(k=0;k<=(j-1);k++)
					{
						if((j+k)<n && x[k]==x[j+k])
						{
							c=1;
						}
						else if((j+k)<n && x[k]!=x[j+k])
						{
							c=0;
							break;
						}
						else
						{
							break;
						}
					}
				}
				if(c==1)
				{
					timeper=j;
					break;
				}
				j++;
			}
			s=timeper;
			while(c==1 && (n/timeper)!=0)
			{
				sum+=(n/timeper);
					ar.add(timeper);
				timeper+=s;
			}
			if(s!=0 && n%s!=0)
			{
				ar.add(n);
			}
			if(c==0)
				ar.add(n);
			System.out.println(ar.size());
			for(int u:ar)
				System.out.print(u+" ");
	}
}