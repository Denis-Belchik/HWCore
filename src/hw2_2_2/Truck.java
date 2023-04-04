package hw2_2_2;

public class Truck extends Transport implements CheckEngine, CheckTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        checkType();
        checkTrailer();
        checkEngine();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}