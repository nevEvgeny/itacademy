public interface EngineInfo {

    void valvemodel();

    // default method
    default  void engineDesign() {
        System.out.println("valves per cylinder is 2");
    }
}
