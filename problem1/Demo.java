// Demo class to test Person, Student, Teacher, and CollegeStudent classes
public class Demo {
    public static void main(String[] args) {
        // Creating objects for Person, Student, Teacher, and CollegeStudent
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooke", 22, "F", "HS95129", 3.5);
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Duke Java", 37, "M", "Computer Science", 80000);
        System.out.println(mrJava);

        Teacher missPython = new Teacher("Soo-hyun Python", 27, "F", "Math", 72000);
        System.out.println(missPython);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
