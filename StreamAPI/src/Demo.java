import java.util.*;
import java.util.stream.*;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		System.out.println(al);
		
		/*
		ArrayList<Integer> evenNo = new ArrayList<Integer>();
	
		for(Integer i:al)
			if(i%2 == 0)
				evenNo.add(i);
		System.out.println(evenNo);		
		*/
		
		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
		l.forEach(System.out::println);
		
	}

}
