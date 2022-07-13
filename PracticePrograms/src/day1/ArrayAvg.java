package day1;

public class ArrayAvg {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4},arr2[]= {5,6,7,8};
		int sum1=0,sum2=0,sum3=0;
		int sum[]=new int[4];    
		
		System.out.println("the 1st array is:");
		for (int i=0;i<=arr1.length-1;i++)
		System.out.print(arr1[i]+" ");
	
		System.out.println("\nthe 2nd array is:");
		for (int i=0;i<=arr2.length-1;i++)
			System.out.print(arr2[i]+" ");
		System.out.println();
			
			for (int i=0;i<=arr1.length-1;i++)
				{
				sum1=sum1+arr1[i];
			   
			    sum2=sum2+arr2[i];}
			 System.out.println("avg of 1st array is:"+sum1/4);
		        System.out.println("avg of 2nd array is:"+sum2/4);
		        
		
			System.out.println("the sum of given 2 arrays is:");
		    for (int i=0;i<=sum.length-1;i++)
			{
			 sum[i]=arr1[i]+arr2[i];
		     System.out.print(sum[i]+" ");
		     sum3=(sum3+sum[i]);
		     }
		     System.out.println("\navg of sum array is:"+sum3/4);
	        

 }
}
