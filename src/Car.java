public class Car implements GearBox {

    @Override
    public void gearboxtype() {
        System.out.println("Automatic");
    }

    @Override
    public void speedtransmission() {
        int r = 10;
        System.out.println(r + "speed transmission");
    }
}
