
public class TestClass {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer i1 = new Integer("10");
		//Integer i2 = new Integer("Ten"); -- Exception 
		
		Double d1 = new Double(10.9);
		Double d2 = new Double("10.9");
		
		Float f1 = new Float(10.7f);
		Float f2 = new Float("10.7f");
		Float f3 = new Float("10.7"); //valid
		
		Boolean b1 = new Boolean("Yes");
		Boolean b2 = new Boolean("No");
		System.out.println(b1); //false
		System.out.println(b2);  //false
		System.out.println(b1.equals(b2)); //false
		System.out.println(b1 == b2);
		
		 
			Integer i3 = Integer.valueOf("100",2); //binary representation of value 100
			System.out.println(i3);
			
			Character ch = new Character('a');
			char ch1 = ch.charValue();
			System.out.println(ch1); //a
			
			int a = Integer.parseInt("10");
			System.out.println(a); //10
			
			String s = Integer.toString(10);
			System.out.println(s); //10
			
			String s1 = Boolean.toString(true);
			System.out.println(s1);//true
			
			String s2 = Character.toString('z');
			System.out.println(s2);//z
			
			String str = Integer.toBinaryString(a);
			System.out.println(str);
			
			String str1 = Integer.toOctalString(a);
			System.out.println(str1);
			
		
		
		}

}
