import java.io.*;
import java.util.*;
class GudduandhisMother
{
	static class SegmentTree1
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
	return getsum(start,mid,l,r,((2*treeindex)+1))^getsum(mid+1,end,l,r,((2*treeindex)+2));
	}
}
public static void main(String[] d)throws IOException
{
int N,T,ar[],i,sum,j,k,t;
Scanner sc=new Scanner(System.in);
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
T=sc.nextInt();
for(t=0;t<T;t++)
{

	N=sc.nextInt();
	ar=new int[N];
	for(i=0;i<N;i++)
		ar[i]=sc.nextInt();
	SegmentTree1 st=new SegmentTree1(ar,N);
	for(i=0;i<N;i++)
		for(j=(j+1);j<N;j++)
			for(k=(j+1);k<N;k++)
			{
				int a=st.getsum(0,N,i,j,0);
				int b=st.getsum(0,N,j,k,0);
				if(a==b)
					sum++;
			}
			bw=bw.append(sum+"/n");
}
bw.write(sb.toString());
bw.close();
}
public static  int getsum(SegmentTree1 st,int N,HashSet hs,int i,int j)
{
	String m=(i+" "+j);
	if(i==j)
		return 0;
	if(!hs.contains(m))
	{
		hs.add(m);
		for(int k=i;k<j;k++)
		{
			int a=st.getsum(0,N,i,k,0);
			int b=st.getsum(0,N,(k+1),j,0);
			if(a==b)
				return (1+getsum(st,hs,i,k)+getsum(st,hs,(k+1),j));
		}
	}
	return 0;
}
}