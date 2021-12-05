import java.io.*;
import java.util.*;
class ZeroArray
{
static class SegmentTree
{
long tree[];
SegmentTree(long ar[],int n)
{
int height=(int)(Math.ceil(Math.log(n)/Math.log(2))+1);
int size=(int)(2*(Math.pow(2,height))-1);
tree=new long[size];
buildMyTree(0,n-1,ar,0);
}
void buildMyTree(int start,int end,long ar[],int treeindex)
{
if(start==end)
tree[treeindex]=ar[start];
else
{
int mid1=((start+end)/2);
buildMyTree(start,mid1,ar,((2*treeindex)+1));
buildMyTree((mid1+1),end,ar,((2*treeindex)+2));
tree[treeindex]=(tree[((2*treeindex)+1)]+tree[((2*treeindex)+2)]);
}
}
long getsum(int start,int end,int l,int r,int treeindex)
{
if(start>=l && end<=r)
return tree[treeindex];
else if(start>r || end<l)
return 0;
int mid1=((start+end)/2);
return getsum(start,mid1,l,r,((2*treeindex)+1))+getsum(mid1+1,end,l,r,((2*treeindex)+2));
}
void update(int start,int end,int index,long diff,int treeindex)
{
if(index<start || index>end)
return;
if(start==end && start==index)
{
	tree[treeindex]+=diff;
	return;
}	
tree[treeindex]+=diff;
int mid1=((start+end)/2);
update(start,mid1,index,diff,((2*treeindex)+1));
update((mid1+1),end,index,diff,((2*treeindex)+2));
}
void update(long ar[],int n,int index,long newval)
{
if(index<0 || index>(n-1))
return;
update(0,(n-1),index,(newval-ar[index]),0);
}
}
public static void main(String[] s)
{
int n,i,count=0,j;
long ar[],sum=0,a;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
ar=new long[n];
for(i=0;i<n;i++)
{	
ar[i]=sc.nextLong();
sum+=ar[i];
}
Arrays.sort(ar);
//SegmentTree st=new SegmentTree(ar,n);
for(i=0;i<n;i++)
{
a=0;	
for(j=i;j<n;j++)
{	
	a+=ar[j];
if((sum-a)==a)
	{
		count=1;
		break;
	}
}
	if(count==1)
		break;
}
if(count==1)
	System.out.println("YES");
else
	System.out.println("NO");
}
}