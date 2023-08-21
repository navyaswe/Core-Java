
public class ForEach {

	public static void main(String[] args) {
		//1D-Array
		//int[] a=new int[5];
		/*int[] a= {10,20,30,40,50};
		for(int n:a) {
			System.out.println(n);
		}
		
		//2D-Regular
				int[][] a= {{10,20},{30,40},{60,70}};
				for(int n[]:a){
					for(int i:n) {
						System.out.print(i+" ");
					}
					System.out.println();
				}

		//2D-Jagged
		int[][] a= {{10,20},{30,40,50},{60,70}};
		for(int n[]:a){
			for(int i:n) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//3D-Regular
		int[][][] a= {{{10,20,30},{40,50,60}}};
		for(int n[][]:a){
			for(int i[]:n) {
				for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
		
		int[] a= {1,2,3,4,5};
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
}
		
		int[] a= {1,2,3,4,5};
		for(int i=0;i<a.length;i=i+2) {
			System.out.print(a[i]+" ");
}*/
		//class of an array
		int[] a=new int[4];
		int[][] b=new int[3][];
		char[] c=new char['s'];
		float[] f=new float[10];
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
		System.out.println(f.getClass().getName());
		
}
}

