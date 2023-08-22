
import java.util.*;
import java.util.stream.*;

public class Sample {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		System.out.println("Array List:"+al);
		
		Object[] objArr = al.stream().toArray();
		for(Object obj:objArr)
			System.out.print(obj);
		System.out.println();
		
		Integer[] intArr = al.stream().toArray(Integer[]::new);
		for(Integer i:intArr)
			System.out.print(i);
				
		
	}

}
