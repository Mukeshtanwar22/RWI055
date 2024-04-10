class ThirdLargest
{  
	public static int getThirdLargest(int[] a, int total)
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
       return a[total-3];  
}  
		public static void main(String args[])
		{  
			int a[]={1,2,5,6,3,2};  
			System.out.println("Third Largest: "+getThirdLargest(a,6));  
}}  