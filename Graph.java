import java.util.*;
import java.io.*;
public class Graph
{
int V,i;
LinkedList<Integer> ar[];
public Graph(int v)
{
V=v;
ar=new LinkedList[V];
for(i=0;i<V;i++)
ar[i]=new LinkedList<Integer>();
}
public void addEdge(int u,int v,boolean bidir)
{
Integer V=v;
Integer U=u;
if(bidir==true)
{
ar[u].add(V);
ar[v].add(U);
else
{
ar[u].add(V);
}
}
public void printAdjacencyList()
{
for(i=0;i<ar.length;i++)
{
System.out.print(i+"->");
for(Integer s:ar[i])
System.out.print(s.toString()+",");
System.out.println();
}
}
public void BFS()
{
	int visit[]=new int[V];
	ArrayList<Integer> bfs=new ArrayList<>();
	bfs.add(0);
	while(bfs.size()!=0)
	{
	if(!(visit[bfs.get(0)]==1))
	{
		visit[bfs.get(0)]=1;
		bfs.add(bfs.get(0));
		for(Integer s:ar[bfs.get(0)])
		{
			if(!(visit[s]==1))
			bfs.add(s);
		}
	System.out.println(bfs.get(0));
		//bfs.remove(0);	
	}
	bfs.remove(0);
	}
}
public void BFS(int k)
{
	int visit[]=new int[V];
	ArrayList<Integer> bfs=new ArrayList<>();
	bfs.add(k);
	while(bfs.size()!=0)
	{
	if(!(visit[bfs.get(0)]==1))
	{
		visit[bfs.get(0)]=1;
		bfs.add(bfs.get(0));
		for(Integer s:ar[bfs.get(0)])
		{
			if(!(visit[s]==1))
			bfs.add(s);
		}
	System.out.println(bfs.get(0));
		//bfs.remove(0);	
	}
	bfs.remove(0);
	}
}
public int shortpathusingBFS()
{
	for(i=0;i<ar.length;i++)
}
public static void main(String[] s)
{
Graph g=new Graph(5);
g.addEdge(0,1,true);
g.addEdge(0,4,true);
g.addEdge(4,3,true);
g.addEdge(1,4,true);
g.addEdge(1,2,true);
g.addEdge(2,3,true);
g.addEdge(1,3,true);
g.printAdjacencyList();
g.BFS();
g.shortpathusingBFS();
}
}