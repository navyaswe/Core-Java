import java.util.*;

public class Launch1 {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		 // 1D array
		int[] a=new int[5];
		System.out.println("enter values:");
		for(int i=0;i<a.length;i++) {
			
			//System.out.print("Enter values:");
			a[i]=sc.nextInt();
		}
		System.out.println("values are:");
		for(int i=0;i<a.length;i++) {
			//System.out.print("values are:");
			System.out.print(a[i]+" ");
		}
		//2D-Regular
		int[][] a=new int[2][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.println("Enter values for position"+i+"with location"+j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("values are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]+" ");
				}
        }
		//2D-Jagged
		int[][] a=new int[2][];
		a[0]=new int[4];
		a[1]=new int[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.println("Enter values for position"+i+"with location"+j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("values are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]+" ");
				}
        }
		//3D-Regular
				int[][][] a=new int[2][3][2];
				
				Scanner sc=new Scanner(System.in);
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						for(int k=0;k<a[i][j].length;k++) {
						
						System.out.println("Enter values for position"+i+"with location"+j+"with another"+k);
						a[i][j][k]=sc.nextInt();
					}
				}
			}
				System.out.println("values are:");
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						for(int k=0;k<a[i][j].length;k++) {
						
						System.out.print(a[i][j][k]+" ");
						}
		        }
	}*/
		//3D-Jagged
		int [][][]a=new int[2][3][];
		a[0][0]=new int[3];
		a[0][1]=new int[2];
		a[0][2]=new int[3];
		a[1][0]=new int[4];
		a[1][1]=new int[2];
		a[1][2]=new int[3];
		
		
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
				
				System.out.println("Enter values for position"+i+"with location"+j+"with another"+k);
				a[i][j][k]=sc.nextInt();
			}
		}
	}
		System.out.println("values are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
				
				System.out.print(a[i][j][k]+" ");
				}
        }
}
	
}
}