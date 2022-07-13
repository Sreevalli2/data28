package day1;

public class arrayconcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4},arr2[]= {5,6,7,8};
		int conarr[]=new int[arr1.length+arr2.length];
		int count=0;
		System.out.println("the 1st array is:");
		for (int i=0;i<=arr1.length-1;i++)
		System.out.print(arr1[i]+" ");
	
		System.out.println("\nthe 2nd array is:");
		for (int i=0;i<=arr2.length-1;i++)
			System.out.print(arr2[i]+" ");
		System.out.println("\nthe conacatenated array is:");

		for (int i=0;i<arr1.length ;i++)
			{conarr[count]=arr1[i];	
		count++;
		}
	    for(int j=0;j<arr2.length;j++) 
	    	conarr[count++]=arr2[j];			
	    
	for(int m=0;m<conarr.length;m++)
		System.out.print(conarr[m]+" ");

}
}
