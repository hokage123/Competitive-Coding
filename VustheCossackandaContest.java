import java.util.*;
import java.io.*;
class VustheCossackandaContest
{
	public static void main(String[] s)
	{
		int n,m,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		k=sc.nextInt();
		if(n<=m && n<=k)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}