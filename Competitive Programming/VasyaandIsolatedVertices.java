import java.io.*;
import java.util.*;
class VasyaandIsolatedVertices
{
	public static void main(String[] s)
	{
		long n,m,x,min,max;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		m=sc.nextLong();
		x=(long)(Math.sqrt((2*m)));
		if((2*m)>=n)
			min=0;
		else
			min=(n-(2*m));
		while((x*(x-1))<(2*m))
			x++;
		max=(n-x);
		System.out.println(min+" "+max);
	}
}