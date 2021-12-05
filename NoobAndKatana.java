import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Scanner;
class NoobAndKatana
{
public static void main(String[] g)
{
int N,j,m,mycount,count=0;
//NoobAndKatana d=new NoobAndKatana();
int[] ar;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
ar=new int[N];
for(j=0;j<N;j++)
ar[j]=sc.nextInt();
HashSet s=new HashSet();
for(j=0;j<N;j++)
s.add(ar[j]);	
mycount=s.size();
System.out.println(mycount);
}
}