// Attributes
class Student {
String name;
int age;
double gpa;

// Constructor: To store the values from users
 Student(String studentName,int studentAge  ,double studentGpa) { 
    name= studentName;
    age=studentAge;
    gpa=studentGpa;
    }

//Methods
public void displayInfo() {
    System.out.print ("Name: " + name  );
    System.out.print ("Age: " +  age   );
    System.out.print ("GPA: " +  gpa   );
    }

//Another Methods
public void study() {
        System.out.print(name + " is studying.");
    }

//Yet Another Methods
public void takeExam() {
         System.out.print(name + " is taking an exam.");
    }

}