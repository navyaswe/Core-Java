
public class ConstructorClass {
	
	private String name;
	private int cost;
	
	public ConstructorClass(){
		this("KIA",500000);
	}
	ConstructorClass(String name, int cost){
		this.name = name;
		this.cost = cost;
	}
	
	
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}

	public static void main(String[] args) {
		ConstructorClass cc= new ConstructorClass();
		System.out.println(cc.getName());
		System.out.println(cc.getCost());
		ConstructorClass cc1 = new ConstructorClass("BMW",1000000);
		System.out.println(cc1.getName());
		System.out.println(cc1.getCost());

	}

}
