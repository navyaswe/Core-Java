import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		 int[] a= {10,30,40,38,70};
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter key value:");
		 int k=sc.nextInt();
		 boolean b=true;
		    for(int i=0;i<a.length;i++) {
		    	if(k==a[i]) {
		    	    
		    		System.out.println("Key found"+k);
		    		b=false;
		    		break;
		    	}
		    }
		    	if(b==true)
		    	System.out.println("Key not found");
		    	
		    
		    

	}

}
