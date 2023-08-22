import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(25);
		al.add(35);
		al.add(15);
		al.add(30);
		System.out.println("Before Sorting:"+al);
		
		List<Integer> res = al.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sorting:"+res);
		
		List<Integer> custRes = al.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		List<Integer> custRes1 = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println("After sorting:"+custRes);
		System.out.println("After sorting:"+custRes1);
		

	}

}
