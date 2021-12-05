import java.util.Scanner;
class StandardFlag
{
public static void main(String[] h)
{
int n,m,i,j,c=0;
String d;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
m=sc.nextInt();
sc.nextLine();
int a[][];
a=new int[n][];
for(i=0;i<n;i++)
a[i]=new int[m];
for(i=0;i<n;i++)
{
d=sc.nextLine();
for(j=0;j<m;j++)
a[i][j]=d.charAt(j);
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
	if(j==0)
	{
		if(a[i][j]!=a[i][j+1])
		{
			c=1;
			break;
		}
	}
	else if(j!=m-1)
	{
		if((a[i][j]!=a[i][j-1])||(a[i][j]!=a[i][j+1]))
		{
			c=1;
			break;
		}	
	}
	else if(j==m-1)
	{
		if(a[i][j]!=a[i][j-1])
		{
			c=1;
			break;
		}
	}
	if(i==0)
	{
		if(a[i][j]==a[i+1][j])
		{
			c=1;
			break;
		}
	}
	else if(i!=n-1)
	{
		if((a[i][j]==a[i-1][j])||(a[i][j]==a[i+1][j]))
		{
			c=1;
			break;
		}	
	}
	else if(i==n-1)
	{
		if(a[i][j]==a[i-1][j])
		{
			c=1;
			break;
		}
	}	
}
if(c==1)
break;
}
if(c==1)
System.out.println("NO");
else
System.out.println("YES");
}
}