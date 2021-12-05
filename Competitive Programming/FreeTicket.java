import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedHashMap;
class FreeTicket
{
public static void main (String[] d)
{
int C,F,i,min=0,mymin=0,m=0,j=0;
LinkedHashMap<Path,Integer> map=new LinkedHashMap<>();
ArrayList<Path> myobjs=new ArrayList<>();
Scanner sc=new Scanner(System.in);
cC=sc.nextInt();
F=sc.nextInt();
for(i=0;i<F;i++)
{
	myobjs.add(new Path(sc.nextInt(),sc.nextInt()));
map.put(myobjs.get(i),sc.nextInt());
}
for(i=0;i<(F-1);i++)
{
	min=0;
		m=i;
		for(j=0;j<F;j++)
		{	
			if(myobjs.get(i).y==myobjs.get(j).x)
			{	
			if(min==0)
			min=(map.get(myobjs.get(j)));
			else if(min>(map.get(myobjs.get(j))))
			min=(map.get(myobjs.get(j)));
		}
			
		}
		mymin+=min;
	}

System.out.println(mymin);	
}
}
class Path
{
int x;
int y;
Path(int x,int y)
{
	this.x=x;
	this.y=y;
}
public boolean equals(Object o)
{
Path p=(Path)o;
if(this.x==p.x && this.y==p.y)
return true;
else if(this.y==p.x && this.x==p.y)
return true;
else
return false;
}
public int hashCode()
{
if(x>y)
return 10*x+y;
else
return 10*y+x;
}
}