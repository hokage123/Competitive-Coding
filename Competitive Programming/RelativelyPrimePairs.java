import java.io.*;
import java.util.*;
class RelativelyPrimePairs
{
	public static void main(String[] s)
	{
		long l,r,i;
		Scanner sc=new Scanner(System.in);
		l=sc.nextLong();
		r=sc.nextLong();
		System.out.println("YES");
		for(i=l;i<r;i+=2)
		{
			System.out.println(i+" "+(i+1));
		}
	}
}