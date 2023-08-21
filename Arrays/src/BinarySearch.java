import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary search without sorting using while loop
		/*int[] a= {10,20,30,40,50};
		int l=0;
		int h=a.length-1;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter key value:");
		int k=sc.nextInt();
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==k) {
				System.out.println("key found");
				break;
			}
			else if(k<a[m])
				h=m-1;
			else if(k>a[m])
				l=m+1;
		
		}
		
		if(l>h)
			System.out.println("Key not found");*/
		
		// Binary search without sorting using for loop
				int[] a= {10,20,30,40,50};
				int l=0;
				int h=a.length-1;
				boolean b=false;
				Scanner sc=new Scanner(System.in);
				System.out.print("enter key value:");
				int k=sc.nextInt();
				for(int i=l;i<=h;i++) {
					int m=(l+h)/2;
					if(k==a[m]) {
						System.out.println("key found");
						b=true;
						break;
					}
					else if(k>a[m])
						l=m+1;
					else if(k<a[m])
						h=m-1;
					
				}
			if(b==false)
				System.out.println("key not found");
				
				
	}

}

