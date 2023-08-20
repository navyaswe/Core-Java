
public class Student {

	
		private String name;
		private int number;
		private String branch;
		
		void setName(String name) {
			this.name = name;
		}
		
		String getName() {
			return name;
		}
		
		void setNumber(int number) {
			this.number = number;
		}
		
		int getNumber() {
			return number;
		}
		
		void setBranch(String branch) {
			this.branch = branch;
		}
		
		String getBranch() {
			return branch;
		}

		public static void main(String[] args) {
			Student s = new Student();
			s.setName("Mithila");
			System.out.println(s.getName());
			s.setNumber(25);
			System.out.println(s.getNumber());
			s.setBranch("CS");
			System.out.println(s.getBranch());
			
	}

}
