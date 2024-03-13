// Teacher class represents a teacher, extending Person class
class Teacher extends Person {
    private String subject; // Subject taught by the teacher
    private double salary; // Teacher's annual salary

    // Constructor to initialize inherited fields from Person and new fields for Teacher
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getter method for subject
    public String getSubject() {
        return subject;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

  // toString method to represent the Teacher object as a string
    public String toString() {
    return super.toString() + ", subject: " + subject + ", salary: $" + salary;
    }

}
