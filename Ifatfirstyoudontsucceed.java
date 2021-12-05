import java.io.*;
import java.util.*;
class Ifatfirstyoudontsucceed
{
	public static void main(String[] u)
	{
		int A,B,C,N,H,I;
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		N=sc.nextInt();
		H=((A+B)-C);
		I=(N-H);
		if(I>0 && A>=C && B>=C)
			System.out.println(I);
		else
			System.out.println(-1);
	}
}