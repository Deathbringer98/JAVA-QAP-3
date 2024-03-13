// Person class represents a generic person with name, age, and gender
class Person {
    protected String myName; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female

    // Constructor to initialize name, age, and gender
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getter method for name
    public String getName() {
        return myName;
    }

    // Getter method for age
    public int getAge() {
        return myAge;
    }

    // Getter method for gender
    public String getGender() {
        return myGender;
    }

    // Setter method for name
    public void setName(String name) {
        myName = name;
    }

    // Setter method for age
    public void setAge(int age) {
        myAge = age;
    }

    // Setter method for gender
    public void setGender(String gender) {
        myGender = gender;
    }

    // toString method to represent the Person object as a string
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
