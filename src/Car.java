public class Car{
    String model;
    int modelnumber;

    public Car(String model, int modelnumber) {
        this.model = model;
        this.modelnumber = modelnumber;
    }
    // Override toString
    @Override
    public String toString() {
        return model + " " + modelnumber;
    }

}


