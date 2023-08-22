import java.util.*;
import java.util.Iterator;

public class Iterator {

	public static void main(String[] args) {
	
		TreeSet ts = new TreeSet();
		ts.add(400);
		ts.add(500);
		
		
		Iterator it = (Iterator) ts.iterator();
		while(((java.util.Iterator) it).hasNext() == true) {
			Integer i = (Integer)((java.util.Iterator) it).next();
			System.out.println("Array Deque"+i);
		}
		
		LinkedList l = new LinkedList();
		l.addAll(ts);
		System.out.println(l);
		
		ListIterator l1 = l.listIterator(l.size());
		System.out.println("TreeSet data in ascending order:"+l1);
		
		while(l1.hasPrevious())
			System.out.println(l1.previous());
	}

	}
