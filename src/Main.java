public class Main {

  public static void main(String[] arg){

    Vehicle v1 = new Vehicle();
    v1.model = "Toyota";
    v1.modelYear = 2010;
    v1.accellerate();
    System.out.println(v1.model);
    System.out.println(v1.modelYear);
  }

}
