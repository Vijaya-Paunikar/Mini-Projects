public class Main
{
	public static void main(String args[])
	{
		Teacher lizzy = new Teacher(id:1,name:"Lizzy",salary:500);
		Teacher mellisa = new Teacher(id:2,name:"Mellisa",salary:700);
		Teacher vanderhorn = new Teacher(id:3,name:"Vanderhorn",salary:600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);
		
		Student tamasha = new Student(id:1,name:"Tamasha",grade:4);
		Student rakshith = new Student(id:2,name:"Rakshith Vasudev",grade:12);
		Student rabbi = new Student(id:3,name:"Tamasha",grade:4);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);
		
		School ghs = new School(studentList,teacherList);
		
		tamasha.payFees(fees:5000);
		
		rakshith.payFees(fees:6000);
		System.out.println("GHS has earned "+ghs.getTotalMoneyEarned());
		
		System.out.println("------------ MAKING GHS PAY SALARY ----------------");
		
	}
}