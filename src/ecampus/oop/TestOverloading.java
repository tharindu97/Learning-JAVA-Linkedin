package ecampus.oop;

public class TestOverloading {
    public static void main(String[] args) {
        Van van = new Van();
        van.sum(2,2);
        van.sum(2,2,2);
    }
}

class Van{
    int sum(int a, int b){
        return  a + b;
    }
    int sum(int a, int b, int c){
        return  a + b + c;
    }
}
