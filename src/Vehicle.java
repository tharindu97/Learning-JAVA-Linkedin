public class Vehicle {
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
