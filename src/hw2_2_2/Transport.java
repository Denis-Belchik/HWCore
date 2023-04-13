package hw2_2_2;

public abstract class Transport implements Service {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void checkType(){
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

}