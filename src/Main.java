public class Main {

  public static void main(String[] arg){
    StudentProfile profileOne = new StudentProfile("Tharindu", "Kavishna", "SE", 3.75, 2021);
    StudentProfile profileTwo = new StudentProfile("Tharindu", "Kavishna", "SE", 3.75, 2021);

    profileTwo.incrementExpectedGraduatedYear();
    System.out.println(profileTwo.expectedYerToGraduationYear);
  }

}
