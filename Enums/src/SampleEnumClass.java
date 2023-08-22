enum Gender{
	MALE, FEMALE, OTHERS // All constants should be capitals
}
enum Result{
	PASS,FAIL,NORESULT;
}
public class SampleEnumClass {

	public static void main(String[] args) {
		Result r = Result.PASS;
		System.out.println(r);
		
		Gender g = Gender.FEMALE;
		System.out.println(g);

	}

}
