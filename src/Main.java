import java.util.Scanner;

public class Main {
  public static void main(String[] arg){
    double studentGPA = 3.5;
    String studentFirstName = "Tharindu";
    String studentLastName = "Kavishna";
    System.out.println(studentFirstName + " " + studentLastName + " has a GPA " + studentGPA);

    Scanner input = new Scanner(System.in);
    studentGPA = input.nextDouble();
    System.out.println(studentGPA);
  }
}
