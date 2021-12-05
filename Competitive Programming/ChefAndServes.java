import java.io.*;
import java.util.*;
class ChefAndServes
{
public static void main(String[] d)throws IOException
{
int T,i;
long P1,P2,K;
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
P1=sc.nextLong();
P2=sc.nextLong();
K=sc.nextLong();
if((((P1+P2)/K)%2)==0)
sb=sb.append("CHEF\n");
else
sb=sb.append("COOK\n");
}
bw.write(sb.toString());
bw.close();
}
}