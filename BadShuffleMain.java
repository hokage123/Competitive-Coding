import java.util.*;
import java.io.*;
class BadShuffleMain
{
public static void main(String[] d)
{
int i;
Scanner sc=new Scanner(System.in);
int N;
N=sc.nextInt();
for(i=2;i<=(N/2);i++)
System.out.print(i+" ");
System.out.print(1+" ");
for(i=(N/2+2);i<=N;i++)
 System.out.print(i+" ");
 System.out.print((N/2+1)+" ");
 System.out.println();
System.out.print(N+" ");
for(i=1;i<=(N-1);i++) 
System.out.print(i+" ");
}
}