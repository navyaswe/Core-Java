import java.util.function.Predicate;

class PredicateEx implements Predicate<String>{
	@Override
	public boolean test(String name) {
		if(name.length()>3)
			return true;
		else
			return false;
	}
	
}
public class PredicateClass {

	public static void main(String[] args) {
		Predicate<String> p = name -> name.length()>3;

		System.out.println(p.test("Java"));
		System.out.println(p.test("IT"));
		
		

	}

}
