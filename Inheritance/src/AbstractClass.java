
abstract class Loan{
	
	abstract public void dispAmt();
}
class HomeLoan extends Loan{

	@Override
	public void dispAmt() {
		System.out.println("Home Loan details");
		
	}}

public class AbstractClass {

	public static void main(String[] args) {
		//Loan l = new Loan(); -- abstract class not allows to create objects
		Loan l = new HomeLoan(); // abstract class reference 
		

	}

}
