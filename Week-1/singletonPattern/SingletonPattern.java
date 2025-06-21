package SingletonPattern;

public class SingletonPattern {

    public static void main(String args[]) 
    {
        Student_SingletonPattern s1 = Student_SingletonPattern.getStudent();
        s1.display();
        Student_SingletonPattern s2 = Student_SingletonPattern.getStudent();
        s2.display();
        if(s1 == s2) {
            System.out.println("Singleton Pattern is working");
        } else {
            System.out.println("Singleton Pattern is not Working");
        }
    }
}
