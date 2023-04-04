package hw2_2_2;

public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.service();
    }
}