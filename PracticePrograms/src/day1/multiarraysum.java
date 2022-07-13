package day1;

public class multiarraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]={{1,2},{3,4}}; 
		int arr2[][]= {{5,6,},{7,8}}; 
		int sum[][]=new int[2][2];  
		System.out.println("the 1st array is");
		for(int i=0;i<arr1.length;i++)
			{
			for(int j=0;j<arr1[i].length;j++)
				System.out.print(arr1[i][j]+"\t");
			System.out.println();
			}
		System.out.println("the 2nd array is");
		for(int i=0;i<arr2.length;i++)
			{
			for(int j=0;j<arr2[i].length;j++)
				System.out.print(arr2[i][j]+"\t");	
		System.out.println();
		}	
		System.out.println("the sum of 2 arrays is");
		for(int i=0;i<arr1.length;i++)
			{
			for(int j=0;j<arr1[i].length;j++)
				{
				sum[i][j]=arr1[i][j]+arr2[i][j];
		       System.out.print(sum[i][j]+"\t");
		       }
			System.out.println();
			}
	}

}
