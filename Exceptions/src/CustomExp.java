import java.util.*;

//Driving License Application

class UnderAgeExp extends Exception{
	public UnderAgeExp(String msg) {
		super(msg);
	}
}

class OverAgeExp extends Exception{
	public OverAgeExp(String msg) {
		super(msg);
	}
}

class Applicant{
	int age;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		age = sc.nextInt();
		
	}
	public void verify() throws UnderAgeExp, OverAgeExp {
		if(age < 18) {
			UnderAgeExp e1 = new UnderAgeExp("Under age!Try later");
			System.out.println(e1.getMessage());
			throw e1;
			
		}
		else if(age > 60){
			OverAgeExp e2 = new OverAgeExp("Not Eligible");
			System.out.println(e2.getMessage());
			throw e2;
		}
		else {
			System.out.println("Eligible");
		}
	}
}

class LicenseOffice{
	public void initiate(){
		Applicant a = new Applicant();
		try {
			a.input();
			a.verify();
		}catch(UnderAgeExp|OverAgeExp ex) {
			try {
				a.input();
				a.verify();
			}catch(UnderAgeExp|OverAgeExp ex1) {
				System.out.println("Not eligible ever!");
				System.exit(0);
			}
			
		}
	}
}


public class CustomExp {

	public static void main(String[] args) {
		LicenseOffice l = new LicenseOffice();
		l.initiate();

	}

}
