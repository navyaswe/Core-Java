import java.util.*;
import java.util.stream.*;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("AIML");
		System.out.println(al);
		
		List<String> l = al.stream().filter(name->name.length()>3).collect(Collectors.toList());
		System.out.println(l.size());
		long count = l.stream().filter(name->name.length()>3 ).count();
		
		System.out.println("No of objects whose length is >3:"+count);
		
		
		
	}

}
