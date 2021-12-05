import java.io.*;
import java.util.*;
public class KeanuReeves
{
public static void main(String[] f)
{
	int N,i,bit0=0,bit1=0;
	String S;
	char ch[];
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	S=sc.next();
	ch=S.toCharArray();
	for(i=0;i<N;i++)
	{
		if(ch[i]=='1')
		{
			bit1++;
		}
		if(ch[i]=='0')
			bit0++;
	}
	if((N%2!=0) || (bit0!=bit1))
	{
		System.out.println("1");
		System.out.print(S);
	}
	else if((N/2)%2!=0)
	{
		System.out.println("2");
		System.out.print(new String(S.substring(0,N/2))+" ");
		System.out.print(new String(S.substring(N/2,N))+" ");
	}
	else
	{
		System.out.println("2");
		System.out.print(new String(S.substring(0,(N/2+1)))+" ");
		System.out.print(new String(S.substring((N/2+1),N))+" ");
	}
}
}