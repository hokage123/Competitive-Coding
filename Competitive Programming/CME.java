import java.io.*;
import java.util.*;
class CME
{
	public static void main(String[] s)
	{
		int q,n,i;
		Scanner sc=new Scanner(System.in);
		q=sc.nextInt();
		for(i=0;i<q;i++)
		{
			n=sc.nextInt();
			if(n%2==0)
				System.out.println("0");
			else
				System.out.println("1");
		}
	}
}