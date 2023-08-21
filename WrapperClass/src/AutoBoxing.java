class AutoBoxing{
	
	static Integer i =100;
	public static void main(String[] args) {
		AutoBoxing a = new AutoBoxing();
		int i1 = i; // --- auto unboxing -> int i1 =i.intValue()
		a.m1(i1);
	}
	public static void m1(Integer i1) {
		int j = i1;
		System.out.println(j);
	}
}
