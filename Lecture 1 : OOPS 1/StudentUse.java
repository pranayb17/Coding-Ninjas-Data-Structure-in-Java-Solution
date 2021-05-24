public class StudentUse {

	public static void main(String[] args) {
		
		Student s1=new Student("Bodhi",53,88);
		Student s2=new Student("Pranay",55,79);
		Student s3=new Student("Vaibhav");
		Student s4=new Student("Pradip",77);
		
		System.out.println(Student.getCountStudents()); 
		// static functions/attribute are class bounded attributes they are not dependent on objects.
		

		

	}

}
