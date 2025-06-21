package SingletonPattern;

public class Student_SingletonPattern 
{
    private static Student_SingletonPattern Student;
    private Student_SingletonPattern() {
        System.out.println("Object created for Student_SingletonPattern class");
    }
    public static Student_SingletonPattern getStudent() {
        if(Student == null) {
            Student = new Student_SingletonPattern(); // object created only once
        }
        return Student;
    }
    public void display() {
        System.out.println("I am the Student_SingletonPattern class Object");
    }
}
