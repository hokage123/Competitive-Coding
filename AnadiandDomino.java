import java.util.*;
import java.io.*;
class AnadiandDomino
{
    public static void main(String[] p)
    {
        int m[]=new int[8],i,count=0;
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs=new HashSet<>();
        HashSet<String> hs1=new HashSet<>();
        int n=sc.nextInt();
        int e=sc.nextInt();
        for(i=0;i<e;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int swap=a;
            if(a<b)
            {
                swap=a;
                a=b;
                b=swap;
            }
            String s=a+" "+b;
            hs.add(a);
            hs.add(b);
            if(!hs1.contains(s))
            {
            hs1.add(s);
            m[a]++;
            m[b]++;
            }
        }
        Arrays.sort(m);
        int sum=0;
        for(i=1;i<=7;i++)
        {
            if(m[i]>0)
            count++;
        }
        if(count!=7)
            sum=(hs1.size());
        else
            sum=(hs1.size()-m[1]+1);
        System.out.println(sum);    
    }
}

