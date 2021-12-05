import java.io.*;
import java.util.*;
class ImportantExam
{
	public static void main(String[] d)
	{
		int N,L,i,j,max,wmax=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		L=sc.nextInt();
		char ch[][];
		String s;
		ch=new char[N][];
		int marks[]=new int[L];
		for(i=0;i<N;i++)
		{
			s=sc.next();
			ch[i]=s.toCharArray();
		}
		for(i=0;i<L;i++)
			marks[i]=sc.nextInt();
		for(i=0;i<L;i++)
		{
			max=0;
			int ar[]=new int[5];
			for(j=0;j<N;j++)
			{
				ar[ch[j][i]-'A']++;
			}
			for(j=0;j<5;j++)
			{
				if(ar[j]>max)
					max=ar[j];
			}
			wmax+=(max*marks[i]);
		}
		System.out.println(wmax);
	}
}