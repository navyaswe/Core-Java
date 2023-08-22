import java.util.*;

public class CollectionClass {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(null);
		System.out.println(al);
		al.add(2, 40);
		al.contains(20);
		al.ensureCapacity(10);
		ArrayList al1 = new ArrayList();
		al.addAll(al1);
		System.out.println(al1);
		al1.clone();
		System.out.println(al1);
		
		LinkedList l = new LinkedList();
		l.add(100);
		l.addFirst(50);
		l.add(200);
		l.addLast(250);
		l.add("Java");
		System.out.println(l);
		l.getClass();
		
		
		TreeSet ts = new TreeSet();
		ts.addAll(al);
		ts.ceiling(35);
		ts.higher(40);
		ts.floor(15);
		ts.lower(20);
		System.out.println(ts);
		
		HashMap h = new HashMap();
		h.put(10,"value");
		h.put(h, al1);
		System.out.println(h);
		
		
		
		
		
		
	
		
	}

}

