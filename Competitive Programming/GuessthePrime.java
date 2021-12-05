import java.io.*;
import java.util.*;
class GuessthePrime
{
	static ArrayList<Long> primeFactors(long N)
	{
		int count=0;
		ArrayList<Long> ar=new ArrayList<>();
		while(N%2==0)
		{
			N/=2;
			count=1;
		}
		if(count==1)
			ar.add(2L);
		for(long i=3;i<=Math.sqrt(N);i+=2)
		{
			count=0;
			while(N%i==0)
			{
				N/=i;
				count=1;
			}
			if(count==1)
				ar.add(i);
		}
		if(N>2)
			ar.add(N);
		return ar;
	}
	public static void main(String[] s)
	{
		int T,i;
		Scanner sc=new Scanner(System.in);
		ArrayList ar;
		String F;
		T=sc.nextInt();
		long N1=1000000000000L;
		long N2=1000000000000L;
		long mod1,mod2;
		for(i=0;i<T;i++)
		{
			System.out.println(1+" "+1000000);
			mod1=sc.nextLong();
			
			N1-=mod1;
			ar=primeFactors(N1);
			System.out.println(1+" "+ar.get(ar.size()-1).toString());
			N2=(Long)ar.get(ar.size()-1);
			N2*=N2;
			mod2=sc.nextLong();
			System.out.println(N2);
			for(Object N:ar)
			{
			    Long S=(Long)N;
				long S1=S;
				System.out.println(S1);
				if(N2%S1==mod2)
				{
					System.out.println(2+" "+S1);
					break;
				}
			}
			sc.next();
		}
	}
}