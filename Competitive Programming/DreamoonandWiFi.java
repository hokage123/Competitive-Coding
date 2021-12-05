import java.util.*;
import java.io.*;
class DreamoonandWiFi
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int s1plus=0,s2plus=0,s1minus=0,s2minus=0,x,y,i,j;
		int pascaldp[][]=new int[11][];
		for(i=0;i<=10;i++)
			pascaldp[i]=new int[11];
		for(i=0;i<=10;i++)
		{
			pascaldp[i][1]=i;
			pascaldp[i][0]=1;
			pascaldp[i][i]=1;
		}
		for(i=1;i<=10;i++)
			for(j=2;j<i;j++)
			{
				pascaldp[i][j]=pascaldp[i-1][j-1]+pascaldp[i-1][j];
			}
		double totcomn;
		char[] send=sc.next().toCharArray();
		char[] reci=sc.next().toCharArray();
		for(i=0;i<send.length;i++)
			if(send[i]=='+')
				s1plus++;
			else if(send[i]=='-')
				s1minus++;
		for(i=0;i<reci.length;i++)
			if(reci[i]=='+')
				s2plus++;
			else if(reci[i]=='-')
				s2minus++;
		x=(s1plus-s2plus);
		y=(s1minus-s2minus);
		totcomn=Math.pow(2,(x+y));
		if(x>=0 && y>=0)
		{
			int combination=pascaldp[x+y][x];
			System.out.println((combination/totcomn));
		}
		else
		System.out.println(0.0000000000);	
	}
}