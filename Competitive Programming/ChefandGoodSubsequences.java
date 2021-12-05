import java.math.*;
import java.util.*;
import java.io.*;
class ChefandGoodSubsequences
{
	public static void main(String[] f)
	{
		int T,N,i,j,k,a,K;
		long h=1000000007l;
		Scanner sc=new Scanner(System.in);
		
			N=sc.nextInt();
			K=sc.nextInt();
			ArrayList<Long> ar=new ArrayList<>();
			HashMap<Integer,Long> hm=new HashMap<>();
				for(j=0;j<N;j++)
				{
					a=sc.nextInt();
					if(!hm.containsKey(a))
						hm.put(a,1l);
					else
						hm.put(a,(hm.get(a)+1l));
				}
				for(Map.Entry<Integer,Long> e:hm.entrySet())
				{
					long r=e.getValue();
					ar.add(r);
				}
				long T1[]=new long[ar.size()];
				long S[]=new long[ar.size()];
				long S1;
				for(j=0;j<T1.length;j++)
					T1[j]=(ar.get(j)%h);
				long TN[][]=new long[ar.size()][ar.size()];
				for(j=0;j<T1.length;j++)
				{	
					TN[0][j]=(T1[j]%h);
					S[0]+=TN[0][j];
				}
				S[0]%=h;
				for(j=1;j<T1.length;j++)
				{
					S1=S[j-1];
					for(k=0;k<(T1.length-j);k++)
					{
						S1-=TN[j-1][k];
						if(S1<0)
							S1+=h;
						TN[j][k]+=(((T1[k]%h)*(S1%h))%h);
						S[j]+=TN[j][k];
						S[j]%=h;
					}
				}
				j=0;
				S1=0;
				while(j<K && j<T1.length)
				{
					S1+=S[j];
					S1%=h;
					j++;
				}
				S1++;
				S1%=h;
				System.out.println(S1);
			  
	
	}
}