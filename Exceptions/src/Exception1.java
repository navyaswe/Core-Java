import java.util.*;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Division Operation");
		try {
			System.out.println("Enter first number:");
			int n1 = sc.nextInt();
			System.out.println("Enter second number:");
			int n2 = sc.nextInt();
			int result = n1/n2;
			System.out.println(result);

     }catch(ArithmeticException e) {
    	 //System.out.println("Arithmetic Exception raised");
    	 e.printStackTrace();
     }
	  catch(Exception e1) {
    	 System.out.println("Zero divison error");
    	 e1.printStackTrace();
     }finally {
    	 System.out.println("Message");
     }
		System.out.println("Program terminates");
		
	

	}

}
