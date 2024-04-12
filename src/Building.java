public class Building {
    private String material;
    private String color;
    private int floors;
    private int serialNumber;

    public Building(String material, String color, int floors, int serialNumber) {
        this.material = material;
        this.color = color;
        this.floors = floors;
        this.serialNumber = serialNumber;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public String getMaterial() {
        return material;
    }
    public int getFloors() {
        return floors;
    }
    public String getColor() {
        return color;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return serialNumber == building.serialNumber;
    }
}
