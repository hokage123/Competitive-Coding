import java.math.BigInteger;
import java.util.Scanner;
class BobAndPallindromes
{
public static void main(String... s)
{
int T,n,i,j;
BigInteger B,B1=new BigInteger("26"),B2=new BigInteger("1"),B3=new BigInteger("2"),B4=new BigInteger("2"),B5=new BigInteger("1000000007"),Ans[];
Scanner sc=new Scanner(System.in);
T=sc.nextInt();
Ans=new BigInteger[T];
for(i=0;i<T;i++)
{
n=sc.nextInt();
B=new BigInteger("1");
for(j=1;j<=n/2;j++)
{
 if(j<n/2)
B=((B.multiply(B1)).add(B3));
else
{
if(n%2==0)
B=((B.multiply(B1)).add(B2));
else
B=((B.multiply(B1)).add(B3));
}
}
Ans[i]=((B.multiply(B1.pow(n/2).modInverse(B5))).mod(B5));
}
for(i=0;i<T;i++)
System.out.println(Ans[i]);
}
}