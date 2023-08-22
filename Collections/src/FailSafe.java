import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class FailSafe {

	
	public static void main(String[] args) {
		CopyOnWriteArrayList c = new CopyOnWriteArrayList();
		c.add(10);
		c.add(5);
		c.add(15);
		c.add(20);
		Iterator it = (Iterator) c.iterator();
		while(((java.util.Iterator) it).hasNext()) {
			System.out.println(((java.util.Iterator) it).next());
			c.add(30);
			
		}
		

	}

}
