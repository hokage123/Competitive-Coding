//Two pointer approach
import java.io.*;
import java.util.*;
class DivisibilitybyEight
{
	public static void main(String[] d)
	{
		Scanner sc=new Scanner(System.in);
		char ch[]=sc.next().toCharArray();
		int first[]=new int[10],c=0,i,j,k;
		int last[]=new int[10];
		int n=ch.length;
		LinkedHashSet<Integer> divornot=new LinkedHashSet<>();
		for(i=0;i<10;i++)
		{
			first[i]=-1;
			last[i]=-1;
		}
		for(i=0;i<n;i++)
		{
			if(first[ch[i]-'0']==-1)
			{
				first[ch[i]-'0']=i;
				last[ch[i]-'0']=i;
			}
			else
				last[ch[i]-'0']=i;
		}
		for(i=0;i<10;i++)
		{
			if(first[i]!=-1)
				divornot.add(i);
		}
		for(i=1;i<10;i++)
			for(j=1;j<10;j++)
			{
				if(first[i]!=-1 && first[j]!=-1)
				{
					if(first[i]<last[j])
						divornot.add((10*i+j));
					if(first[j]<last[i])
						divornot.add((10*j+i));
				}
			}
		for(i=1;i<10;i++)
			for(j=1;j<10;j++)
				for(k=0;k<n;k++)
				{
					if(first[i]!=-1 && first[j]!=-1)
					{
						if(first[i]<k && last[j]>k)
							divornot.add(((100*i)+(10*(ch[k]-'0'))+j));
						 if(first[j]<k && last[i]>k)
							divornot.add(((100*j)+(10*(ch[k]-'0'))+i));	
					}
				}
		for(int g:divornot)
		{
			//System.out.println(g);
			if(g%8==0)
			{
				c=1;
				System.out.println("YES");
				System.out.println(g);
				break;
			}
		}
		if(c==0)
			System.out.println("NO");	
	}
}