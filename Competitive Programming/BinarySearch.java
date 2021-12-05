import java.util.*;
public class BinarySearch
{
public static void main(String[] o)
{
int N,i,T;
int[] s,ans;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
s=new int[N];
for(i=0;i<N;i++)
s[i]=sc.nextInt();
T=sc.nextInt();
ans=new int[T];
Arrays.sort(s);
for(i=0;i<T;i++)
ans[i]=binarySearch(s,0,N-1,sc.nextInt());
for(i=0;i<T;i++)
System.out.println(ans[i]);	
}
public  static int binarySearch(int[] s,int i,int j,int a)
{
if(i>j)
return -1;
int m=((i+j)/2);
if(s[m]==a)
return m;
else if(s[m]>a)
return binarySearch(s,i,m-1,a);
else if(s[m]<a)
return binarySearch(s,m+1,j,a);
return -1;
}
}