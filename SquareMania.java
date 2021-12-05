import java.util.*;
import java.io.*;
class SquareMania
{
public static void main(String[] d)throws IOException
{
int T,N,i,j;
long count,myvar;
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
for(i=0;i<T;i++)
{
count=0;
N=sc.nextInt();
for(j=0;j<N;j++)
{
myvar=sc.nextLong();	
if(j!=(N-1))	
count+=(5*myvar);
else
count+=(4*myvar);	
}
for(j=0;j<(N-1);j++)
{
	myvar=sc.nextLong();
	count+=myvar;
}
sb=sb.append(count + "\n");
}
bw.write(sb.toString());
bw.close();
}
}