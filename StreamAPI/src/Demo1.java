import java.util.*;
import java.util.stream.*;

public class Demo1 {

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
		ArrayList<Integer> double = new ArrayList<Integer>();
	
		for(Integer i:al)
			if(i%2 == 0)
				double.add(i);
		System.out.println(evenNo);		
		*/
		
		List<Integer> l = al.stream().map(obj->obj*2).collect(Collectors.toList());
		System.out.println(l);
		
		l.forEach(i->System.out.println(i));
		System.out.println();
		
		l.forEach(System.out::println);
		
	}

}