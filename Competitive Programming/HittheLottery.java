import java.io.*;
import java.util.*;
class HittheLottery
{
	public static void main(String[] d)
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[5];
		a[0]=100;
		a[1]=20;
		a[2]=10;
		a[3]=5;
		a[4]=1;
		for(int g:a)
		{
			count+=(n/g);
			n%=g;
		}
		System.out.println(count);
	}
}