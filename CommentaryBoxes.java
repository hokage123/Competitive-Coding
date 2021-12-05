import java.io.*;
import java.util.*;
class CommentaryBoxes
{
	public static void main(String[] s)
	{
		long a,b,c,d,min1,min2;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLong();
		b=sc.nextLong();
		c=sc.nextLong();
		d=sc.nextLong();
		min1=((a%b)*d);
		min2=((b-(a%b))*c);
		if(min1<min2)
			System.out.println(min1);
		else
			System.out.println(min2);
	}
}