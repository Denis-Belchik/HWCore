import hw2_2.*;
import hw2_2_2.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }

    private static void hw2_2_2(){
        ServiceStation station = new ServiceStation();
        Transport[] transports = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck1", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        for (Transport transport : transports) {
            station.check(transport);
        }
    }

    private static void hw2_2() {
        Gryffindor[] gryffindors = new Gryffindor[]{
                new Gryffindor("Гарри Поттер", random(), random(), random(), random(), random()),
                new Gryffindor("Гермиона Грейнджер", random(), random(), random(), random(), random()),
                new Gryffindor("Рон Уизли", random(), random(), random(), random(), random()),
        };

        Slytherin[] slytherins = new Slytherin[]{
                new Slytherin("Драко Малфой", random(), random(), random(), random(), random(), random(), random()),
                new Slytherin("Грэхэм Монтегю", random(), random(), random(), random(), random(), random(), random()),
                new Slytherin("Грегори Гойл", random(), random(), random(), random(), random(), random(), random()),
        };

        Hufflepuff[] hufflepuffs = new Hufflepuff[]{
                new Hufflepuff("Захария Смит", random(), random(), random(), random(), random()),
                new Hufflepuff("Седрик Диггори", random(), random(), random(), random(), random()),
                new Hufflepuff("Джастин Финч-Флетчли", random(), random(), random(), random(), random()),
        };

        Ravenclaw[] ravenclaws = new Ravenclaw[]{
                new Ravenclaw("Чжоу Чанг", random(), random(), random(), random(), random(), random()),
                new Ravenclaw("Падма Патил", random(), random(), random(), random(), random(), random()),
                new Ravenclaw("Маркус Белби", random(), random(), random(), random(), random(), random()),
        };

        for (Slytherin slytherin : slytherins) {
            slytherin.printStudent();
        }

        ravenclaws[0].bestStudentHogwarts(hufflepuffs[0]);
        slytherins[0].bestStudentFaculty(slytherins[1]);
    }

    private static int random() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }
}