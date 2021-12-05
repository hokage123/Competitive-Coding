import java.io.*;
import java.util.*;
class VasyaAndPassword
{
	public static void main(String[] s)
	{
		int T,i,j,digi,caps,smalls;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			digi=0;
			caps=0;
			smalls=0;
			String u=sc.next();
			char ch[]=u.toCharArray();
			for(j=0;j<ch.length;j++)
			{
				if(ch[j]>='0' && ch[j]<='9')
					digi++;
				if(ch[j]>='A' && ch[j]<='Z')
					caps++;
				if(ch[j]>='a' && ch[j]<='z')
					smalls++;
			}
			if(digi==0 && caps>1 && smalls>1)
			{
				ch[0]='0';
			}
			else if(digi==0 && caps>1 && smalls==1)
			{
				for(j=0;j<ch.length;j++)
				{
					if(ch[j]>='A' && ch[j]<='Z')
					{
						ch[j]='0';
						break;
					}
				}
			}
			else if(digi==0 && caps==1 && smalls>1)
			{
				for(j=0;j<ch.length;j++)
				{
					if(ch[j]>='a' && ch[j]<='z')
					{
						ch[j]='0';
						break;
					}
				}
			}
			else if(smalls==0 && caps>1 && digi>1)
			{
				ch[0]='a';
			}
			else if(smalls==0 && caps>1 && digi==1)
			{
				for(j=0;j<ch.length;j++)
				{
					if(ch[j]>='A' && ch[j]<='Z')
					{
						ch[j]='a';
						break;
					}
				}
			}
			else if(smalls==0 && caps==1 && digi>1)
			{
				for(j=0;j<ch.length;j++)
				{
					if(ch[j]>='0' && ch[j]<='9')
					{
						ch[j]='a';
						break;
					}
				}
			}
			else if(caps==0 && smalls>1 && digi>1)
			{
				ch[0]='A';
			}
			else if(caps==0 && smalls==1 && digi>1)
			{
				for(j=0;j<ch.length;j++)
				{
					if(ch[j]>='0' && ch[j]<='9')
					{
						ch[j]='A';
						break;
					}
				}
			}
			else if(caps==0 && smalls>1 && digi==1)
			{
				for(j=0;j<ch.length;j++)
				{
					if(ch[j]>='a' && ch[j]<='z')
					{
						ch[j]='A';
						break;
					}
				}
			}
			else if(digi==0 && smalls==0 && caps>1)
			{
				ch[0]='a';
				ch[1]='0';
			}
			else if(digi==0 && smalls>1 && caps==0)
			{
				ch[0]='A';
				ch[1]='0';
			}
			else if(digi>1 && smalls==0 && caps==0)
			{
				ch[0]='a';
				ch[1]='A';
			}
			System.out.println(new String(ch));
		}
	}
}