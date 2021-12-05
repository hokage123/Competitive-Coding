import java.io.*;
import java.util.*;
class  ObtainTwoZeroes
{
	public static void main(String[] f)
	{
		int n,a,b,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			if((a<=(2*b) || b<=(2*a)) && ((a%3==0 && b%3==0) ||(a>=1 && b>=2 &&(a-1)%3==0 && (b-2)%3==0) ||(a>=2 && b>=1 && (b-1)%3==0 && (a-2)%3==0)))
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}
}