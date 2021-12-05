import java.io.*;
import java.util.*;
class SegmentTree1
{
int tree[],flag;
SegmentTree1(int ar[],int n)
{
int height=(int)(Math.ceil(Math.log(n)/Math.log(2))+1);
int size=(int)((2*Math.pow(2,height))-1);
flag=height%2;
tree=new int[size];
buildMyTree(0,n-1,ar,0,0);
}
void buildMyTree(int start,int end,int ar[],int treeindex,int count)
{
if(start==end)
tree[treeindex]=ar[start];
else
{
int mid=((start+end)/2);
buildMyTree(start,mid,ar,((2*treeindex)+1),count+1);
buildMyTree((mid+1),end,ar,((2*treeindex)+2),count+1);
if(flag==0 && count%2!=0)
tree[treeindex]=(tree[((2*treeindex)+1)]^tree[((2*treeindex)+2)]);
else if(flag==0 && count%2==0)
tree[treeindex]=(tree[((2*treeindex)+1)]|tree[((2*treeindex)+2)]);
else if(flag==1 && count%2!=0)
tree[treeindex]=(tree[((2*treeindex)+1)]|tree[((2*treeindex)+2)]);
else if(flag==1 && count%2==0)
tree[treeindex]=(tree[((2*treeindex)+1)]^tree[((2*treeindex)+2)]);
}
}
int getsum(int start,int end,int l,int r,int treeindex)
{
if(start>=l && end<=r)
return tree[treeindex];
else if(start>r || end<l)
return 0;
int mid=((start+end)/2);
return getsum(start,mid,l,r,((2*treeindex)+1))+getsum(mid+1,end,l,r,((2*treeindex)+2));
}
void update(int start,int end,int index,int diff,int treeindex,int count)
{
if(index<start || index>end)
return;
if(start==end && end==index)
{	
tree[treeindex]=diff;
return;
}
else
{
int mid=((start+end)/2);
update(start,mid,index,diff,((2*treeindex)+1),count+1);
update((mid+1),end,index,diff,((2*treeindex)+2),count+1);
if(flag==0 && count%2!=0)
tree[treeindex]=(tree[((2*treeindex)+1)]^tree[((2*treeindex)+2)]);
else if(flag==0 && count%2==0)
tree[treeindex]=(tree[((2*treeindex)+1)]|tree[((2*treeindex)+2)]);
else if(flag==1 && count%2!=0)
tree[treeindex]=(tree[((2*treeindex)+1)]|tree[((2*treeindex)+2)]);
else if(flag==1 && count%2==0)
tree[treeindex]=(tree[((2*treeindex)+1)]^tree[((2*treeindex)+2)]);
}
}
void update(int ar[],int n,int index,int newval)
{
if(index<0 || index>(n-1))
return;
update(0,(n-1),index,newval,0,0);
}
public static void main(String[] d)throws IOException
{
int N,Q,ar[],i;
Scanner sc=new Scanner(System.in);
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
N=sc.nextInt();
Q=sc.nextInt();
ar=new int[(int)(Math.pow(2,N))];
for(i=0;i<ar.length;i++)
ar[i]=sc.nextInt();
SegmentTree1 st=new SegmentTree1(ar,ar.length);
for(i=0;i<Q;i++)
{
st.update(ar,ar.length,(sc.nextInt()-1),sc.nextInt());
sb=sb.append(st.tree[0]+"\n");
}
bw.write(sb.toString());
bw.close();
}
}