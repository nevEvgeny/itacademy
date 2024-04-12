import java.util.Objects;

public class Truckcar {
    String modelname;
    int age;

    public Truckcar(String modelname, int age) {
        this.modelname = modelname;
        this.age = age;
    }
    // Override hashCode
    @Override
    public int hashCode() {
        return Objects.hash(modelname, age);
    }
}
