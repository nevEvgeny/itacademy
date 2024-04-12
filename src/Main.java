public class Main {
    public static void main(String[] args) {


        Car newcar = new Car("GML", 630);
        System.out.println(newcar);

        Bus newbus = new Bus(5);
        Bus newbus1 = new Bus(5);
        System.out.println(newbus.equals(newbus1));

        Truckcar truckcar = new Truckcar("Volvo", 10);
        Truckcar truckcar1 = new Truckcar("Volvo", 10);
        System.out.println(truckcar.hashCode());
        System.out.println(truckcar1.hashCode());

        // call static method
        Bike.bikestore("Honda 320");

        Sweater sweater = Sweater.MEDIUM;
        System.out.println("size " + sweater.getSize() + ", cost " + sweater.getCost());

        //equals
        Building building = new Building("bricket", "yellow", 5, 235785);
        Building building1 = new Building("bricket", "green", 5, 235785);
        System.out.println(building.equals(building1));

        //hashCode
        House house = new House("wood", 255, 3);
        House house1 = new House("wood", 256, 3);
        System.out.println("What do they hashCodes have?");
        System.out.println(house.hashCode());
        System.out.println(house1.hashCode());

    }
}
