//greedy array
import java.io.*;
import java.util.*;
class Joysticks
{
	public static void main(String[] o)
	{
		int n1,n2,i,j;
		int a[][]=new int[202][];
		for(i=0;i<=201;i++)
			a[i]=new int[202];
		for(i=0;i<=201;i++)
			for(j=0;j<=201;j++)
				a[i][j]=0;
		for(i=2;i<=201;i++)
		{
			//a[i][0]=0;
			if(i==2)
				a[1][i]=1;
			else if(i%3==0)
				a[1][i]=(1+a[1][i-1]);
			else if((i-1)%3==0)
				a[1][i]=a[1][i-1];
			else
				a[1][i]=(a[1][i-1]+2);
		
		}
		for(i=2;i<=201;i++)
		{
			//a[0][i]=0;
			a[i][1]=a[1][i];
		}
		//for(i=0;i<=100;i++)
			//a[i][i]=i;
		for(i=2;i<=100;i++)
			for(j=i;j<=100;j++)
			{
				if(i==2 && j==2)
					a[i][j]=1;
				else if(i%2!=0)
					a[i][j]=((i/2)+a[1][j+(i/2)]);
				else if(j%2!=0)
					a[i][j]=((j/2)+a[1][i+(j/2)]);
				else if(i>j)
					a[i][j]=(1+(((j+1)/2))+a[1][i-2+((j+1)/2)]);
				else
					a[i][j]=(1+(((i+1)/2))+a[1][j-2+((i+1)/2)]);
				//if(j==0)
				//System.out.println(a[i][j]+" ");
				//else
				//System.out.print(a[i][j]+" ");
				a[j][i]=a[i][j];
			}
		Scanner sc=new Scanner(System.in);	
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println(a[n1][n2]);	
	}
}