import java.util.*;
import java.io.*;
class VovaandTrain
{
	public static void main(String[] g)
	{
		int a,b,c,d,t,i,j,m,n;
		long sum=0;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			sum=0;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			m=((d-c+1)/b);
			if((((d%b)+(c%b))>=b ||(d==c && d%b==0)))
				sum--;
			sum+=((a/b)-m);
			System.out.println(sum);
		}
	}
}