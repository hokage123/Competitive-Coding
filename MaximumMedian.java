import java.util.*;
class MaximumMedian
{
	public static void main(String[] s)
	{
		int N,K,i,j,mop=0,med;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		int ay[];
		ay=new int[N];
		for(i=0;i<N;i++)
			ay[i]=sc.nextInt();
		Arrays.sort(ay);
		int sum[]=new int[(N/2)];
		for(i=0;i<(N/2);i++)
		{
			if(i==0)	
				sum[i]+=((i+1)*(ay[(N/2)+i+1]-ay[(N/2)+i]));
			else
				sum[i]+=(((i+1)*((ay[(N/2)+i+1]-ay[(N/2)+i])))+sum[i-1]);
		}			
		for(i=0;i<(N/2);i++)
		{
			mop=0;
			for(j=N/2;j<=((N/2)+i+1);j++)
				{
					mop+=ay[j];
				}
			if(K<=sum[i])
			{
				
				med=((mop+sum[i])/(i+1));
			}
		}
		if(K>(sum[(N/2)-1]))
		{
			med=((mop+sum[i])/(i+1));	
			K-=sum[(N/2)-1];
		}
		med+=(K/(N/2+1));
		System.out.println(med);
	}
}