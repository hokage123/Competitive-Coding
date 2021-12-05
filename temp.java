import java.util.*;
import java.io.*;
class FakeSort
{
	static int  c=0;
	static class FastReader
{
	BufferedReader bf;
	StringTokenizer st;
	public FastReader()
	{
		bf=new BufferedReader(new InputStreamReader(System.in));
	}
	String next()
	{
	while(st==null || !st.hasMoreElements())
	{
		try
		{
			st=new StringTokenizer(bf.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		return st.nextToken();
	}
	int nextInt()
	{
		return Integer.parseInt(next());
	}
	float nextFloat()
	{
		return Float.parseFloat(next());
	}
	long nextLong()
	{
		return Long.parseLong(next());
	}
	double nextDouble()
	{
		return Double.parseDouble(next());
	}
	String nextLine()
	{
		String str="";
		try
		{
			str=bf.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return str;
	}
}
public static void main(String[] d)throws IOException
{
int T,N,C[],i,j,k,count;
Anji[] A;
FastReader sc=new FastReader();
T=sc.nextInt();
StringBuilder sb=new StringBuilder();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
for(i=0;i<T;i++)
{
count=0;
N=sc.nextInt();
A=new Anji[N];
C=new int[N];
for(j=0;j<N;j++)
A[j]=new Anji(sc.nextInt(),(j+1));
Comparator<Anji> m=new Meow();
Arrays.sort(A,m);
for(j=0;j<N;j++)
C[j]=(A[j].ele*(Math.abs((j+1)-A[j].ind)));
//count(C,0,(C.length-1));
sb=sb.append(""+mergeSort(C, C.length)).append("\n");
c=0;
}
bw.write(sb.toString());
bw.close(); 
}
 static int mergeSort(int arr[], int array_size) 
    { 
        int temp[] = new int[array_size]; 
        return _mergeSort(arr, temp, 0, array_size - 1); 
    } 
       
    /* An auxiliary recursive method that sorts the input array and 
      returns the number of inversions in the array. */
    static int _mergeSort(int arr[], int temp[], int left, int right) 
    { 
      int mid, inv_count = 0; 
      if (right > left) 
      { 
        /* Divide the array into two parts and call _mergeSortAndCountInv() 
           for each of the parts */
        mid = (right + left)/2; 
       
        /* Inversion count will be sum of inversions in left-part, right-part 
          and number of inversions in merging */
        inv_count  = _mergeSort(arr, temp, left, mid); 
        inv_count += _mergeSort(arr, temp, mid+1, right); 
       
        /*Merge the two parts*/
        inv_count += merge(arr, temp, left, mid+1, right); 
      } 
      return inv_count; 
    } 
       
    /* This method merges two sorted arrays and returns inversion count in 
       the arrays.*/
    static int merge(int arr[], int temp[], int left, int mid, int right) 
    { 
      int i, j, k; 
      int inv_count = 0; 
       
      i = left; /* i is index for left subarray*/
      j = mid;  /* j is index for right subarray*/
      k = left; /* k is index for resultant merged subarray*/
      while ((i <= mid - 1) && (j <= right)) 
      { 
        if (arr[i] <= arr[j]) 
        { 
          temp[k++] = arr[i++]; 
        } 
        else
        { 
          temp[k++] = arr[j++]; 
       
         /*this is tricky -- see above explanation/diagram for merge()*/
          inv_count = inv_count + (mid - i); 
        } 
      } 
       
      /* Copy the remaining elements of left subarray 
       (if there are any) to temp*/
      while (i <= mid - 1) 
        temp[k++] = arr[i++]; 
       
      /* Copy the remaining elements of right subarray 
       (if there are any) to temp*/
      while (j <= right) 
        temp[k++] = arr[j++]; 
       
      /*Copy back the merged elements to original array*/
      for (i=left; i <= right; i++) 
        arr[i] = temp[i]; 
       
      return inv_count; 
    } 
}
class Anji 
{
int ele;
int ind;
Anji(int ele,int ind)
{
this.ele=ele;
this.ind=ind;
}
}
class Meow implements Comparator<Anji>
{
@Override
public int compare(Anji a1,Anji a2)
{
Integer i1=a1.ele;
Integer i2=a2.ele;
return i1.compareTo(i2);
}
} 