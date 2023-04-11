package hw2_2_2;

public class Car extends Transport implements CheckEngine{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        checkType();
        checkEngine();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}