public class Vehicle {

    Vehicle(){
        System.out.println("Constractur!!!!!!!!!!!!!");
    }

    Vehicle(String model, int modelYear) {
        this();
        this.model = model;
        this.modelYear = modelYear;
    }

    //    Properties -> field / data
    String model;
    int modelYear;

    //    Behaviors -> methods
    void setModel(String value){
        model = value;
    }

    void setModelYear(int value){
        modelYear = value;
    }

    String getModel(){
        return  model;
    }

    int getModelYear(){
        return  modelYear;
    }

    void accellerate(){
        System.out.println("accellerating");
    }
}
