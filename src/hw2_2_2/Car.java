package hw2_2_2;

public class Car extends TransportEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        checkType();
        checkEngine();
    }
}