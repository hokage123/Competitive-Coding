import java.util.Scanner;
class SparseArrays
{
public static void main(String[] r)
{
String strings[],queries[];
int n,q,i,ans[],j;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
strings=new String[n]; 
for(i=0;i<n;i++)
strings[i]=sc.nextLine();
q=sc.nextInt();
queries=new String[q];
ans=new int[q];
for(i=0;i<q;i++)
queries[i]=sc.nextLine();
for(i=0;i<q;i++)
for(j=0;j<n;j++)
{
	if(queries[i].equals(strings[j]))
	ans[i]=ans[i]+1;
}
for(i=0;i<q;i++)
System.out.println(ans[i]);	
}
}