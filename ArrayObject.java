class Product{
	String name;
	int cost;
	
}

public class ArrayObject {

	public static void main(String[] args) {
		Product[] p=new Product[2];
		p[0]=new Product();
		p[1]=new Product();
		p[0].name="Textiles";
		p[1].cost=2500;
		System.out.println(p[0].name);
		System.out.println(p[0].cost);
		System.out.println(p[1].name);
		System.out.println(p[1].cost);
		

	}

}
