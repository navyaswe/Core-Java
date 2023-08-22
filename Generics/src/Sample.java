class Generic<T>{
	T obj;
	Generic(T obj){
		this.obj = obj;
	}
	public void show() {
		System.out.println("Object type is:"+obj.getClass().getName());
	}
	public T getObject() {
		return obj;
	}
}
public class Sample {

	public static void main(String[] args) {
		Generic<Integer> g1 = new Generic<Integer>(10);
		g1.show();
		System.out.println(g1.getObject());
		
		Generic<String> g2 = new Generic<String>("Java");
		g2.show();
		System.out.println(g2.getObject());
	}

}
