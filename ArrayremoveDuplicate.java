import java.util.Arrays;
class RemoveDuplicate
{
	public static int Remove(int a[],int n)
	{
		if(n==0||n==1)
			return n;
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		
		for(int i=0;i<j;i++)
		{
			a[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] mk)
	{
		int A[]={44,2,35,1,47,85,25,34,76,64,1,44,35,47};
		Arrays.sort(A);
		int Length=A.length;
		for(int i=0;i<Length;i++)
		{
			System.out.println(A[i]+" ");
		}
		Length=Remove(A,Length);
		for(int i=0;i<Length;i++)
		{
			System.out.println(A[i]+" ");
		}
	}
}