import java.io.*;
import java.util.*;
class PreciousStones
{
public static void main(String[] s)throws IOException
{
int T,N,M,i;
Scanner sc=new Scanner(System.in);
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
T=sc.nextInt();
for(i=0;i<T;i++)
{
N=sc.nextInt();
M=sc.nextInt();
if((N+M)<3)
sb=sb.append("0.000000").append("\n");
else
sb=sb.append("1.000000").append("\n");
}
bw.write(sb.toString());
bw.close();
}
}