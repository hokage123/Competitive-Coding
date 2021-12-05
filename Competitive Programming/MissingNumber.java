import java.util.*;
import java.io.*;
class MissingNumber
{
	public static void main(String[] gt)
	{
		int i,j,k,m,T,N;
		Scanner sc=new Scanner(System.in);
		long l=(long)(1e12);
		long power[][];
		power=new long[37][];
		for(i=2;i<=36;i++)
		{
			power[i]=new long[(int)((Math.log(l)/Math.log(i))+2)];
			for(j=0;j<power[i].length;j++)
			{
				if(j==0)
					power[i][j]=1;
				else
				{
					long u=i;
					power[i][j]=(u*power[i][j-1]);
				}
			}
		}
		T=sc.nextInt();
		for(i=1;i<=T;i++)
		{
			ArrayList<Long> ar=new ArrayList<>();
			int count=0;
			int count1;
			int a;
			char[] b;
			N=sc.nextInt();
			count1=N;
			HashMap<Long,Integer> hm=new HashMap<>();  
			for(j=1;j<=N;j++)
			{
				a=sc.nextInt();
				b=sc.next().toCharArray();
				if(a>0)
				{
					long n=-1;
					
					if(b.length<=(power[a].length-1))
					{	
						n=0;	
						for(m=0;m<b.length;m++)
						{
							long h;
							if(b[m]>='0' && b[m]<='9')
							{
								h=(b[m]-'0');
							}
							else
							{
								h=(b[m]-'A');
								h+=10;
							}
							n+=(h*power[a][b.length-1-m]);
						}
						if(n>=0)
						{	
							if(hm.containsKey(n))
							{
								hm.put(n,(hm.get(n)+1));
							}
							else
								hm.put(n,1);
						}
					}
				}
				else
				{	
				for(k=2;(k<=36 && b.length<=(power[k].length-1));k++)
				{
					long n=-1;
					for(m=0;m<b.length;m++)
					{
						if(n==-1)
							n=0;
						long h;
						if(b[m]>='0' && b[m]<='9')
						{
							h=(b[m]-'0');
						}
						else
						{
							h=(b[m]-'A');
							h+=10;
						}
						n+=(h*power[k][b.length-1-m]);
					}
					if(k==2  && n>l)
						count1--;
					if(n>=0)
					{	
					if(hm.containsKey(n))
					{
						hm.put(n,(hm.get(n)+1));
					}
					else
						hm.put(n,1);
					}
				}
				}
			}
			long min=-1;
			int value1=0;
			for(Map.Entry<Long,Integer> e:hm.entrySet())
			{
				long key=e.getKey();
				int value=e.getValue();
				if(value1==0 && key<=l)
				{
					value1=value;
					min=key;
				}
				else if(key<=l)
				{
					if(value>value1)
					{
						value1=value;
						min=key;
					}
					else if(value==value1 && key<min)
					{
						min=key;
					}
				}
			}
			if(min==-1)
				System.out.println("-1");	
			else if(value1==N)
				System.out.println(min);
			else
				System.out.println("-1");
		}
			
	}
}