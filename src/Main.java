import java.util.Scanner;

public class Main {

  public static double yearSalary(double hoursPerWeek, double amountPerHour){
    double weeklyPayCheck  = hoursPerWeek * amountPerHour;
    return  weeklyPayCheck * 52;
  }

  public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    System.out.println("Number of hours the employee works per week: ");
    double weekHours = input.nextDouble();
    System.out.println("Amount of money the employee makes per hours: ");
    double moneyHours = input.nextDouble();
    double salary = yearSalary(weekHours, moneyHours);
    System.out.println(salary);
  }
}
