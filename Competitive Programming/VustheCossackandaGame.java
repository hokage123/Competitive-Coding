import  java.io.*;
import java.util.*;
class VustheCossackandaGame
{
	public static void main(String[] h)
	{
		long n,m,k1,o1,k2,o2;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		m=sc.nextLong();
		if(n%3==0)
		k1=(n/3);
		else
			k1=((n/3)+1);
		if(m%2==0)
			o1=m/2;
		else
			o1=(m/2+1);
		if(m%3==0)
		k1=(m/3);
		else
			k1=((m/3)+1);
		if(n%2==0)
			o2=n/2;
		else
			o2=(n/2+1);
		if((k2*o2)>=(k1*o1))
			System.out.println((k2*o2));
		else
			System.out.println((k1*o1));
			
	}
}