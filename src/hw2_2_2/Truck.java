package hw2_2_2;

public class Truck extends TransportEngine {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        checkType();
        checkTrailer();
        checkEngine();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}