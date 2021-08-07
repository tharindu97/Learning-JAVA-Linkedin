class OOPTest {
    public static void main(String[] args) {
        Human human = new Human();
    }
}

class Human{
   private int age;
   private String name;

   public void setAge(int age){
       if(age>0){
           this.age = age;
       }else {
           System.out.println("You Cant assign minuus or zero as age!!!");
       }
   }

   public int getAge(){
       return age;
   }

}
