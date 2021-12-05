import java.io.*;
import java.util.*;
class ObtainingtheString
{
	public static void main(String[] s)
	{
		int n,count=0,i,j,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<Integer> ar=new ArrayList<>();
		char ch[]=sc.next().toCharArray();
		char ch1[]=sc.next().toCharArray();
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				while(j<n && ch[j]!=ch[i])
					j++;
				if(j>=n)
				{
					count=-1;
					break;
				}
				for(k=j;k>i;k--)
				{
					ar.add(k);
					swap=ch[k];
					ch[k]=ch[k-1];
					ch[k-1]=swap;
				}
				if(a[k]==a[i])
					break;
			}
			if(count==-1)
				break;
		}
		if(count==0)
		{
			System.out.println(ar.size());
			for(int u:ar)
				System.out.print(u+" ");
		}
		else
		{
			System.out.println("-1");
		}
	}
}