import java.util.*;
import java.io.*;
class LittleCLoves3I
{
	public static void main(String[] y)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%3==0)
		{
			System.out.println("1 1 "+(n-2));
		}
		else if((n%3)==1)
		{
			System.out.println("1 1 "+(n-2));
		}
		else if((n%3)==2)
		{
			System.out.println("2 2 "+(n-4));
		}
	}
}