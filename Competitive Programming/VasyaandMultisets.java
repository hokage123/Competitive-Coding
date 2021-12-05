import java.io.*;
import java.util.*;
class VasyaandMultisets
{
	public static void main(String[] u)
	{
		int a[]=new int[101],n,i,even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int b[]=new int[n+1];
		String s="";
		for(i=1;i<=n;i++)
		{
			b[i]=sc.nextInt();
			a[b[i]]++;
		}
		for(i=1;i<=100;i++)
			if(a[i]==1)
				even++;
		if(even%2==0)
		{
			System.out.println("YES");
			for(i=1;i<=n;i++)
			{
				if(a[b[i]]==1 && odd%2==0)
				{
					s+="B";
					odd++;
				}
				else if(a[b[i]]==1 && odd%2==1)
				{
					s+="A";
					odd++;
				}
				else
					s+="A";
			}
			System.out.println(s);
		}
		else
		{
			int set=-1;
			for(i=1;i<=n;i++)
			{
				if(a[b[i]]%2==1 && a[b[i]]>1)
				{
					set=i;
					break;
				}
			}
			if(set==-1)
				System.out.println("NO");
			else
			{
			for(i=1;i<=n;i++)
			{
				if(a[b[i]]==1 && odd%2==0)
				{
					s+="B";
					odd++;
				}
				else if(a[b[i]]==1 && odd%2==1)
				{
					s+="A";
					odd++;
				}
				else if(set==i)
				{
					s+="A";
				}
				else if(b[i]==b[set])
					s+="B";
				else
					s+="A";
			}
			System.out.println(s);
			}
			}
		}	
	}