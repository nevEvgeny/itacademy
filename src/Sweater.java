public enum Sweater {
    SMALL("Small", 35),
    MEDIUM("Medium", 40),
    LARGE("Large", 45);

    private String size;
    private int cost;

    private Sweater(String size,int cost) {
        this.size = size;
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }
    public int getCost() {
        return cost;
    }

}
