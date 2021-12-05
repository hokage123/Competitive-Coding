import java.util.*;
import java.io.*;
class NewBuildingforSIS
{
	public static void main(String[] o)
	{
		int n,h,k,a,b,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		h=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		k=sc.nextInt();
		for(i=0;i<k;i++)
		{
			int b1=sc.nextInt();
			int h1=sc.nextInt();
			int b2=sc.nextInt();
			int h2=sc.nextInt();
			if(b1==b2)
			{
				if(h1>=h2)
					System.out.println((h1-h2));
				else
					System.out.println((h2-h1));
			}
			else
			{
				if((a<=h1 && h1<=b))
				{
					if(h1>=h2)
						System.out.println(((h1-h2)+1));
					else
						System.out.println(((h2-h1)+1));
				}
				else
				{
					if(h1<a)
					{
						int min=(a-h1);
						h1=a;
						if(h1>=h2)
							System.out.println(((h1-h2)+1+min));
						else
							System.out.println(((h2-h1)+1+min));	
					}
					else
					{
						int min=(h1-b);
						h1=b;
						if(h1>=h2)
							System.out.println(((h1-h2)+1+min));
						else
							System.out.println(((h2-h1)+1+min));
					}
				}
			}
		}
	}
}