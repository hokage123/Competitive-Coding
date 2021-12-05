import java.io.*;
import java.util.*;
class NonCoprimePartition
{
	public static void main(String[] t)
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		if(n==1)
			System.out.println("No");
		else
		{
			System.out.println("Yes");
			System.out.print((n/2)+" ");
			for(i=2;i<=n;i+=2)
				System.out.print(i+" ");
			System.out.println();
			System.out.print((n-(n/2))+" ");
			for(i=1;i<=n;i+=2)
				System.out.print(i+" ");
		}
	}
}