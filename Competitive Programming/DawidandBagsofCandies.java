import java.util.*;
import java.io.*;
class DawidandBagsofCandies
{
	public static void main(String[] g)
	{
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		if((a[0]+a[3])==(a[1]+a[2]))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}