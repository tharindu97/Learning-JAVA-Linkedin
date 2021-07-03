import java.util.Scanner;

public class Main {

  public static void main(String[] arg){
    Triangle triangleA = new Triangle(15,8, 15, 8, 10);
    Triangle triangleB = new Triangle(3, 2.598, 3, 3, 10);
    System.out.println(triangleA.findArea());
  }

}
