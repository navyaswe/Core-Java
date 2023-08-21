
public class VarArgs {
	public void add(int...x) { // add(int ...x) or add(int ... x) also works 
		int sum = 0;
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		VarArgs v = new VarArgs();
		v.add();
		v.add(10);
		v.add(10,20,30);
		

	}

}
