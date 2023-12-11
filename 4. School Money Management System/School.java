import java.util.List;
public class School
{
	private List<Teacher> teachers ;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> students)
	{
		this.teachers=teachers;
		this.students=students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
		
		//Return the list of teachers in the school
		public List<Teacher> getTeachers()
		{
			return teachers;
		}
		
		public void addTeacher(Teacher teacher)
		{
			teachers.add(teacher);
		}
		
		//return the list of students in the school
		public List<Student> getStudents()
		{
			return students;
		}
		
		public void addTeacher(Student student)
		{
			students.add(student);
		}
		
		//Return the total money earned by the school
		public int getTotalMoneyEarned()
		{
			return totalMoneyEarned;
		}
		
		public static void updateTotalMoneyEarned(int MoneyEarned)
		{
			totalMoneyEarned += MoneyEarned;
		}
		
		//Return the total money spent by the school
		public int getTotalMoneySpent()
		{
			return totalMoneySpent;
		}
		
		public void updateTotalMoneySpent(int MoneySpent)
		{
			totalMoneyEarned = totalMoneyEarned-MoneySpent;
		}
	}
}