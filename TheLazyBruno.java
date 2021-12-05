import java.util.*;
import java.io.*;
class TheLazyBruno
{
public static void main(String[] o)throws IOException
{
int T,n,i,j;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
n=sc.nextInt();
Integer m=n;
sb=sb.append(Integer.bitCount(m)+"\n");
}
bw.write(sb.toString());
bw.close();
}
}