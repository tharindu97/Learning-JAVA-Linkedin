package ecampus.oop;

public class TestOverride {
    public static void main(String[] args) {
        Profile student = new Student();
        Profile teacher = new Teacher();
        student.eat();
        teacher.eat();
    }
}

class Profile{
    void eat(){
        System.out.println("Profile Eat......");
    }
}

class Student extends Profile{
    void eat(){
        System.out.println("Student Eat......");
    }
}

class Teacher extends Profile{
    void eat(){
        System.out.println("Teacher Eat......");
    }
}

