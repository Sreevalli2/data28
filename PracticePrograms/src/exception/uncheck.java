package exception;

public class uncheck {
	public static void main(String[] args) {
		int a=10,b=0;
		int[] array= {1,2};		
		try{
			int c=a/b;
		System.out.println(c);
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		   e.printStackTrace();			
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		try {
			System.out.println(array[3]);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		   e.printStackTrace();
			
		}
		finally
		{
			System.out.println("closed the operation");
		}
		
	}

}
