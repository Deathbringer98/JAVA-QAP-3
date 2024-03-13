// Student class represents a student, extending Person class
class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average

    // Constructor to initialize inherited fields from Person and new fields for Student
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter method for student ID
    public String getIdNum() {
        return myIdNum;
    }

    // Getter method for GPA
    public double getGPA() {
        return myGPA;
    }

    // Setter method for student ID
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    // Setter method for GPA
    public void setGPA(double gpa) {
        myGPA = gpa;
    }
    // toString method to represent the Student object as a string
public String toString() {
    return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
}
}
