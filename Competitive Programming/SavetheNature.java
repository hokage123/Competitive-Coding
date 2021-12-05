import java.util.*;
import java.io.*;
class SavetheNature
{
	public static void main(String[] o)
	{
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt(),n,x,a,y,b;
		for(i=0;i<q;i++)
		{
			int count1=-1,count2=-1;
			n=sc.nextInt();
			int arr[]=new int[n];
			for(j=0;j<n;j++)
				arr[j]=sc.nextInt();
			Arrays.sort(arr);
			x=sc.nextInt();
			a=sc.nextInt();
			y=sc.nextInt();
			b=sc.nextInt();
			long k=sc.nextInt();
			int n1=n/a;
			int n2=n/b;
			int min=Integer.min(n1,n2);	
				for(j=0;j<N;j++)
				{
					if(j==(n1+n2))
						break;
					if(a>=b)
					{	
						if(j<(2*min))
						{
							if((j+1)%2==0)
								sum1+=((y*arr[j])/100);
							else
								sum1+=((x*arr[j])/100);
						}
						else
						{
							sum1+=((y*arr[j])/100);
						}
					}
					else
					{
						if(j<(2*min))
						{
							if((j+1)%2==0)
								sum1+=((x*arr[j])/100);
							else
								sum1+=((y*arr[j])/100);
						}
						else
						{
							sum1+=((x*arr[j])/100);
						}
					}
					if(sum1>=k)
					{
						count1=j;
						break;
					}
				}
				for(j=0;j<(N-1);j+=2)
				{
					int swap;
					if(j==(2*min))
						break;
					swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
				}
				for(j=0;j<N;j++)
				{
					if(j==(n1+n2))
						break;
					if(a>=b)
					{	
						if(j<(2*min))
						{
							if((j+1)%2==0)
								sum2+=((y*arr[j])/100);
							else
								sum2+=((x*arr[j])/100);
						}
						else
						{
							sum2+=((y*arr[j])/100);
						}
					}
					else
					{
						if(j<(2*min))
						{
							if((j+1)%2==0)
								sum2+=((x*arr[j])/100);
							else
								sum2+=((y*arr[j])/100);
						}
						else
						{
							sum2+=((x*arr[j])/100);
						}
					}
					if(sum2>=k)
					{
						count2=j;
						break;
					}
				}
	}
}