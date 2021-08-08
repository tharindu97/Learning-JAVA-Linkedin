package ecampus.oop;

public class TestOverride {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
    }
}

class Profile{
    void eat(){
        System.out.println("Profile Eat......");
    }
}

class Student extends Profile{
    int age;
    void eat(){
        super.eat();
        System.out.println("Student Eat......");
    }
}

