package hw2_2_2;

public abstract class TransportEngine extends Transport{

    public TransportEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
}
