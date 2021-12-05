import java.util.*;
import java.io.*;
class MishkaandContest
{
	public static void main(String[] d)
	{
		int n,k,i,count1=0,count2=0,a;
		ArrayList<Integer> ar=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			ar.add(sc.nextInt());
		}
		for(i=0;i<n;i++)
		{
			a=ar.get(i);
			if(a<=k)
				count1++;
			else
				break;
		}
		for(i=(n-1);i>=0;i--)
		{
			a=ar.get(i);
			if(a<=k)			
				count2++;
			else
				break;
		}
		if((count1+count2)>=n)
			System.out.println(n);
		else
			System.out.println((count1+count2));
	}
}