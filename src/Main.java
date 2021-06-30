import java.util.Scanner;

public class Main {
  public static void main(String[] arg){
    System.out.print("Enter the number is 1 to 10: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    if(number <= 5){
      System.out.println("Number is 1 to 5");
    }else{
      System.out.println("Number is 6 to 10");
    }

  }
}
