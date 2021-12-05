import java.math.*;
import java.io.*;
import java.util.*;
class ByteToBit
{
public static void main(String[] e)throws IOException
{
int i,T,N;
long a,b,c;
BigInteger d=new BigInteger("2");
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
	a=0;
	b=0;
	c=0;
N=sc.nextInt();
if(N%26<=2 && N%26>=1)
a=(long)(Math.pow(2,(N/26)));
else if(N%26>2 && N%26<=10)
b=(long)(Math.pow(2,(N/26)));
else if(N%26==0)
c=(long)(Math.pow(2,((N/26)-1)));
else
c=(long)(Math.pow(2,(N/26)));	
sb=sb.append(a+" "+b+" "+c+"\n");
}
bw.write(sb.toString());
bw.close();
}
}