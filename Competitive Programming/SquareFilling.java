import java.io.*;
import java.util.*;
class SquareFilling
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int n,m,i,j,count=0;
		HashSet<String> hs=new HashSet<>(); 
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		String sr;
		ArrayList<String> ar=new ArrayList<>();
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				b[i][j]=0;	
			for(i=0;i<n;i++)
				for(j=0;j<m;j++)
				{
					if(a[i][j]==1 && b[i][j]!=1)
					{	
					if((i+1)<n && (j+1)<m )
					{
						if(a[i][j]==1 && a[i][j+1]==1 && a[i+1][j]==1 && a[i+1][j+1]==1)
						{
							sr=((i+1)+" "+(j+1));
							b[i][j]=1;
							b[i+1][j+1]=1;
							b[i+1][j]=1;
							b[i][j+1]=1;
							if(!hs.contains(sr))
							{	
							ar.add(sr);
							hs.add(sr);
							}
						}
					}
					if(b[i][j]!=1 && (i+1)<n && (j-1)>=0)
					{
						if(a[i][j]==1 && a[i][j-1]==1 && a[i+1][j]==1 && a[i+1][j-1]==1)
						{
							sr=((i+1)+" "+(j));
							b[i][j]=1;
							b[i+1][j-1]=1;
							b[i+1][j]=1;
							b[i][j-1]=1;
							if(!hs.contains(sr))
							{	
							ar.add(sr);
							hs.add(sr);
							}
						}
					}
					if(b[i][j]!=1 && (i-1)>=0 && (j-1)>=0)
					{
						if(a[i-1][j-1]==1 && a[i][j-1]==1 && a[i-1][j]==1 && a[i][j]==1)
						{
							sr=((i)+" "+(j));
							b[i][j]=1;
							b[i-1][j-1]=1;
							b[i-1][j]=1;
							b[i][j-1]=1;
							if(!hs.contains(sr))
							{	
							ar.add(sr);
							hs.add(sr);
							}
						}
					}
					if(b[i][j]!=1 && (i-1)>=0 && (j+1)<m)
					{
						if(a[i-1][j]==1 && a[i-1][j+1]==1 && a[i][j]==1 && a[i][j+1]==1)
						{
							sr=((i)+" "+(j+1));
							b[i-1][j]=1;
							b[i-1][j+1]=1;
							b[i][j]=1;
							b[i][j]=1;
							if(!hs.contains(sr))
							{	
							ar.add(sr);
							hs.add(sr);
							}
						}
					}
					}
				}
			for(i=0;i<n;i++)
				for(j=0;j<m;j++)
				{
					if(a[i][j]==b[i][j])
						count++;
				}
			if(count==(n*m))
			{
				System.out.println(ar.size());
				for(String d:ar)
					System.out.println(d);
			}
			else
				System.out.println("-1");
	}
}