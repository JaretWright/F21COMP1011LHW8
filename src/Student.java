import java.util.HashMap;

public class Student {
    private String firstName, lastName;
    private int studentNum;
    private HashMap<String,Integer> courses;

    public Student(String firstName, String lastName, int studentNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNum = studentNum;
        this.courses = new HashMap<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public HashMap<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(HashMap<String, Integer> courses) {
        this.courses = courses;
    }

    public void addCourse(String courseCode, int finalGrade)
    {
        if (courseCode.matches("[A-Z]4\\d4") && finalGrade>=0 && finalGrade<=100)
            courses.put(courseCode, finalGrade);
        else
            throw new IllegalArgumentException("course code must be ABCD1234 and grade must be 0-100");
    }

    public String toString()
    {
        return String.format("%d %s %s",studentNum, firstName, lastName);
    }

    public int hashCode()
    {
        return studentNum;
    }

    public boolean equals(Object object)
    {
        if (object==null)
            return false;

        if (object.getClass().equals(Student.class))
            return this.studentNum == ((Student) object).getStudentNum();

        return false;
    }
}
