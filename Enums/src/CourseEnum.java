enum Course{
	JAVA, PYTHON, APEX;
	int courseId;
	void setCourseId(int cid) {
		this.courseId = cid;
	}
	int getCourseId() {
		return courseId;
	}
	Course(){
		System.out.println("Course Constructor");
	}
}
public class CourseEnum {

	public static void main(String[] args) {
		Course.JAVA.setCourseId(5);
		int id1 = Course.JAVA.getCourseId();
		System.out.println(id1);
		
		Course.PYTHON.setCourseId(8);
		int id2 = Course.PYTHON.getCourseId();
		System.out.println(id2);
		
		Course.APEX.setCourseId(10);
		int id3 = Course.APEX.getCourseId();
		System.out.println(id3);
		
	}

}
