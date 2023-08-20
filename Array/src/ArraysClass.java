import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		/*int[] a=new int[5];
		Arrays.fill(a, 10);
		for(int i:a)
		System.out.print(i+" ");
		
		int[] a= {1,2,3,5,8,9};
		Arrays.fill(a,1,3,9);
		for(int i:a)
			System.out.print(i+" ");
		
		//sort using Arrays method
		int[] a= {10,2,3,5,8,5,9};
		Arrays.sort(a);
		for(int i:a)
			System.out.print(i+" ");
		*/
		
		//binary search
		int[] a= {15,20,65,80,45};
		//int result=Arrays.binarySearch(a,65);
		int result=Arrays.binarySearch(a,70);
		System.out.println(result);
	}

}
