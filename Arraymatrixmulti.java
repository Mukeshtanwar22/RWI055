class MatrixAddition
{  
       public static void main(String args[])
	   {  
			int a{{1,1,1},{2,2,2},{3,3,6}};  
			int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
			int c[][]=new int[3][3];  //3 rows and 3 columns  
				for(int i=0;i<3;i++)
				{    
					for(int j=0;j<3;j++)
					{    
						c[i][j]=a[i][j]*b[i][j];    //use - for subtraction  
						System.out.print(c[i][j]+" ");    
					}    
					System.out.println();//new line    
				}    
		}
}  