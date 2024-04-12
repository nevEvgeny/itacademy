public class Bus {
    int doornumber;

    public Bus(int doornumber) {
        this.doornumber = doornumber;
    }
    // Override equals
    @Override
    public boolean equals(Object obj) {
        Bus otherBus = (Bus) obj;
        return this.doornumber == otherBus.doornumber;
    }
}
