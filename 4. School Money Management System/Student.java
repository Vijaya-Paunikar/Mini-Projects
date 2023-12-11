/* 
This class is responsible for keeping the track of students id,name,grade&fees 
*/
class Student
{
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	//To create a new student object by initializing the value
	public Student(int id, String name, int grade)
	{
		feesPaid=0;
		feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	//Not going to alter student's name, student's id.
	
	//Used to update the student's grade
	public void setGrade(int grade)
	{
		this.grade=grade;
	}
	
	//Used to update feespaid
	public void payFees(int fees)
	{
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	//Return the id of the student
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public int getFeesPaid()
	{
		return feesPaid;
	}
	
	public int getFeesTotal()
	{
		return feesTotal;
	}
	
	public int getRemainingFees()
	{
		return feesTotal-feesPaid;
	}
	
	
}