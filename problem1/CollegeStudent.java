// CollegeStudent class represents a college student, extending Student class
class CollegeStudent extends Student {
    private String major; // Student's major
    private int year; // Student's year in college

    // Constructor to initialize inherited fields from Student and new fields for CollegeStudent
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getter method for major
    public String getMajor() {
        return major;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }

    // Setter method for major
    public void setMajor(String major) {
        this.major = major;
    }

    // Setter method for year
    public void setYear(int year) {
        this.year = year;
    }

    // toString method to represent the CollegeStudent object as a string
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
