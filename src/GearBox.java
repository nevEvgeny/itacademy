public interface GearBox {

    void gearboxtype();

    // default method
    default  void speedtransmission() {
        System.out.println("5 speed transmission");
    }
}
