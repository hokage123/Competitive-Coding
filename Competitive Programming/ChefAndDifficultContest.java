import java.util.*;
import java.io.*;
class ChefAndDifficultContest
{
public static void main(String[] d)throws IOException
{
int i,T,a,b;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
a=sc.nextInt();
b=sc.nextInt();
sb=sb.append("YES"+"\n");
}
bw.write(sb.toString());
bw.close();
}
}