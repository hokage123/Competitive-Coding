import java.util.*;
import java.io.*;
class MemeProblem
{
	public static void main(String[] f)
	{
		int t,i;
		double D,b,d;
		double root1,root2;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			d=sc.nextDouble();
			D=((d*d)-(4*d));
			if(D<0)
			{
				System.out.println("N");
			}
			else
			{
				root1=((d+Math.sqrt(D))/2);
				root2=((d-Math.sqrt(D))/2);
				System.out.println("Y"+" "+root1+" "+root2);
			}
		}		
	}
}