import java.util.Scanner;

public class Main {
  public static void main(String[] arg){

    String question = "3+7?";
    String choiceOne = "1";
    String choiceTwo = "10";
    String choiceThree = "100";
    String correctAnswer = choiceTwo;

    System.out.println(question);
    System.out.println("1."+ choiceOne + "\n2." + choiceTwo + "\n3." + choiceThree);

    System.out.print("Input Answer is?(1,2ot3): ");
    Scanner input = new Scanner(System.in);
    String answer = input.next();

    if(answer.equals("2")){
      System.out.println("Congarts!!!!!!!!!!!!!");
    }else {
      System.out.println("input does not match, correct answer is " + correctAnswer);
    }

  }
}
