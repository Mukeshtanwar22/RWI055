class SecondLargest
{  
	public static int getSecondLargest(int[] a, int total)
		{  
			for (int i = 0; i < total; i++)   
				{  
					for (int j = i + 1; j < total; j++)   
					{  
						if (a[i] > a[j])   
						{  
							int temp = a[i];  
							a[i] = a[j];  
							a[j] = temp;  
						}  
					}  
				}  
       return a[total-2];  
}  
		public static void main(String args[])
		{  
			int a[]={1,2,5,6,3,2};  
			int b[]={44,66,99,77,33,22,55};  
			System.out.println("Second Largest: "+getSecondLargest(a,6));  
			System.out.println("Second Largest: "+getSecondLargest(b,7));  
		}
}  