
public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {10,5,29,15,38,42,30};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j]<a[j-1]) {
					int temp;
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
