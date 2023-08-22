import java.util.*;

class Emp implements Comparable{
	String name;
	int eid;
	Emp(String name, int eid){
		this.name = name;
		this.eid = eid;
		
	}
	public String toString() {
		return name + " " + eid;
	}
	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Emp e = (Emp)obj;
		int eid2 = e.eid;
		if(eid1 < eid2)
			return -1;
		else if(eid1 > eid2)
			return 1;
		else
			return 0;
			
		}
}
public class EmployeeClass {

	public static void main(String[] args) {
		Emp e1 = new Emp("aaa", 1001);
		Emp e2 = new Emp("bbb", 1010);
		Emp e3 = new Emp("ccc", 1005);
		Emp e4 = new Emp("ddd", 1015);
		
		TreeSet ts1 = new TreeSet(new MyComparator1());
			ts1.add(e1);
			ts1.add(e2);
			ts1.add(e3);
			ts1.add(e4);
			
		}

	}
class MyComparator1 implements Comparator{
	public int compare(Object obj1, Object obj2) {
		Emp e1 = (Emp)obj1;
		Emp e2 = (Emp)obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
				
	}
	
}


