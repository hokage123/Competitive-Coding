import java.util.*;
import java.io.*;
class Coins
{
	public static void main(String[] d)
	{
		int n,S;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		S=sc.nextInt();
		if(S%n==0)
			System.out.println((S/n));
		else
			System.out.println(((S/n)+1));
	}
}