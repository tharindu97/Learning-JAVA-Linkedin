public class StudentProfile {
    String firstName;
    String lastName;
    String declareMajor;
    double gpa;
    int expectedYerToGraduationYear;

    public StudentProfile(String firstName, String lastName, String declareMajor, double gpa, int expectedYerToGraduationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declareMajor = declareMajor;
        this.gpa = gpa;
        this.expectedYerToGraduationYear = expectedYerToGraduationYear;
    }

    public void incrementExpectedGraduatedYear(){
        this.expectedYerToGraduationYear = this.expectedYerToGraduationYear + 1;
    }

}
