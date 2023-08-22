import java.util.function.Function;

class myFunc implements Function<String,Integer>{
	@Override
	public Integer apply(String name) {
		return name.length();
	}
}
public class ImplementationClass {

	public static void main(String[] args) {
		Function<String,Integer> f = new myFunc();
		int res = f.apply("Full Stack");
		System.out.println(res);

	}

}
