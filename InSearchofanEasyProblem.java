import java.io.*;
import java.util.*;
class InSearchofanEasyProblem
{
	public static void main(String[] d)
	{
		int n,i,a,set=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a=sc.nextInt();
			if(a==1)
				set=1;
		}
		if(set==1)
			System.out.println("HARD");
		else
			System.out.println("EASY");
	}
}