import java.io.*;
import java.util.*;
class  GoodNumbers
{
	public static void main(String[] s)
	{
		int q,j,k;
		long i=1,n;
		ArrayList<Long> ar=new ArrayList<>();
		while(i<(1e18))
		{
			ar.add(i);
			if(i>=((1e18)/3))
				break;
			i*=3;
		}
		Scanner sc=new Scanner(System.in);
		q=sc.nextInt();
		for(j=0;j<q;j++)
		{
			ArrayList<Integer> ar1=new ArrayList<>();
			n=sc.nextLong();
			long p=n;
			long sum=0;
			for(k=(ar.size()-1);k>=0;k--)
			{
				long m=ar.get(k);
				if(n>=m)
				{
					n-=m;
					sum+=m;
					ar1.add(k);
				}
			}
			if(sum==p)	
			System.out.println(sum);
			else
			{
				
				for(k=0;k<ar.size();k++)
				{
					if(!ar1.contains(k))
					{
						long m=ar.get(k);
						if(m>sum)
							sum=m;
						else
						{
							if(k==0)
							sum+=m;
							else if(k>=1)
							{
								long sum1=(sum-ar.get(k-1)+m);
								if(sum1>sum)
									sum=sum1;
								else
									sum+=m;
							}
						}
						break;
					}
				
						
				}
				System.out.println(sum);
			}
		}
	}
}