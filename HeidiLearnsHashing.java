import java.io.*;
import java.util.*;
class HeidiLearnsHashing 
{
	public static void main(String[] s)
	{
		int j,count=0;
		long r,x=0,y=0;
		Scanner sc=new Scanner(System.in);
		r=sc.nextLong();
		r--;	
		for(j=1;j<=(1000000);j++)
		{
			if(count==1)
				{
					break;
				}
			if(r%j==0)
			{
				if(((r/j)-(j+1))>0 && ((r/j)-(j+1))%2==0)
				{
					count=1;
					x=j;
					y=(((r/j)-(j+1))/2);
				}
			}
		}
		if(count==1)
		System.out.println(x+" "+y);
		else
        System.out.println("NO");		
	}
}