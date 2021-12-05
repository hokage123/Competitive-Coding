import java.util.*;
import java.io.*;
class EquationsofMathematicalMagic
{
	public static void main(String[] s)
	{
		int t,a,i;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			a=sc.nextInt();
			int count=Integer.bitCount(a);
			int g=(int)(Math.pow(2,count));
			System.out.println(g);
		}
	}
}