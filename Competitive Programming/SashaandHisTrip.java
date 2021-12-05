import java.util.*;
import java.io.*;
class SashaandHisTrip
{
	public static void main(String[] g)
	{
		int n,v;
		long sum=0,rem;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		v=sc.nextInt();
		if(n>(v+1))
		{
			sum+=v;
			rem=((n-1)-v);
			int i=2;
			while(rem>0)
			{
				sum+=i;
				i++;
				rem--;
			}
		}
		else if(n<=(v+1))
			sum=(n-1);
		System.out.println(sum);
	}	
}