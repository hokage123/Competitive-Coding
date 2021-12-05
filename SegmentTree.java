import java.io.*;
import java.util.*;
class SegmentTree
{
int tree[];
SegmentTree(int ar[],int n)
{
int height=(int)(Math.ceil(Math.log(n)/Math.log(2))+1);
int size=(int)(2*(Math.pow(2,height))-1);
tree=new int[size];
buildMyTree(0,n-1,ar,0);
}
void buildMyTree(int start,int end,int ar[],int treeindex)
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
int getsum(int start,int end,int l,int r,int treeindex)
{
if(start>=l && end<=r)
return tree[treeindex];
else if(start>r || end<l)
return 0;
int mid1=((start+end)/2);
return getsum(start,mid1,l,r,((2*treeindex)+1))+getsum(mid1+1,end,l,r,((2*treeindex)+2));
}
void update(int start,int end,int index,int diff,int treeindex)
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
void update(int ar[],int n,int index,int newval)
{
if(index<0 || index>(n-1))
return;
update(0,(n-1),index,(newval-ar[index]),0);
}
public static void main(String[] s)
{
int n,i,ar[];
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
ar=new int[n];
for(i=0;i<n;i++)
ar[i]=sc.nextInt();
SegmentTree st=new SegmentTree(ar,n);
for(i=0;i<st.tree.length;i++)
	System.out.println(st.tree[i]);
System.out.println(getsum(0,(N-1),0,(N-1),0));
for(i=0;i<st.tree.length;i++)
	System.out.println(st.tree[i]);
}
}