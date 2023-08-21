
public class VarArgs2 {
	public void m1(int[]...x) {
		for(int[] a:x) {
			for(int b:a) {
				System.out.println(b);
			}
		}
	}

	public static void main(String[] args) {
		VarArgs2 v2 = new VarArgs2();
		int[] i = {10,20,30};
		int[] j = {40,50};
		v2.m1(i,j);

	}

}
