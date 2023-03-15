import java.util.Scanner;

class Subject 
{
    private String subjectName;
    private int marks;

    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class Student 
{
    private String name;
    private int rollNumber;
    private Subject[] subjects;

    public Student(String name, int rollNumber, Subject[] subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
}

class Teacher 
{
    public void setMarks(Student student, Subject[] subjects) {
        Scanner scanner = new Scanner(System.in);
        for (Subject subject : subjects) {
            System.out.println("Enter marks for " + student.getName() + " in " + subject.getSubjectName() + ":");
            int marks = scanner.nextInt();
            subject.setMarks(marks);
        }
    }
}
public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		   Subject[] subjects = { new Subject("CoreJava", 0), new Subject("AdvanceJava", 0) };

	        Student[] students = { new Student("Sandeep", 1, subjects), new Student("Perumal", 2, subjects),
	                new Student("Mithlesh", 3, subjects), new Student("Amar", 4, subjects),
	                new Student("Swapnil", 5, subjects), new Student("Abhilash", 6, subjects),
	                new Student("Bhavesh", 7, subjects), new Student("Ankit", 8, subjects),
	                new Student("Guruprasad", 9, subjects), new Student("Surya", 10, subjects) };

	        Teacher teacher = new Teacher();

	        for (Student student : students) {
	            teacher.setMarks(student, student.getSubjects());
	        }

	        int totalMarks = 0;
	        int count = 0;
	        int maxMarks = 0;
	        int minMarks = Integer.MAX_VALUE;

	        for (Student student : students) {
	            Subject[] subjectsList = student.getSubjects();

	            for (Subject subject : subjectsList) {
	                totalMarks += subject.getMarks();
	                count++;

	                if (subject.getMarks() > maxMarks) {
	                    maxMarks = subject.getMarks();
	                }

	                if (subject.getMarks() < minMarks) {
	                    minMarks = subject.getMarks();
	                }
	            }
	        }

	        double averageMarks = (double) totalMarks / count;

	        System.out.println("Average marks: " + averageMarks);
	        System.out.println("Max marks: " + maxMarks);
	        System.out.println("Min marks: " + minMarks);

	}

}
