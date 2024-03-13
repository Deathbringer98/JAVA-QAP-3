### Problem #1: Class Inheritance and Method Implementation

#### Description:
This Java program demonstrates class inheritance and method implementation. It includes a hierarchy of classes representing people, students, teachers, and college students. Each class has specific attributes and methods, such as name, age, gender, and GPA. The program also includes a testing class to create instances of each class and print their details.

#### Files Included:
1. `Person.java`: Defines the base class `Person` with attributes and methods for name, age, and gender.
2. `Student.java`: Extends the `Person` class to represent students, with additional attributes for student ID and GPA.
3. `Teacher.java`: Extends the `Person` class to represent teachers, with additional attributes for subject and salary.
4. `CollegeStudent.java`: Extends the `Student` class to represent college students, with additional attributes for major and year.
5. `Demo.java`: Testing class to create instances of the above classes and print their details.

#### How to Run:
Compile all Java files and run the `Demo` class.

```bash
javac Person.java Student.java Teacher.java CollegeStudent.java Demo.java
java Demo
```

### Problem #2: Shape Hierarchy with Abstract Class and Interfaces

#### Description:
This Java program implements a hierarchy of shapes using abstract classes and interfaces. It includes classes for shapes such as circle, ellipse, triangle, and equilateral triangle. Each shape has methods to compute its area and perimeter. Additionally, the program introduces an interface `Scalable` to allow scaling of shapes by a factor.

#### Files Included:
1. `Shape.java`: Abstract class defining common attributes and methods for shapes.
2. `Circle.java`: Concrete class representing circles and implementing the `Scalable` interface.
3. `Ellipse.java`: Concrete class representing ellipses and implementing the `Scalable` interface.
4. `Triangle.java`: Concrete class representing triangles and implementing the `Scalable` interface.
5. `EquilateralTriangle.java`: Specialized class for equilateral triangles, extending the `Triangle` class.
6. `Scalable.java`: Interface defining a method for scaling shapes.
7. `Demo.java`: Testing class to create instances of shapes, scale them, and print their details.

#### How to Run:
Compile all Java files and run the `Demo` class.

```bash
javac Shape.java Circle.java Ellipse.java Triangle.java EquilateralTriangle.java Scalable.java Demo.java
java Demo
```

### Problem #3: Interface Implementation for Scalable Shapes

#### Description:
This Java program extends the shape hierarchy implemented in Problem #2 to include the ability to scale shapes. It introduces the `Scalable` interface with a `scale` method and implements it in the shape classes. Additionally, the program provides a static method in the testing class to scale arrays of shapes.

#### Files Included:
Same as Problem #2, with additional implementation of the `scale` method in shape classes.

#### How to Run:
Compile all Java files and run the `Demo` class.

```bash
javac Shape.java Circle.java Ellipse.java Triangle.java EquilateralTriangle.java Scalable.java Demo.java
java Demo
```

### Problem #4: Implementation of Interface for Scaling Shapes

#### Description:
This Java program demonstrates the implementation of interfaces for scaling shapes. It extends the shape hierarchy from Problem #3 and includes a method in the testing class to scale arrays of shapes by a given factor. The `Scalable` interface is utilized to achieve this functionality.

#### Files Included:
Same as Problem #3.

#### How to Run:
Compile all Java files and run the `Demo` class.

```bash
javac Shape.java Circle.java Ellipse.java Triangle.java EquilateralTriangle.java Scalable.java Demo.java
java Demo
```
\\ Author: Matthew Menchinton
