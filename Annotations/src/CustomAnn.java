import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Library{

	String name() default "KLM" ;
	int books() default 1000;
}
@Library(name="KLM",books=1000)
class Virat{
	int innings;
	String name;
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class CustomAnn {

	public static void main(String[] args) {
		Virat v = new Virat();
		v.setInnings(300);
		v.setName("vk");
		System.out.println(v.getName());
        System.out.println(v.getInnings());
	}

}
