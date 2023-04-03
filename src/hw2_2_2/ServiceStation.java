package hw2_2_2;

public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        if (transport instanceof UpdateTyre) {
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                ((UpdateTyre) transport).updateTyre();
            }
        }
        if (transport instanceof CheckTrailer)
            ((CheckTrailer) transport).checkTrailer();
        if (transport instanceof CheckEngine)
            ((CheckEngine) transport).checkEngine();
    }
}