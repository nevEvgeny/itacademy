public class House {
    private String materialwood;
    private int colornumber;
    private int floor;


    public House(String materialwood, int colornumber, int floor) {
        this.materialwood = materialwood;
        this.colornumber = colornumber;
        this.floor = floor;
    }
    public String getMaterialwood() {
        return materialwood;
    }
    public int getColornumber() {
        return colornumber;
    }
    public int getFloor() {
        return floor;
    }
    @Override
    public int hashCode() {
        int result = materialwood == null ? 0 : materialwood.hashCode();
        result = 31 * result + colornumber;
        result = 31 * result + floor;
        return result;
    }

}
