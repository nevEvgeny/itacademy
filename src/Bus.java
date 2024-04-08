public class Bus implements Fuel, EngineInfo {

    @Override
    public void fuelconsumption() {
        System.out.println("35 liters / 100 km");
    }

    @Override
    public void fueltype() {
        System.out.println("Disel");
    }

    @Override
    public void valvemodel() {
        System.out.println("Skk180");
    }

    @Override
    public  void engineDesign() {
        System.out.println("valves per cylinder is 4");
    }
}
