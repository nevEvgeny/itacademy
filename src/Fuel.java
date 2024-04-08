public interface Fuel {

    void fuelconsumption();

    // default method
    default  void fueltype() {
        System.out.println("biofuel");
    }
}
