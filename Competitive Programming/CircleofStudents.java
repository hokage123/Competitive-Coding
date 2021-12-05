import java.util.*;
import java.io.*;
class CircleofStudents
{
	public static void main(String[] f)
	{
		int T,a[],i,j,min,cont1,cont2,indi,N;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			cont1=0;
			cont2=0;
			min=0;
			indi=-1;
			N=sc.nextInt();
			a=new int[N];
			ArrayList<Integer> b=new ArrayList<>();
			ArrayList<Integer> c=new ArrayList<>();
			for(j=0;j<N;j++)
			{
				a[j]=sc.nextInt();
				if(min==0)
				{
				    indi=0;
				    min=a[j];
				}
				if(a[j]<min)
				{
					indi=j;
					min=a[j];
				}
			}
			if(N!=1)
			{
			for(j=indi;j<N;j++)
				b.add(a[j]);
			for(j=0;j<indi;j++)
				b.add(a[j]);
			for(j=indi;j>=0;j--)
				c.add(a[j]);
			for(j=(N-1);j>indi;j--)
				c.add(a[j]);
			int comp1,comp2,comp3,comp4;
			comp1=b.get(0);
			comp2=b.get(1);
			if(comp1>comp2)
			{
				for(j=0;j<(N-1);j++)
				{
					comp3=b.get(j);
					comp4=b.get(j+1);
					if(comp3>comp4)
						cont1++;
				}
			}
			else
			{
				for(j=0;j<(N-1);j++)
				{
					comp3=b.get(j);
					comp4=b.get(j+1);
					if(comp3<comp4)
						cont1++;
				}
			}
			comp1=c.get(0);
			comp2=c.get(1);
			if(comp1>comp2)
			{
				for(j=0;j<(N-1);j++)
				{
					comp3=c.get(j);
					comp4=c.get(j+1);
					if(comp3>comp4)
						cont2++;
				}
			}
			else
			{
				for(j=0;j<(N-1);j++)
				{
					comp3=c.get(j);
					comp4=c.get(j+1);
					if(comp3<comp4)
						cont2++;
				}
			}
			}
			if(cont1==(N-1) || cont2==(N-1) || N==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}